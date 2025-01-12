package com.fiap.parquimetro.controller;

import java.util.List;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
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
@Tag(name = "Vagas", description = "Gerenciamento de vagas disponíveis nos parquímetros.")
public class VagaController {

	@Autowired
	private VagaService vagaService;


	@GetMapping
	@Operation(summary = "Obter todas as vagas de parquímetro", description = "Endpoint para listar todas as vagas disponíveis para reserva no sistema de parquímetros.")
	public List<Vaga> obterTodos(){
		return vagaService.obterTodas();
	}
	
	@GetMapping("/{id}")
	@Operation(summary = "Consultar vaga por ID", description = " Endpoint que retorna os detalhes de uma vaga com base no ID da reserva no sistema de parquímetros")
	public Vaga obterPorId(@PathVariable String id) {
		return vagaService.obterPorId(id);
	}
	
	@PostMapping
	@Operation(summary = "Criar vaga de parquímetro", description = "Endpoint para criar uma vaga parareserva no sistema de parquímetros")
	public Vaga criar(@RequestBody Vaga vaga) {
		return vagaService.criar(vaga);
	}
}
