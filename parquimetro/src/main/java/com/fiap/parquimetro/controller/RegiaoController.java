package com.fiap.parquimetro.controller;

import java.util.List;

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

import com.fiap.parquimetro.model.Regiao;
import com.fiap.parquimetro.service.RegiaoService;

@RestController
@RequestMapping(value = "regioes")
@Tag(name = "Regiões", description = "Gerenciamento de regiões do sistema.")
public class RegiaoController {

	@Autowired
	private RegiaoService regiaoService;

	@GetMapping
  @Operation(summary = "Listar todas as regiões", description = "Retorna uma lista com todas as regiões cadastradas no sistema.")
  private List<Regiao> obterTodos(){
		return regiaoService.obterTodos();
	}

	@GetMapping("/zona")
  @Operation(summary = "Obter regiões por zona", description = "Retorna uma lista de regiões filtradas com base na zona fornecida.")
  private List<Regiao> obterPorZona(@RequestParam String zona){
		return regiaoService.obterPorZona(zona);
	}

	@GetMapping("{id}")
  @Operation(summary = "Obter região por ID", description = "Retorna os detalhes de uma região específica com base no ID fornecido.")
  private Regiao obterPorId(@PathVariable String id) {
		return regiaoService.obterPorId(id);
	}

	@DeleteMapping("{id}")
  @Operation(summary = "Excluir uma vaga", description = "Remove uma vaga do sistema com base no ID fornecido.")
  private void excluirVaga(@PathVariable String id) {
		regiaoService.excluirRegiao(id);
	}

	@PostMapping
  @Operation(summary = "Criar uma nova região", description = "Cadastra uma nova região no sistema com as informações fornecidas.")
  private Regiao criar(@RequestBody Regiao regiao) {
		return regiaoService.criar(regiao);
	}

	@PutMapping("{id}")
  @Operation(summary = "Alterar uma região", description = "Altera os dados de uma região existente com base no ID fornecido e nas novas informações.")
  private ResponseEntity<?> alterarRegiao(@PathVariable String id, @RequestBody Regiao regiao){
		return regiaoService.alterarRegiao(id, regiao);
	}
}
