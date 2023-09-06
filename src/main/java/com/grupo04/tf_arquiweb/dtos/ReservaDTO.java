package com.grupo04.tf_arquiweb.dtos;

import com.grupo04.tf_arquiweb.entities.Usuario;

public class ReservaDTO {

    private int ReservaId;

    private Usuario usuario;

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
