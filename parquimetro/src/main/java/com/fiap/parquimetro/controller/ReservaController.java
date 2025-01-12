package com.fiap.parquimetro.controller;

import com.fiap.parquimetro.model.Reserva;
import com.fiap.parquimetro.service.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping(value = "/reservas")
public class ReservaController {

    @Autowired
    private ReservaService reservaService;

    @PostMapping
    public ResponseEntity<?> criarReserva(@RequestBody Reserva reserva){
        return this.reservaService.criarReserva(reserva);
    }

    @GetMapping
    public List<Reserva> listarTodasReservas(@RequestParam Optional<String> regiao,
                                             @RequestParam Optional<String> placa) {
        return this.reservaService.listarTodasReservas(regiao, placa);
    }

    @GetMapping("/{id}")
    public Reserva buscarReservaPorId(@PathVariable String id){
        return this.reservaService.buscarReservaPorId(id);
    }

    @GetMapping("/{id}/tempo-restante")
    public int consultaTempoRestante(@PathVariable String id) {
        return this.reservaService.consultaTempoRestante(id);
    }

    /*
    @PutMapping("/{id}")
    public void atualizarReserva(@PathVariable String id, @RequestBody Reserva reserva) {
        this.reservaService.atualizarReserva(id, reserva);
    }
    */

    @PutMapping("/{id}/adicionar-tempo")
    public ResponseEntity<?> adicionaMaisTempo(@PathVariable String id, @RequestBody int minutos) {
        return this.reservaService.adicionaMaisTempo(id, minutos);
    }

    @PutMapping("/{id}/iniciar")
    public ResponseEntity<Reserva> iniciarReserva(@PathVariable String id) {
        Reserva reserva = this.reservaService.iniciarReserva(id);
        return ResponseEntity.ok(reserva);
    }

    @PutMapping("/{id}/encerrar")
    public ResponseEntity<Reserva> encerrarReserva(@PathVariable String id) {
        Reserva reserva = this.reservaService.encerrarReserva(id);
        return ResponseEntity.ok(reserva);
    }

    @PutMapping("/{id}/cancelar")
    public ResponseEntity<?> cancelarReserva(@PathVariable("id") String id) {
        return reservaService.cancelarReserva(id);
    }


}
