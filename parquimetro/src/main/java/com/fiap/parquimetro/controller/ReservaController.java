package com.fiap.parquimetro.controller;

import com.fiap.parquimetro.model.Reserva;
import com.fiap.parquimetro.service.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/reservas")
public class ReservaController {

    @Autowired
    private ReservaService reservaService;

    @PostMapping
    public Reserva criarReserva(@RequestBody Reserva reserva){
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

    @DeleteMapping("/{id}")
    public void excluirReserva(@PathVariable String id){
        this.reservaService.excluirReserva(id);
    }

    @PutMapping("/{id}")
    public void atualizarReserva(@PathVariable String id, @RequestBody Reserva reserva) {
        this.reservaService.atualizarReserva(id, reserva);
    }

    /*
    public int consultaTempoRestante(String id);
    public Reserva adicionaMaisTempo(String id, int minutos);
    public Reserva iniciarReserva(String id);
    public Reserva encerrarReserva(String id);
    */

}
