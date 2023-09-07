package com.grupo04.tf_arquiweb.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Resena")
public class Resena {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ResenaId;
    @Column(name = "ResenaEstrellas", nullable = false)
    private int ResenaEstrellas;
    @Column(name = "ResenaComentario", length = 200, nullable = false)
    private String ResenaComentario;
    @OneToOne
    @JoinColumn(name = "ReservaId")
    private Reserva reserva;

    public Resena() {

    }

    public Resena(int resenaId, int resenaEstrellas, String resenaComentario, Reserva reserva) {
        ResenaId = resenaId;
        ResenaEstrellas = resenaEstrellas;
        ResenaComentario = resenaComentario;
        this.reserva = reserva;
    }

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
