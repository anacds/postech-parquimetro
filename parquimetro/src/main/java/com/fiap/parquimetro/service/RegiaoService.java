package com.fiap.parquimetro.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.fiap.parquimetro.model.Regiao;

public interface RegiaoService {
	public List<Regiao> obterTodos();
	public List<Regiao> obterPorZona(String zona);
	public Regiao obterPorId(String id);
	public void excluirRegiao(String id);
	public Regiao criar(Regiao regiao);
	public ResponseEntity<?> alterarRegiao(String id, Regiao regiao);
	
}
