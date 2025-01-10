package com.fiap.parquimetro.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.fiap.parquimetro.model.Usuario;

public interface UsuarioRepository extends MongoRepository<Usuario, String>{
	
	   //->para buscar se o cpf ja foi cadastrado no banco de dados 
	   Usuario findByCpf(Long cpf);
	   //->para o fiscal conseguir achar o usuario pela placa do carro
	   List<Usuario> findByPlacasCarroContains(String placa);

}
