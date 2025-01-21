package com.fiap.parquimetro.service;

import java.util.List;

import com.fiap.parquimetro.model.Fiscal;
import com.fiap.parquimetro.model.Usuario;

public interface FiscalService {
	
	public List<Fiscal> obterTodos();
	
	public Fiscal obterPorId(String id);
	
	public Fiscal criar(Fiscal id);
	
	public Fiscal atualizar(String id, Fiscal fiscalAtualizado);

	public void deletar(String id);

	
	//buscar usuario pela placa do carro

	public List<Usuario> buscarUsuariosPorPlaca(String placa);

}
