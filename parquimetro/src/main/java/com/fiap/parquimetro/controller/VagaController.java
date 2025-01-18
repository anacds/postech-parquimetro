package com.fiap.parquimetro.controller;

import java.util.List;
import java.util.Optional;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	public List<Vaga> obterTodos(){
		return vagaService.obterTodas();
	}
	
	@GetMapping("{id}")
	public Vaga obterPorId(@PathVariable String id) {
		return vagaService.obterPorId(id);
	}
	
	@GetMapping("/numero-regiao")
	public List<Vaga> obterVagaPorNumeroERegiao(@RequestParam Optional<String> numero, @RequestParam Optional<String> regiao) {
		return vagaService.obterPorNumeroERegiao(regiao, numero);
	}
	
	@PostMapping
	public Vaga criar(@RequestBody Vaga vaga) {
		return vagaService.criar(vaga);
	}
	
	@DeleteMapping("{id}")
	public void excluirVaga(@PathVariable String id) {
		vagaService.excluirVaga(id);
	}
	
	@PutMapping("{id}")
	public ResponseEntity<?> alterarVaga(@PathVariable String id, @RequestBody Vaga vaga){
		return vagaService.alterarVaga(id, vaga);
	}
	
	@PutMapping("/disponivel/{id}")
	public ResponseEntity<?> alterarDisponibilidade(@PathVariable String id){
		return vagaService.alterarDisponibilidade(id);
	}
}
