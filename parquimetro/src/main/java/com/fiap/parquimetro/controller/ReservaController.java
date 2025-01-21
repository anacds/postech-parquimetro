package com.fiap.parquimetro.controller;

import com.fiap.parquimetro.model.Reserva;
import com.fiap.parquimetro.service.ReservaService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/reservas")
@Tag(name = "Reservas", description = "Gerenciamento de reservas de parquímetros")
public class ReservaController {

  @Autowired
  private ReservaService reservaService;

    @PostMapping
    @Operation(summary = "Criar uma nova reserva", description = "Endpoint para criar uma nova reserva de parquímetro com os dados fornecidos.")
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
    @Operation(summary = "Listar todas as reservas", description = "Endpoint para listar todas as reservas cadastradas no sistema.")
    public List<Reserva> listarTodasReservas() {
        return this.reservaService.listarTodasReservas();
    }

    @GetMapping("/regiao")
    @Operation(summary = "Listar reservas por região", description = "Endpoint para listar reservas filtradas com base na região fornecida.")
    public ResponseEntity<List<Reserva>> listarPorRegiao(@RequestParam String regiao) {
        List<Reserva> reservas = reservaService.listarReservasPorRegiao(regiao);
        return ResponseEntity.ok(reservas);
    }

    @GetMapping("/placa")
    @Operation(summary = "Listar reservas por placa", description = "Endpoint para listar reservas associadas a uma placa específica.")
    public ResponseEntity<List<Reserva>> listarPorPlaca(@RequestParam String placa) {
        List<Reserva> reservas = reservaService.listarReservasPorPlaca(placa);
        return ResponseEntity.ok(reservas);
    }

  @Operation(summary = "Busca uma nova reserva pelo Id", description = "Endpoint para buscar uma nova reserva de parquímetro.")
  @GetMapping("/{id}")
  public Reserva buscarReservaPorId(@PathVariable String id) {
    return this.reservaService.buscarReservaPorId(id);
  }

    @GetMapping("/{id}/tempo-restante")
    public int consultarTempoRestante(@PathVariable String id) {
        return this.reservaService.consultarTempoRestante(id);
    }

    @PutMapping("/{id}/adicionar-tempo")
    @Operation(summary = "Consultar tempo restante de uma reserva", description = "Endpoint para consultar o tempo restante de uma reserva com base no ID fornecido.")
    public ResponseEntity<?> adicionarMaisTempo(@PathVariable String id, @RequestBody int minutos) {
        return this.reservaService.adicionarMaisTempo(id, minutos);
    }

    @PutMapping("/{id}/iniciar")
    @Operation(summary = "Iniciar uma reserva", description = "Endpoint para iniciar uma reserva com base no ID fornecido.")
    public ResponseEntity<?> iniciarReserva(@PathVariable String id) {
        return this.reservaService.iniciarReserva(id);
    }

    @PutMapping("/{id}/encerrar")
    @Operation(summary = "Encerrar uma reserva", description = "Endpoint para encerrar uma reserva de parquímetro com base no ID fornecido.")
    public ResponseEntity<?> encerrarReserva(@PathVariable String id) {
        return this.reservaService.encerrarReserva(id);
    }

    @PutMapping("/{id}/cancelar")
    @Operation(summary = "Cancelar uma reserva", description = "Endpoint para cancelar uma reserva de parquímetro com base no ID fornecido.")
    public ResponseEntity<?> cancelarReserva(@PathVariable("id") String id) {
        return reservaService.cancelarReserva(id);
    }


}
