package com.fiap.parquimetro.model;

public class Preferencias {
    private boolean notificacaoEmail;
    private boolean notificacaoSMS;
    private boolean avisoAntesDeFimDeReserva;

    public Preferencias(boolean notificacaoEmail, boolean notificacaoSMS, boolean avisoAntesDeFimDeReserva) {
        this.notificacaoEmail = notificacaoEmail;
        this.notificacaoSMS = notificacaoSMS;
        this.avisoAntesDeFimDeReserva = avisoAntesDeFimDeReserva;
    }

    // Getters e setters
    public boolean isNotificacaoEmail() {
        return notificacaoEmail;
    }

    public void setNotificacaoEmail(boolean notificacaoEmail) {
        this.notificacaoEmail = notificacaoEmail;
    }

    public boolean isNotificacaoSMS() {
        return notificacaoSMS;
    }

    public void setNotificacaoSMS(boolean notificacaoSMS) {
        this.notificacaoSMS = notificacaoSMS;
    }

    public boolean isAvisoAntesDeFimDeReserva() {
        return avisoAntesDeFimDeReserva;
    }

    public void setAvisoAntesDeFimDeReserva(boolean avisoAntesDeFimDeReserva) {
        this.avisoAntesDeFimDeReserva = avisoAntesDeFimDeReserva;
    }
}