package com.fiap.parquimetro.controller;

import java.util.List;

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

import com.fiap.parquimetro.model.Regiao;
import com.fiap.parquimetro.service.RegiaoService;

@RestController
@RequestMapping(value = "regioes")
public class RegiaoController {

	@Autowired
	private RegiaoService regiaoService;
	
	@GetMapping
	private List<Regiao> obterTodos(){
		return regiaoService.obterTodos();
	}
	
	@GetMapping("/zona")
	private List<Regiao> obterPorZona(@RequestParam String zona){
		return regiaoService.obterPorZona(zona);
	}
	
	@GetMapping("{id}")
	private Regiao obterPorId(@PathVariable String id) {
		return regiaoService.obterPorId(id);
	}
	
	@DeleteMapping("{id}")
	private void excluirVaga(@PathVariable String id) {
		regiaoService.excluirRegiao(id);
	}
	
	@PostMapping
	private Regiao criar(@RequestBody Regiao regiao) {
		return regiaoService.criar(regiao);
	}
	
	@PutMapping("{id}")
	private ResponseEntity<?> alterarRegiao(@PathVariable String id, @RequestBody Regiao regiao){
		return regiaoService.alterarRegiao(id, regiao);
	}
}
