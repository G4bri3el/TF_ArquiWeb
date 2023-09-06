package com.grupo04.tf_arquiweb.entities;

import jakarta.persistence.*;

@Entity
@Table (name = "Reserva")
public class Reserva {

    @Id//anotación para marcar atributo como ID
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ReservaId;

    @ManyToOne
    @JoinColumn(name="UserId")
    private Usuario user;

    public Reserva(){

    }

    public Reserva(int reservaId, Usuario user) {
        ReservaId = reservaId;
        this.user = user;
    }


    public int getReservaId() {
        return ReservaId;
    }

    public void setReservaId(int reservaId) {
        ReservaId = reservaId;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }
}
