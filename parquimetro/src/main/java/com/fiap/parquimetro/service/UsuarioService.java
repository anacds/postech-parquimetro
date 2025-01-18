package com.fiap.parquimetro.service;

import java.util.List;

import com.fiap.parquimetro.model.Usuario;

public interface UsuarioService {
	
	public List<Usuario> obterTodos();
	
	public Usuario obterPorId(String id);
	
	public Usuario criar(Usuario id);

	public Usuario atualizar(String id, Usuario usuarioAtualizado);

	public void deletar(String id);

}
