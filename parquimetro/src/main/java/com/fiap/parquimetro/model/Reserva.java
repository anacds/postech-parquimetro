package com.fiap.parquimetro.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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
    /*
    private Usuario usuario;
    private Regiao regiao;
    */
    private LocalDateTime dataCriacao;
    private LocalDateTime dataUltimaAtualizacao;

    public String getReservaId() {
        return reservaId;
    }

    public void setReservaId(String reservaId) {
        this.reservaId = reservaId;
    }

    public Integer getTempoSolicitadoMinutos() {
        return tempoSolicitadoMinutos;
    }

    public void setTempoSolicitadoMinutos(Integer tempoSolicitadoMinutos) {
        this.tempoSolicitadoMinutos = tempoSolicitadoMinutos;
    }

    public LocalDateTime getHorarioInicio() {
        return horarioInicio;
    }

    public void setHorarioInicio(LocalDateTime horarioInicio) {
        this.horarioInicio = horarioInicio;
    }

    public LocalDateTime getHorarioFimEstimado() {
        return horarioFimEstimado;
    }

    public void setHorarioFimEstimado(LocalDateTime horarioFimEstimado) {
        this.horarioFimEstimado = horarioFimEstimado;
    }

    public LocalDateTime getHorarioFimReal() {
        return horarioFimReal;
    }

    public void setHorarioFimReal(LocalDateTime horarioFimReal) {
        this.horarioFimReal = horarioFimReal;
    }

    public Integer getTempoUsadoMinutos() {
        return tempoUsadoMinutos;
    }

    public void setTempoUsadoMinutos(Integer tempoUsadoMinutos) {
        this.tempoUsadoMinutos = tempoUsadoMinutos;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Valor getValorPago() {
        return valorPago;
    }

    public void setValorPago(Valor valorPago) {
        this.valorPago = valorPago;
    }

    public Vaga getVaga() {
        return vaga;
    }

    public void setVaga(Vaga vaga) {
        this.vaga = vaga;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public LocalDateTime getDataUltimaAtualizacao() {
        return dataUltimaAtualizacao;
    }

    public void setDataUltimaAtualizacao(LocalDateTime dataUltimaAtualizacao) {
        this.dataUltimaAtualizacao = dataUltimaAtualizacao;
    }
}
