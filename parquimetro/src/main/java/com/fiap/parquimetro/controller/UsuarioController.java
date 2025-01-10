package com.fiap.parquimetro.controller;

import java.util.List;

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
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	
	@GetMapping
	public List<Usuario> obterTodos(){
		return this.usuarioService.obterTodos();
	}
	
	@GetMapping("/{id}")
	public Usuario obterPorId(@PathVariable String id) {
		return this.usuarioService.obterPorId(id);
	}

	@PostMapping
	public Usuario criar(@RequestBody Usuario usuario) {
		return this.usuarioService.criar(usuario);
		
	}
	
    @PutMapping("/{id}")
    public Usuario atualizar(@PathVariable String id, @RequestBody Usuario usuarioAtualizado) {
        return this.usuarioService.atualizar(id, usuarioAtualizado);
    }
    
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable String id) {
        usuarioService.deletar(id);
    }
	
}
