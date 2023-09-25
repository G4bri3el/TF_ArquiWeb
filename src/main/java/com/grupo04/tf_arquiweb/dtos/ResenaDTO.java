package com.grupo04.tf_arquiweb.dtos;

import com.grupo04.tf_arquiweb.entities.Reserva;

public class ResenaDTO {
    private int resenaid;
    private int resenaestrellas;
    private String resenacomentario;
    private Reserva reserva;

    public int getResenaid() {
        return resenaid;
    }

    public void setResenaid(int resenaid) {
        this.resenaid = resenaid;
    }

    public int getResenaestrellas() {
        return resenaestrellas;
    }

    public void setResenaestrellas(int resenaestrellas) {
        this.resenaestrellas = resenaestrellas;
    }

    public String getResenacomentario() {
        return resenacomentario;
    }

    public void setResenacomentario(String resenacomentario) {
        this.resenacomentario = resenacomentario;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }
}
