package com.fiap.parquimetro.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.fiap.parquimetro.model.Vaga;

public interface VagaRepository extends MongoRepository<Vaga, String>{

}
