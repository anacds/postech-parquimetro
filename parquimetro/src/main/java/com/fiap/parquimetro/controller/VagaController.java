package com.fiap.parquimetro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fiap.parquimetro.model.Vaga;
import com.fiap.parquimetro.service.VagaService;

@RestController
@RequestMapping(value = "/vagas")
public class VagaController {

	@Autowired
	private VagaService vagaService;
	
	@GetMapping
	public List<Vaga> obterTodos(){
		return vagaService.obterTodas();
	}
	
	@GetMapping
	public Vaga obterPorId(@PathVariable String id) {
		return vagaService.obterPorId(id);
	}
	
	@PostMapping
	public Vaga criar(@RequestBody Vaga vaga) {
		return vagaService.criar(vaga);
	}
}
