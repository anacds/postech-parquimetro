package com.fiap.parquimetro.service;

import com.fiap.parquimetro.model.Reserva;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ReservaService {

    public ResponseEntity<?> criarReserva(Reserva reserva);
    public List<Reserva> listarTodasReservas();
    public List<Reserva> listarReservasPorRegiao(String regiao);
    public List<Reserva> listarReservasPorPlaca(String placa);
    public Reserva buscarReservaPorId(String id);
    public int consultarTempoRestante(String id);
    public ResponseEntity<?> adicionarMaisTempo(String id, int minutos);
    public ResponseEntity<?> iniciarReserva(String id);
    public ResponseEntity<?> encerrarReserva(String id);
    public ResponseEntity<?> cancelarReserva(String id);
    /*public ResponseEntity<?> atualizarReserva(String id, Reserva reserva);*/

}
