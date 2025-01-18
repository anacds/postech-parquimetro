package com.fiap.parquimetro.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import com.fiap.parquimetro.model.Usuario;
import com.fiap.parquimetro.repository.UsuarioRepository;
import com.fiap.parquimetro.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService{
	
	private final MongoTemplate mongoTemplate;
	
	

	public UsuarioServiceImpl(MongoTemplate mongoTemplate) {
		this.mongoTemplate = mongoTemplate;
	}

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Override
	public List<Usuario> obterTodos() {
		return this.usuarioRepository.findAll();
	}

	@Override
	public Usuario obterPorId(String id) {
		return this.usuarioRepository
				.findById(id)
				.orElseThrow(()-> new IllegalArgumentException("O Id não está associado a nenhum usuário!"));
	}

	@Override
	public Usuario criar(Usuario usuario) {	
		
		//verifica se o cpf ja foi cadastrado em outra conta
		Usuario usuarioExistente = usuarioRepository.findByCpf(usuario.getCpf());
		if (usuarioExistente != null) {
            throw new RuntimeException("Já existe um usuário com este CPF: " + usuario.getCpf());
        }
		return this.usuarioRepository.save(usuario);
	}
	
    @Override
    public Usuario atualizar(String id, Usuario usuarioAtualizado) {
        Optional<Usuario> usuarioExistente = usuarioRepository.findById(id);

        if (usuarioExistente.isPresent()) {
            Usuario usuario = usuarioExistente.get();
          
            usuario.setNome(usuarioAtualizado.getNome());
            usuario.setCpf(usuarioAtualizado.getCpf());
            usuario.setEmail(usuarioAtualizado.getEmail());
            usuario.setNumeroCelular(usuarioAtualizado.getNumeroCelular());
            usuario.setPlacasCarro(usuarioAtualizado.getPlacasCarro());
            usuario.setPreferencias(usuarioAtualizado.getPreferencias());

            return usuarioRepository.save(usuario);
        } else {
            throw new RuntimeException("Usuário não encontrado com o id: " + id);
        }
    }


    @Override
    public void deletar(String id) {
        Optional<Usuario> usuarioExistente = usuarioRepository.findById(id);

        if (usuarioExistente.isPresent()) {
            usuarioRepository.deleteById(id);
        } else {
            throw new RuntimeException("Usuário não encontrado com o id: " + id);
        }
    }



}
