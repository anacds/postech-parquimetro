package com.fiap.parquimetro.service;

import com.fiap.parquimetro.model.Reserva;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface ReservaService {

    public ResponseEntity<?> criarReserva(Reserva reserva);
    public Reserva buscarReservaPorId(String id);
    public List<Reserva> listarTodasReservas(Optional<String> regiao, Optional<String> placa);
    public int consultaTempoRestante(String id);
    public ResponseEntity<?> adicionaMaisTempo(String id, int minutos);
    public Reserva iniciarReserva(String id);
    public Reserva encerrarReserva(String id);
    public ResponseEntity<?> cancelarReserva(String id);
    /*public ResponseEntity<?> atualizarReserva(String id, Reserva reserva);*/

}
