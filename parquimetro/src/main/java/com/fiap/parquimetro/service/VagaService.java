package com.fiap.parquimetro.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.fiap.parquimetro.model.Regiao;
import com.fiap.parquimetro.model.Vaga;

public interface VagaService {

	public List<Vaga> obterTodas();
	public Vaga obterPorId(String id);
	public Vaga criar(Vaga vaga);
	public void excluirVaga(String id);
	public ResponseEntity<?> alterarVaga(String id, Vaga vaga);
	public ResponseEntity<?> alterarDisponibilidade(String id);
	public List<Vaga> obterPorNumeroERegiao(Optional<String> nomeRegiao, Optional<String> numero);
}