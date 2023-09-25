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
    private Date reservafechaInicio;

    @Column(name = "ReservaFechaFin", nullable = false)
    private Date reservafechaFin;

    @ManyToOne
    @JoinColumn(name = "UsuarioId")
    private Usuario usuario;

    @Column(name = "ReservaMontoTotal", nullable = false)
    private int reservamontoTotal;

    public Reserva() {
    }

    public Reserva(int reservaid, Date reservafechaInicio, Date reservafechaFin, Usuario usuario, int reservamontoTotal) {
        this.reservaid = reservaid;
        this.reservafechaInicio = reservafechaInicio;
        this.reservafechaFin = reservafechaFin;
        this.usuario = usuario;
        this.reservamontoTotal = reservamontoTotal;
    }

    public int getReservaid() {
        return reservaid;
    }

    public void setReservaid(int reservaid) {
        this.reservaid = reservaid;
    }

    public Date getReservafechaInicio() {
        return reservafechaInicio;
    }

    public void setReservafechaInicio(Date reservafechaInicio) {
        this.reservafechaInicio = reservafechaInicio;
    }

    public Date getReservafechaFin() {
        return reservafechaFin;
    }

    public void setReservafechaFin(Date reservafechaFin) {
        this.reservafechaFin = reservafechaFin;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public int getReservamontoTotal() {
        return reservamontoTotal;
    }

    public void setReservamontoTotal(int reservamontoTotal) {
        this.reservamontoTotal = reservamontoTotal;
    }
}
