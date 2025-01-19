package com.fiap.parquimetro.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.fiap.parquimetro.model.Fiscal;


public interface FiscalRepository extends MongoRepository<Fiscal, String>{

    	   //->para buscar se o cpf ja foi cadastrado no banco de dados 
	   Fiscal findByCpf(Long cpf);

}
