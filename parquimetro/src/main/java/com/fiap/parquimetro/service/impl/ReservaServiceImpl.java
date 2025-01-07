package com.fiap.parquimetro.service.impl;

import com.fiap.parquimetro.model.Reserva;
import com.fiap.parquimetro.model.Valor;
import com.fiap.parquimetro.repository.ReservaRepository;
import com.fiap.parquimetro.repository.VagaRepository;
import com.fiap.parquimetro.service.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class ReservaServiceImpl implements ReservaService {

    private final MongoTemplate mongoTemplate;

    @Autowired
    private ReservaRepository reservaRepository;

    public ReservaServiceImpl(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    /*
    @Autowired
    private RegiaoRepository regiaoRepository;

    @Autowired
    private VagaRepository vagaRepository;
    */
    
    @Override
    public Reserva criarReserva(Reserva reserva) {
        reserva.setStatus("PENDENTE");
        reserva.setDataCriacao(LocalDateTime.now());
        reserva.setDataUltimaAtualizacao(LocalDateTime.now());
        return reservaRepository.save(reserva);
    }

    @Override
    public Reserva buscarReservaPorId(String id) {
        return this.reservaRepository
                .findById(id)
                .orElseThrow(()-> new IllegalArgumentException("A reserva não existe."));
    }
    /*
    @Override
    public List<Reserva> listarTodasReservas() {
        return reservaRepository.findAll();
    }*/

    @Override
    public List<Reserva> listarTodasReservas(Optional<String> regiao, Optional<String> placa) {
        Query query = new Query();
        regiao.ifPresent(r -> query.addCriteria(Criteria.where("regiao.nome").is(r)));
        placa.ifPresent(p -> query.addCriteria(Criteria.where("usuario.placa").is(p)));

        return mongoTemplate.find(query, Reserva.class);
    }

    @Override
    public void excluirReserva(String id) {
        reservaRepository.deleteById(id);
    }

    @Override
    public int consultaTempoRestante(String id) {
        Reserva reserva = this.reservaRepository
                            .findById(id)
                            .orElseThrow(()-> new IllegalArgumentException("A reserva não existe."));
        if (reserva.getHorarioFimEstimado() == null) {
            throw new RuntimeException("Horário de término estimado não configurado para esta reserva");
        }
        Duration duracaoReserva = Duration.between(LocalDateTime.now(), reserva.getHorarioFimEstimado());
        return (int) Math.max(0, duracaoReserva.toMinutes());
    }

    @Override
    public ResponseEntity<?> atualizarReserva(String id, Reserva reserva) {
        try {
            Reserva reservaExistente = this.reservaRepository.findById(id).orElse(null);

            if(reservaExistente == null) {
                return ResponseEntity.status(HttpStatus.NOT_FOUND)
                        .body("Reserva não encontrada");
            }

            reservaExistente.setDataUltimaAtualizacao(LocalDateTime.now());
            this.reservaRepository.save(reserva);
            return ResponseEntity.status(HttpStatus.OK).build();
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Erro ao atualizar reserva: " + e.getMessage());
        }
    }

    @Override
    public ResponseEntity<?> adicionaMaisTempo(String id, int minutos) {
        Reserva reserva = this.reservaRepository
                .findById(id)
                .orElseThrow(()-> new IllegalArgumentException("A reserva não existe."));
        reserva.setTempoSolicitadoMinutos(reserva.getTempoSolicitadoMinutos() + minutos);
        reserva.setHorarioFimEstimado(reserva.getHorarioFimEstimado().plusMinutes(minutos));
        return atualizarReserva(id, reserva);
    }

    @Override
    public Reserva iniciarReserva(String id) {
        return null;
    }

    @Override
    public Reserva encerrarReserva(String id) {
        return null;
    }
}
