package com.fiap.parquimetro.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document("Reserva")
@Data

public class Reserva {
  @Id
  private String reservaId;
  private Integer tempoSolicitadoMinutos;
  private LocalDateTime horarioInicio;
  private LocalDateTime horarioFimEstimado;
  private LocalDateTime horarioFimReal;
  private Integer tempoUsadoMinutos;
  private String status;
  private Valor valorPago;
  private Vaga vaga;
  private Usuario usuario;
  private Regiao regiao;
  private LocalDateTime dataCriacao;
  private LocalDateTime dataUltimaAtualizacao;

}
