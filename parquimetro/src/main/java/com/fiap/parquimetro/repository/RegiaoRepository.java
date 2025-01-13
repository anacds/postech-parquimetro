package com.fiap.parquimetro.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.fiap.parquimetro.model.Regiao;

@Repository
public interface RegiaoRepository extends MongoRepository<Regiao, String>{

}
