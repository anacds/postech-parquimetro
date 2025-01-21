package com.fiap.parquimetro.service.impl;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.fiap.parquimetro.model.Regiao;
import com.fiap.parquimetro.model.Vaga;
import com.fiap.parquimetro.repository.VagaRepository;
import com.fiap.parquimetro.service.VagaService;

@Service
public class VagaServiceImpl implements VagaService{

	private final MongoTemplate mongoTemplate;
	
	@Autowired
	private VagaRepository vagaRepository;
	
	public VagaServiceImpl(MongoTemplate mongoTemplate) {
		this.mongoTemplate = mongoTemplate;
	}

	@Override
	public List<Vaga> obterTodas() {
		return this.vagaRepository.findAll();
	}
	
	@Override
	public List<Vaga> obterPorNumeroERegiao(Optional<String> nomeRegiao, Optional<String> numero) {
		Query query = new Query();
		
		nomeRegiao.ifPresent(nome -> query.addCriteria(Criteria.where("vaga.regiao.nome").is(nome)));
		numero.ifPresent(num -> query.addCriteria(Criteria.where("vaga.numero").is(Integer.valueOf(num))));
		
		return mongoTemplate.find(query, Vaga.class);
	}

	@Override
	public Vaga obterPorId(String id) {
		return this.vagaRepository
				.findById(id)
				.orElseThrow(()-> new IllegalArgumentException("Vaga não existe."));
	}
	
	@Override
	public Vaga criar(Vaga vaga) {
		if(vaga.getRegiao() != null) {
			vaga.setRegiaoId(vaga.getRegiao().getId());
		}

		vaga.setDataCriacao(LocalDateTime.now());
		vaga.setDataUltimaAtualizacao(LocalDateTime.now());
		return vagaRepository.save(vaga);
		
	}

	@Override
	public void excluirVaga(String id) {
		vagaRepository.deleteById(id);
	}

	@Override
	public ResponseEntity<?> alterarVaga(String id, Vaga vaga) {
		Vaga vagaEscolhida = vagaRepository.findById(id).orElseThrow(()-> new IllegalArgumentException());
		if(vagaEscolhida == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Vaga não encontrada");
		}
		vaga.setDataUltimaAtualizacao(LocalDateTime.now());
		vagaRepository.save(vaga);
		return ResponseEntity.status(HttpStatus.OK).build();
	}

	public ResponseEntity<?> alterarDisponibilidade(String id) {
		Vaga vaga = vagaRepository.findById(id).orElseThrow(() -> new IllegalArgumentException());
		if(vaga == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Vaga não encontrada");
		}
		vaga.setDisponivel(!vaga.isDisponivel());
		vaga.setDataUltimaAtualizacao(LocalDateTime.now());
		vagaRepository.save(vaga);
		return ResponseEntity.status(HttpStatus.OK).build();

	}
	
}
