package com.fiap.parquimetro.repository;

import com.fiap.parquimetro.model.Reserva;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface ReservaRepository extends MongoRepository<Reserva, String> {

}
