package com.grupo04.tf_arquiweb.entities;

import jakarta.persistence.*;

@Entity
@Table (name = "Reserva")
public class Reserva {

    @Id//anotación para marcar atributo como ID
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int RerservaID;

    @Column(name = "ReservaEstado", nullable = false)
    private Boolean ReservaEstado;

    @ManyToOne
    @JoinColumn(name="UserID")
    private User user;

    public Reserva(){

    }

    public Reserva(int rerservaID, Boolean reservaEstado, User user) {
        RerservaID = rerservaID;
        ReservaEstado = reservaEstado;
        this.user = user;
    }

    public int getRerservaID() {
        return RerservaID;
    }

    public void setRerservaID(int rerservaID) {
        RerservaID = rerservaID;
    }

    public Boolean getReservaEstado() {
        return ReservaEstado;
    }

    public void setReservaEstado(Boolean reservaEstado) {
        ReservaEstado = reservaEstado;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
