package com.grupo04.tf_arquiweb.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Resena")
public class Resena {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int resenaId;
    @Column(name = "ResenaEstrellas", nullable = false)
    private int resenaestrellas;
    @Column(name = "ResenaComentario", length = 200, nullable = false)
    private String resenacomentario;
    @OneToOne
    @JoinColumn(name = "ReservaId")
    private Reserva reserva;

    public Resena() {

    }

    public Resena(int resenaId, int resenaestrellas, String resenacomentario, Reserva reserva) {
        this.resenaId = resenaId;
        this.resenaestrellas = resenaestrellas;
        this.resenacomentario = resenacomentario;
        this.reserva = reserva;
    }

    public int getResenaId() {
        return resenaId;
    }

    public void setResenaId(int resenaId) {
        this.resenaId = resenaId;
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
