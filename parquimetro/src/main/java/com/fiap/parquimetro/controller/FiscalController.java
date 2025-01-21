package com.fiap.parquimetro.controller;


import java.util.List;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fiap.parquimetro.model.Fiscal;
import com.fiap.parquimetro.model.Usuario;
import com.fiap.parquimetro.service.FiscalService;

@RestController
@RequestMapping(value = "/fiscais")
@Tag(name = "Fiscais", description = "Gerenciamento de fiscais e verificação de placas.")
public class FiscalController {

	@Autowired
	private FiscalService fiscalService;

	@GetMapping
  @Operation(summary = "Listar todos os fiscais", description = "Retorna uma lista com todos os fiscais cadastrados no sistema.")
  public List<Fiscal> obterTodos(){
		return this.fiscalService.obterTodos();
	}

	@GetMapping("/{id}")
  @Operation(summary = "Obter fiscal por ID", description = "Retorna os detalhes de um fiscal com base no ID fornecido.")
  public Fiscal obterPorId(@PathVariable String id) {
		return this.fiscalService.obterPorId(id);
	}

	@PostMapping
  @Operation(summary = "Criar um novo fiscal", description = "Cadastra um novo fiscal no sistema com as informações fornecidas.")
  public Fiscal criar(@RequestBody Fiscal fiscal) {
		return this.fiscalService.criar(fiscal);

	}

    @PutMapping("/{id}")
    @Operation(summary = "Atualizar um fiscal", description = "Atualiza as informações de um fiscal existente com base no ID e nos novos dados fornecidos.")
    public Fiscal atualizar(@PathVariable String id, @RequestBody Fiscal fiscalAtualizado) {
        return this.fiscalService.atualizar(id, fiscalAtualizado);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Deletar um fiscal", description = "Remove um fiscal do sistema com base no ID fornecido.")
    public void deletar(@PathVariable String id) {
        fiscalService.deletar(id);
    }

	//endpoint para verificar a placa
    @GetMapping("/verificarPlaca/{placa}")
    @Operation(summary = "Verificar usuários associados a uma placa", description = "Busca usuários cadastrados no sistema com base na placa fornecida.")
    public String verificarPlaca(@PathVariable String placa) {
        // Chama o método de busca de usuários no FiscalService
        List<Usuario> usuarios = fiscalService.buscarUsuariosPorPlaca(placa);

        if (usuarios.isEmpty()) {
            return "Nenhum usuário encontrado com a placa: " + placa;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Usuários encontrados com a placa " + placa + ":\n");
            for (Usuario usuario : usuarios) {
                sb.append("Nome: " + usuario.getNome() + ", CPF: " + usuario.getCpf() + "\n");
            }
            return sb.toString();
        }
    }

}
