package com.grupo04.tf_arquiweb.dtos;

import com.grupo04.tf_arquiweb.entities.Usuarios;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class ReservaDTO {

    private int ReservaID;

    private Usuarios user;

    public ReservaDTO(int reservaID, Usuarios user) {
        ReservaID = reservaID;
        this.user = user;
    }

    public int getReservaID() {
        return ReservaID;
    }

    public void setReservaID(int reservaID) {
        ReservaID = reservaID;
    }

    public Usuarios getUser() {
        return user;
    }

    public void setUser(Usuarios user) {
        this.user = user;
    }
}
