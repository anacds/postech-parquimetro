package com.fiap.parquimetro.service.impl;

import com.fiap.parquimetro.model.*;
import com.fiap.parquimetro.repository.RegiaoRepository;
import com.fiap.parquimetro.repository.ReservaRepository;
import com.fiap.parquimetro.repository.UsuarioRepository;
import com.fiap.parquimetro.repository.VagaRepository;
import com.fiap.parquimetro.service.ReservaService;
import com.mongodb.DuplicateKeyException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class ReservaServiceImpl implements ReservaService {

    private final MongoTemplate mongoTemplate;

    @Autowired
    private ReservaRepository reservaRepository;

    public ReservaServiceImpl(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @Autowired
    private VagaRepository vagaRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private RegiaoRepository regiaoRepository;

    @Override
    public ResponseEntity<?> criarReserva(Reserva reserva) {
        if (reserva.getUsuario().getId() != null){
            Usuario usuario = this.usuarioRepository
                    .findById(reserva.getUsuario().getId())
                    .orElseThrow(()-> new IllegalArgumentException("O usuário não existe."));
            reserva.setUsuario(usuario);
        } else {
            reserva.setUsuario(null);
        }

        if (reserva.getVaga().getId() != null){
            Vaga vaga = this.vagaRepository
                    .findById(reserva.getVaga().getId())
                    .orElseThrow(()-> new IllegalArgumentException("A vaga não existe."));
            reserva.setVaga(vaga);
        } else {
            reserva.setVaga(null);
        }

        if (reserva.getRegiao().getId() != null){
            Regiao regiao = this.regiaoRepository
                    .findById(reserva.getRegiao().getId())
                    .orElseThrow(()-> new IllegalArgumentException("A região não existe."));
            reserva.setRegiao(regiao);
        } else {
            reserva.setRegiao(null);
        }

        try {
            reserva.setStatus("PENDENTE");
            reserva.setDataCriacao(LocalDateTime.now());
            reserva.setDataUltimaAtualizacao(LocalDateTime.now());
            this.reservaRepository.save(reserva);
            return ResponseEntity.status(HttpStatus.CREATED)
                    .build();
        } catch (DuplicateKeyException e) {
            return ResponseEntity.status(HttpStatus.CONFLICT)
                    .body("A reserva já existe.");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Erro ao criar a reserva: " + e.getMessage());
        }

    }

    @Override
    public Reserva buscarReservaPorId(String id) {
        return this.reservaRepository
                .findById(id)
                .orElseThrow(()-> new IllegalArgumentException("A reserva não existe."));
    }

    @Override
    public List<Reserva> listarTodasReservas(){
        return this.reservaRepository.findAll();
    }

    @Override
    public List<Reserva> listarReservasPorRegiao(String regiao) {
        Query query = new Query(Criteria.where("regiao.nome").is(regiao));
        return mongoTemplate.find(query, Reserva.class);
    }

    @Override
    public List<Reserva> listarReservasPorPlaca(String placa) {
        Query query = new Query(Criteria.where("usuario.placasCarro").in(placa));
        return mongoTemplate.find(query, Reserva.class);
    }

    @Override
    public int consultaTempoRestante(String id) {
        Reserva reserva = buscarReservaPorId(id);
        if (reserva.getHorarioFimEstimado() == null) {
            throw new RuntimeException("Horário de término estimado não configurado para esta reserva");
        }
        Duration duracaoReserva = Duration.between(LocalDateTime.now(), reserva.getHorarioFimEstimado());
        return (int) Math.max(0, duracaoReserva.toMinutes());

    }

    /*
    @Override
    public ResponseEntity<?> atualizarReserva(String id, Reserva reserva) {
        try {
            Reserva reservaExistente = buscarReservaPorId(id);
            reservaExistente.setDataUltimaAtualizacao(LocalDateTime.now());
            this.reservaRepository.save(reserva);
            return ResponseEntity.status(HttpStatus.OK).build();
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Erro ao atualizar reserva: " + e.getMessage());
        }
    }
    */

    @Override
    public ResponseEntity<?> adicionaMaisTempo(String id, int minutos) {
        try {
            Reserva reservaExistente = this.reservaRepository.findById(id).orElse(null);

            if(reservaExistente == null) {
                return ResponseEntity.status(HttpStatus.NOT_FOUND)
                        .body("Reserva não encontrada");
            }

        reservaExistente.setTempoSolicitadoMinutos(reservaExistente.getTempoSolicitadoMinutos() + minutos);
        reservaExistente.setHorarioFimEstimado(reservaExistente.getHorarioFimEstimado().plusMinutes(minutos));
        this.reservaRepository.save(reservaExistente);
        return ResponseEntity.status(HttpStatus.OK).build();
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Erro ao atualizar reserva: " + e.getMessage());
        }
    }

    @Override
    public Reserva iniciarReserva(String id) {
        Reserva reserva = buscarReservaPorId(id);

        if (!"PENDENTE".equalsIgnoreCase(reserva.getStatus())) {
            throw new RuntimeException("Apenas as reservas com status PENDENTE podem ser iniciadas.");
        }

        reserva.setStatus("ATIVA");
        reserva.setHorarioInicio(LocalDateTime.now());
        reserva.setDataUltimaAtualizacao(LocalDateTime.now());

        return reservaRepository.save(reserva);
    }

    @Override
    public Reserva encerrarReserva(String id) {
        Reserva reserva = buscarReservaPorId(id);

        if (!"ATIVA".equalsIgnoreCase(reserva.getStatus())) {
            throw new RuntimeException("Apenas as reservas com status ATIVA podem ser encerradas.");
        }

        reserva.setStatus("ENCERRADA");
        reserva.setHorarioFimReal(LocalDateTime.now());

        if (reserva.getHorarioInicio() != null) {
            Duration duracao = Duration.between(reserva.getHorarioInicio(), reserva.getHorarioFimReal());

            reserva.setTempoUsadoMinutos((int) duracao.toMinutes());
        }

        return reservaRepository.save(reserva);
    }

    @Override
    public ResponseEntity<?> cancelarReserva(String id) {
        try {
            Reserva reserva = buscarReservaPorId(id);

            if ("ATIVA".equalsIgnoreCase(reserva.getStatus()) || "ENCERRADA".equalsIgnoreCase(reserva.getStatus())) {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                        .body("A reserva não pode ser cancelada pois já foi iniciada ou já foi encerrada.");
            }

            reserva.setStatus("CANCELADA");
            reserva.setDataUltimaAtualizacao(LocalDateTime.now());
            reservaRepository.save(reserva);

            return ResponseEntity.status(HttpStatus.OK).body(reserva);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Erro ao cancelar a reserva: " + e.getMessage());
        }
    }
}
