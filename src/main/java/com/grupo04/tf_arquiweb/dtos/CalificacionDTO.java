package com.grupo04.tf_arquiweb.dtos;

import com.grupo04.tf_arquiweb.entities.Reserva;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

public class CalificacionDTO {
    private int CalificacionID;
    private int CalificacionEstrellas;
    private String CalificacionComentario;
    private Reserva reserva;

    public int getCalificacionID() {
        return CalificacionID;
    }

    public void setCalificacionID(int calificacionID) {
        CalificacionID = calificacionID;
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
