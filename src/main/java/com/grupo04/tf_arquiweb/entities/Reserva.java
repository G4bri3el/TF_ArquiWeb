package com.grupo04.tf_arquiweb.entities;
import javax.persistence.*;


import java.util.Date;

@Entity
@Table (name = "Reserva")
public class Reserva {

    @Id//anotación para marcar atributo como ID
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ReservaId;


    @Column(name="ReservaFechaInicio", nullable = false)
    private Date ReservaFechaInicio;

    @Column(name="ReservaFechaFin", nullable = false)
    private Date ReservaFechaFin;

    @Column(name = "ReservaMontoTotal", nullable = false)
    private int ReservaMontoTotal;

    @ManyToOne
    @JoinColumn(name="UsuarioId")
    private Usuario usuario;


    public Reserva(){

    }

    public Reserva(int reservaId, Date reservaFechaInicio, Date reservaFechaFin, Usuario usuario, int reservaMontoTotal) {
        ReservaId = reservaId;
        ReservaFechaInicio = reservaFechaInicio;
        ReservaFechaFin = reservaFechaFin;
        this.usuario = usuario;
        ReservaMontoTotal= reservaMontoTotal;
    }

    public int getReservaId() {
        return ReservaId;
    }

    public void setReservaId(int reservaId) {
        ReservaId = reservaId;
    }

    public Date getReservaFechaInicio() {
        return ReservaFechaInicio;
    }

    public void setReservaFechaInicio(Date reservaFechaInicio) {
        ReservaFechaInicio = reservaFechaInicio;
    }

    public Date getReservaFechaFin() {
        return ReservaFechaFin;
    }

    public void setReservaFechaFin(Date reservaFechaFin) {
        ReservaFechaFin = reservaFechaFin;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public int getReservaMontoTotal() {
        return ReservaMontoTotal;
    }

    public void setReservaMontoTotal(int reservaMontoTotal) {
        ReservaMontoTotal = reservaMontoTotal;
    }
}
