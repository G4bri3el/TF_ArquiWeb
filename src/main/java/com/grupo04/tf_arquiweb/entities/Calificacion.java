package com.grupo04.tf_arquiweb.entities;

import jakarta.persistence.*;

@Entity
@Table(name="Calificacion")
public class Calificacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int CalificacionID;
    @Column(name="CalificacionEstrellas", nullable = false)
    private int CalificacionEstrellas;
    @Column(name="CalificacionComentario", length = 200, nullable = false)
    private String CalificacionComentario;
   @ManyToOne
   @JoinColumn(name="ReservaID")
   private Reserva reserva;

    public Calificacion(){

    }

   public Calificacion(int calificacionID, int calificacionEstrellas, String calificacionComentario, Reserva reserva) {
       CalificacionID = calificacionID;
       CalificacionEstrellas = calificacionEstrellas;
       CalificacionComentario = calificacionComentario;
       this.reserva = reserva;
   }

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

