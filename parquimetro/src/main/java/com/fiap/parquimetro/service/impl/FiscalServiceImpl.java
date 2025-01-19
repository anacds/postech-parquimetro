package com.fiap.parquimetro.service.impl;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fiap.parquimetro.model.Fiscal;
import com.fiap.parquimetro.model.Usuario;
import com.fiap.parquimetro.repository.FiscalRepository;
import com.fiap.parquimetro.repository.UsuarioRepository;
import com.fiap.parquimetro.service.FiscalService;

@Service
public class FiscalServiceImpl implements FiscalService{


	@Autowired
	private FiscalRepository fiscalRepository;
	
	@Override
	public List<Fiscal> obterTodos() {
		return this.fiscalRepository.findAll();
	}

	@Override
	public Fiscal obterPorId(String id) {
		return this.fiscalRepository
				.findById(id)
				.orElseThrow(()-> new IllegalArgumentException("O Id não está associado a nenhum fiscal!"));
	}

	@Override
	public Fiscal criar(Fiscal fiscal) {
		Fiscal fiscalExistente = fiscalRepository.findByCpf(fiscal.getCpf());
		if (fiscalExistente != null) {
            throw new RuntimeException("Já existe um fiscal cadastrado com este CPF: " + fiscal.getCpf());
        }	
		fiscal.setDataCriacao(LocalDateTime.now());
		fiscal.setDataUltimaAtualizacao(LocalDateTime.now());
		return this.fiscalRepository.save(fiscal);
	}
	
	  @Override
	    public Fiscal atualizar(String id, Fiscal fiscalAtualizado) {
	        Optional<Fiscal> fiscalExistente = fiscalRepository.findById(id);

	        if (fiscalExistente.isPresent()) {
	            Fiscal fiscal = fiscalExistente.get();
	            
				fiscal.setOrgao(fiscalAtualizado.getOrgao());
	            fiscal.setNome(fiscalAtualizado.getNome());
	            fiscal.setCnpj(fiscalAtualizado.getCnpj());
				fiscal.setCpf(fiscalAtualizado.getCpf());
	            fiscal.setEmail(fiscalAtualizado.getEmail());
	            fiscal.setNumeroCelular(fiscalAtualizado.getNumeroCelular());
				fiscal.setDataUltimaAtualizacao(LocalDateTime.now());


	            return fiscalRepository.save(fiscal);
	        } else {
	            throw new RuntimeException("Fiscal não encontrado com o id: " + id);
	        }
	    }


	    @Override
	    public void deletar(String id) {
	        Optional<Fiscal> fiscalExistente = fiscalRepository.findById(id);

	        if (fiscalExistente.isPresent()) {
	            fiscalRepository.deleteById(id);
	        } else {
	            throw new RuntimeException("Fiscal não encontrado com o id: " + id);
	        }
	    }


	//procurar usuarios pela placa do carro
    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> buscarUsuariosPorPlaca(String placa) {
        return usuarioRepository.findByPlacasCarroContains(placa);
    }


}
