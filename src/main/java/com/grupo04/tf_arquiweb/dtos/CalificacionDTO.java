package com.grupo04.tf_arquiweb.dtos;

import com.grupo04.tf_arquiweb.entities.Reserva;

public class CalificacionDTO {
    private int CalificacionId;
    private int CalificacionEstrellas;
    private String CalificacionComentario;
    private Reserva reserva;

    public int getCalificacionId() {
        return CalificacionId;
    }

    public void setCalificacionId(int calificacionId) {
        CalificacionId = calificacionId;
    }

    public int getCalificacionEstrellas() {
        return CalificacionEstrellas;
    }

    public void setCalificacionEstrellas(int calificacionEstrellas) {
        CalificacionEstrellas = calificacionEstrellas;
    }

    public String getCalificacionComentario() {
        return CalificacionComentario;
    }

    public void setCalificacionComentario(String calificacionComentario) {
        CalificacionComentario = calificacionComentario;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }
}
