package com.fiap.parquimetro.controller;

import com.fiap.parquimetro.model.Reserva;
import com.fiap.parquimetro.service.ReservaService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/reservas")
@Tag(name = "Reservas", description = "Gerenciamento de reservas de parquímetros")
public class ReservaController {

    @Autowired
    private ReservaService reservaService;

    @Operation(summary = "Criar uma nova reserva", description = "Endpoint para criar uma nova reserva de parquímetro.")
    @PostMapping
    public Reserva criarReserva(@RequestBody Reserva reserva){
        return this.reservaService.criarReserva(reserva);
    }

    @Operation(summary = "Listar todas as reservas", description = "Endpoint para listar todas as reservas de parquímetro.")
    @GetMapping
    public List<Reserva> listarTodasReservas(@RequestParam Optional<String> regiao,
                                             @RequestParam Optional<String> placa) {
        return this.reservaService.listarTodasReservas(regiao, placa);
    }
    @Operation(summary = "Busca uma nova reserva pelo Id", description = "Endpoint para buscar uma nova reserva de parquímetro.")
    @GetMapping("/{id}")
    public Reserva buscarReservaPorId(@PathVariable String id){
        return this.reservaService.buscarReservaPorId(id);
    }

    @Operation(summary = "Consulta tempo restante", description = "Endpoint para consulta o tempo restante da reserva de parquímetro.")
    @GetMapping("/{id}/tempo-restante")
    public int consultaTempoRestante(@PathVariable String id) {
        return this.reservaService.consultaTempoRestante(id);
    }

    @Operation(summary = "Deletar uma reserva", description = "Endpoint para deletar uma reserva de parquímetro.")
    @DeleteMapping("/{id}")
    public void excluirReserva(@PathVariable String id){
        this.reservaService.excluirReserva(id);
    }

    @Operation(summary = "Deletar uma nova reserva", description = "Endpoint para deletar uma nova de parquímetro.")
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
