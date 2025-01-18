package com.fiap.parquimetro.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.fiap.parquimetro.model.Fiscal;

public interface FiscalRepository extends MongoRepository<Fiscal, String>{


}
