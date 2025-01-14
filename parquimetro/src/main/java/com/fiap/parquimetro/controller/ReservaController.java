package com.fiap.parquimetro.controller;

import com.fiap.parquimetro.model.Reserva;
import com.fiap.parquimetro.service.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/reservas")
public class ReservaController {

    @Autowired
    private ReservaService reservaService;

    @PostMapping
    public ResponseEntity<?> criarReserva(@RequestBody Reserva reserva){
        return this.reservaService.criarReserva(reserva);
    }

    /*
    @GetMapping
    public List<Reserva> listarReservas(@RequestParam Optional<String> regiao,
                                        @RequestParam Optional<String> placa) {
        return this.reservaService.listarReservas(regiao, placa);
    }
    */

    @GetMapping
    public List<Reserva> listarTodasReservas() {
        return this.reservaService.listarTodasReservas();
    }

    @GetMapping("/regiao")
    public ResponseEntity<List<Reserva>> listarPorRegiao(@RequestParam String regiao) {
        List<Reserva> reservas = reservaService.listarReservasPorRegiao(regiao);
        return ResponseEntity.ok(reservas);
    }

    @GetMapping("/placa")
    public ResponseEntity<List<Reserva>> listarPorPlaca(@RequestParam String placa) {
        List<Reserva> reservas = reservaService.listarReservasPorPlaca(placa);
        return ResponseEntity.ok(reservas);
    }

    @GetMapping("/{id}")
    public Reserva buscarReservaPorId(@PathVariable String id){
        return this.reservaService.buscarReservaPorId(id);
    }

    @GetMapping("/{id}/tempo-restante")
    public int consultarTempoRestante(@PathVariable String id) {
        return this.reservaService.consultarTempoRestante(id);
    }

    /*
    @PutMapping("/{id}")
    public void atualizarReserva(@PathVariable String id, @RequestBody Reserva reserva) {
        this.reservaService.atualizarReserva(id, reserva);
    }
    */

    @PutMapping("/{id}/adicionar-tempo")
    public ResponseEntity<?> adicionarMaisTempo(@PathVariable String id, @RequestBody int minutos) {
        return this.reservaService.adicionarMaisTempo(id, minutos);
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
