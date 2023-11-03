package com.grupo04.tf_arquiweb.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Reserva")
public class Reserva {

    @Id//anotación para marcar atributo como ID
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int reservaid;


    @Column(name = "ReservaFechaInicio", nullable = false)
    private Date reservafechainicio;

    @Column(name = "ReservaFechaFin", nullable = false)
    private Date reservafechafin;

    @Column(name = "ReservaMontoTotal", nullable = false)
    private int reservamontototal;
    @ManyToOne
    @JoinColumn(name = "UsuarioId")
    private Usuario usuario;

    public Reserva() {
    }

    public Reserva(int reservaid, Date reservafechainicio, Date reservafechafin, Usuario usuario, int reservamontototal) {
        this.reservaid = reservaid;
        this.reservafechainicio = reservafechainicio;
        this.reservafechafin = reservafechafin;
        this.usuario = usuario;
        this.reservamontototal = reservamontototal;
    }

    public int getReservaid() {
        return reservaid;
    }

    public void setReservaid(int reservaid) {
        this.reservaid = reservaid;
    }

    public Date getReservafechainicio() {
        return reservafechainicio;
    }

    public void setReservafechainicio(Date reservafechainicio) {
        this.reservafechainicio = reservafechainicio;
    }

    public Date getReservafechafin() {
        return reservafechafin;
    }

    public void setReservafechafin(Date reservafechafin) {
        this.reservafechafin = reservafechafin;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public int getReservamontototal() {
        return reservamontototal;
    }

    public void setReservamontototal(int reservamontototal) {
        this.reservamontototal = reservamontototal;
    }
}
