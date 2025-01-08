package com.fiap.parquimetro.model;

public class Preferencias {

    private boolean notificacoes;
    private boolean avisoAntesDeFimDeReserva;

    public Preferencias(boolean notificacoes, boolean avisoAntesDeFimDeReserva) {
        this.notificacoes = notificacoes;
        this.avisoAntesDeFimDeReserva = avisoAntesDeFimDeReserva;
    }

    public boolean isNotificacoes() {
        return notificacoes;
    }

    public void setNotificacoes(boolean notificacoes) {
        this.notificacoes = notificacoes;
    }

    public boolean isAvisoAntesDeFimDeReserva() {
        return avisoAntesDeFimDeReserva;
    }

    public void setAvisoAntesDeFimDeReserva(boolean avisoAntesDeFimDeReserva) {
        this.avisoAntesDeFimDeReserva = avisoAntesDeFimDeReserva;
    }

    @Override
    public String toString() {
        return "Preferencias{" +
               "notificacoes=" + notificacoes +
               ", avisoAntesDeFimDeReserva=" + avisoAntesDeFimDeReserva +
               '}';
    }
}
