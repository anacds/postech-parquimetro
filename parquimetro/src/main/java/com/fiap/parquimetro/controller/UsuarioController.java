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

import com.fiap.parquimetro.model.Usuario;
import com.fiap.parquimetro.service.UsuarioService;

@RestController
@RequestMapping(value = "/usuarios")
@Tag(name = "Usuários", description = "Gerenciamento de usuários do sistema.")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;


	@GetMapping
	@Operation(summary = "Listar todos os usuários", description = "Retorna uma lista com todos os usuários cadastrados no sistema.")
	public List<Usuario> obterTodos(){
		return this.usuarioService.obterTodos();
	}

	@GetMapping("/{id}")
	@Operation(summary = "Obter usuário por ID", description = "Retorna os detalhes de um usuário específico com base no ID fornecido.")
	public Usuario obterPorId(@PathVariable String id) {
		return this.usuarioService.obterPorId(id);
	}

	@PostMapping
	@Operation(summary = "Criar um novo usuário", description = "Cadastra um novo usuário no sistema com as informações fornecidas.")
	public Usuario criar(@RequestBody Usuario usuario) {
		return this.usuarioService.criar(usuario);

	}

    @PutMapping("/{id}")
		@Operation(summary = "Atualizar um usuário", description = "Atualiza as informações de um usuário existente com base no ID e nos novos dados fornecidos.")
		public Usuario atualizar(@PathVariable String id, @RequestBody Usuario usuarioAtualizado) {
        return this.usuarioService.atualizar(id, usuarioAtualizado);
    }

    @DeleteMapping("/{id}")
		@Operation(summary = "Deletar um usuário", description = "Remove um usuário do sistema com base no ID fornecido.")
		public void deletar(@PathVariable String id) {
        usuarioService.deletar(id);
    }

}
