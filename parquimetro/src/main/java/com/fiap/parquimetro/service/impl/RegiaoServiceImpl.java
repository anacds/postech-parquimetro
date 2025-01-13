package com.fiap.parquimetro.service.impl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fiap.parquimetro.model.Regiao;
import com.fiap.parquimetro.repository.RegiaoRepository;
import com.fiap.parquimetro.service.RegiaoService;

@Service
public class RegiaoServiceImpl implements RegiaoService{
	
	private final MongoTemplate mongoTemplate;

	@Autowired
	private RegiaoRepository regiaoRepository;
	
	public RegiaoServiceImpl(MongoTemplate mongoTemplate) {
		this.mongoTemplate = mongoTemplate;
	}
	
	@Override
	public List<Regiao> obterTodos() {
		return  regiaoRepository.findAll();
	}

	@Override
	public List<Regiao> obterPorZona(String zona) {
		Query query = new Query();
		if(zona != null && !(zona.equals(""))) {
			query.addCriteria(Criteria.where("vaga.zona").is(zona));
		}
		return mongoTemplate.find(query, Regiao.class);
	}

	@Override
	public Regiao obterPorId(String id) {
		return regiaoRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("Região não existe"));
	}

	@Override
	public void excluirRegiao(String id) {
		regiaoRepository.deleteById(id);
		
	}

	@Override
	public Regiao criar(Regiao regiao) {
		regiao.setDataCriacao(LocalDateTime.now());
		regiao.setDataUltimaAtualizacao(LocalDateTime.now());
		return regiaoRepository.save(regiao);
	}

	@Override
	public ResponseEntity<?> alterarRegiao(String id, Regiao regiao) {
		Regiao regiaoEscolhida = regiaoRepository.findById(id).orElseThrow(()-> new IllegalArgumentException());
		if(regiaoEscolhida == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		
		regiao.setDataUltimaAtualizacao(LocalDateTime.now());
		regiaoRepository.save(regiao);
		return ResponseEntity.status(HttpStatus.OK).build();
		
	}
	

}
