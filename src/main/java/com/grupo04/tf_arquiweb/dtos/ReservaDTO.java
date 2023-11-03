package com.grupo04.tf_arquiweb.dtos;

import com.grupo04.tf_arquiweb.entities.Usuario;

import java.util.Date;

public class ReservaDTO {

    private int reservaid;

    private Date reservafechainicio;


    private Date reservafechafin;

    private int reservamontototal;

    private Usuario usuario;

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
