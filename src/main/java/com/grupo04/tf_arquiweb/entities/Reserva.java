package com.grupo04.tf_arquiweb.entities;

import jakarta.persistence.*;

@Entity
@Table (name = "Reserva")
public class Reserva {

    @Id//anotación para marcar atributo como ID
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ReservaID;

    @Column(name = "ReservaEstado", nullable = false)
    private Boolean ReservaEstado;

    @ManyToOne
    @JoinColumn(name="UserID")
    private Usuarios user;

    public Reserva(){

    }

    public Reserva(int rerservaID, Boolean reservaEstado, Usuarios user) {
        ReservaID = rerservaID;
        ReservaEstado = reservaEstado;
        this.user = user;
    }

    public int getRerservaID() {
        return ReservaID;
    }

    public void setRerservaID(int rerservaID) {
        ReservaID = rerservaID;
    }

    public Boolean getReservaEstado() {
        return ReservaEstado;
    }

    public void setReservaEstado(Boolean reservaEstado) {
        ReservaEstado = reservaEstado;
    }

    public Usuarios getUser() {
        return user;
    }

    public void setUser(Usuarios user) {
        this.user = user;
    }
}
