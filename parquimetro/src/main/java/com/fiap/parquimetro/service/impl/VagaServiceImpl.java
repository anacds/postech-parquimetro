package com.fiap.parquimetro.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fiap.parquimetro.model.Vaga;
import com.fiap.parquimetro.repository.VagaRepository;
import com.fiap.parquimetro.service.VagaService;

@Service
public class VagaServiceImpl implements VagaService{
	
	@Autowired
	private VagaRepository vagaRepository;

	@Override
	public List<Vaga> obterTodas() {
		return null;
	}

	
}
