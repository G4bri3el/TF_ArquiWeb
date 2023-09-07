package com.grupo04.tf_arquiweb.dtos;

import com.grupo04.tf_arquiweb.entities.Usuario;
import jakarta.persistence.Column;

import java.util.Date;

public class ReservaDTO {

    private int ReservaId;

    private Date ReservaFechaInicio;


    private Date ReservaFechaFin;

    private Usuario usuario;

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
}
