package com.fiap.parquimetro.service;

import java.util.List;

import com.fiap.parquimetro.model.Vaga;

public interface VagaService {

	public List<Vaga> obterTodas();
	
	public Vaga obterPorPlaca(String placa);
	
	public Vaga obterPorId(String id);
	
	public Vaga criar(Vaga vaga);
	

}
