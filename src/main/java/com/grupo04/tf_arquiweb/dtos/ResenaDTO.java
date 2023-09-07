package com.grupo04.tf_arquiweb.dtos;

import com.grupo04.tf_arquiweb.entities.Reserva;

public class ResenaDTO {
    private int ResenaId;
    private int ResenaEstrellas;
    private String ResenaComentario;
    private Reserva reserva;

    public int getResenaId() {
        return ResenaId;
    }

    public void setResenaId(int resenaId) {
        ResenaId = resenaId;
    }

    public int getResenaEstrellas() {
        return ResenaEstrellas;
    }

    public void setResenaEstrellas(int resenaEstrellas) {
        ResenaEstrellas = resenaEstrellas;
    }

    public String getResenaComentario() {
        return ResenaComentario;
    }

    public void setResenaComentario(String resenaComentario) {
        ResenaComentario = resenaComentario;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }
}
