package com.grupo04.tf_arquiweb.entities;

import jakarta.persistence.*;

@Entity
@Table (name = "Reserva")
public class Reserva {

    @Id//anotación para marcar atributo como ID
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ReservaId;

    @ManyToOne
    @JoinColumn(name="UsuarioId")
    private Usuario usuario;

    public Reserva(){

    }

    public Reserva(int reservaId, Usuario usuario) {
        ReservaId = reservaId;
        this.usuario = usuario;
    }


    public int getReservaId() {
        return ReservaId;
    }

    public void setReservaId(int reservaId) {
        ReservaId = reservaId;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
