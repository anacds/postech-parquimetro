package com.fiap.parquimetro.controller;

import java.util.List;
import java.util.Optional;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.fiap.parquimetro.model.Vaga;
import com.fiap.parquimetro.service.VagaService;

@RestController
@RequestMapping(value = "/vagas")
@Tag(name = "Vagas", description = "Gerenciamento de vagas disponíveis nos parquímetros.")
public class VagaController {

	@Autowired
	private VagaService vagaService;

	@GetMapping
  @Operation(summary = "Listar todas as vagas", description = "Retorna uma lista com todas as vagas disponíveis nos parquímetros.")
  public List<Vaga> obterTodos(){
		return vagaService.obterTodas();
	}

	@GetMapping("{id}")
  @Operation(summary = "Obter vaga por ID", description = "Retorna os detalhes de uma vaga específica com base no ID informado.")
  public Vaga obterPorId(@PathVariable String id) {
		return vagaService.obterPorId(id);
	}

	@GetMapping("/numero-regiao")
  @Operation(summary = "Filtrar vagas por número e/ou região", description = "Filtra vagas com base nos parâmetros opcionais de número e região.")
  public List<Vaga> obterVagaPorNumeroERegiao(@RequestParam Optional<String> numero, @RequestParam Optional<String> regiao) {
		return vagaService.obterPorNumeroERegiao(regiao, numero);
	}

	@PostMapping
  @Operation(summary = "Criar uma nova vaga", description = "Cria uma nova vaga com base nos dados fornecidos.")
  public Vaga criar(@RequestBody Vaga vaga) {
		return vagaService.criar(vaga);
	}

	@DeleteMapping("{id}")
  @Operation(summary = "Excluir uma vaga", description = "Exclui uma vaga com base no ID informado.")
  public void excluirVaga(@PathVariable String id) {
		vagaService.excluirVaga(id);
	}

	@PutMapping("{id}")
  @Operation(summary = "Alterar os dados de uma vaga", description = "Altera as informações de uma vaga com base no ID informado e nos dados fornecidos no corpo da requisição.")
  public ResponseEntity<?> alterarVaga(@PathVariable String id, @RequestBody Vaga vaga){
		return vagaService.alterarVaga(id, vaga);
	}

	@PutMapping("/disponivel/{id}")
  @Operation(summary = "Alterar disponibilidade de uma vaga", description = "Altera a disponibilidade de uma vaga com base no ID informado.")
  public ResponseEntity<?> alterarDisponibilidade(@PathVariable String id){
		return vagaService.alterarDisponibilidade(id);
	}
}
