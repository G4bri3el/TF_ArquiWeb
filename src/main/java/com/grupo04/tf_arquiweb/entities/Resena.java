package com.grupo04.tf_arquiweb.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Resena")
public class Resena {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int resenaid;
    @Column(name = "ResenaEstrellas", nullable = false)
    private int resenaestrellas;
    @Column(name = "ResenaComentario", length = 200, nullable = false)
    private String resenacomentario;
    @OneToOne
    @JoinColumn(name = "ReservaId")
    private Reserva reserva;

    public Resena() {

    }

    public Resena(int resenaid, int resenaestrellas, String resenacomentario, Reserva reserva) {
        this.resenaid = resenaid;
        this.resenaestrellas = resenaestrellas;
        this.resenacomentario = resenacomentario;
        this.reserva = reserva;
    }

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
