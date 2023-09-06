package com.grupo04.tf_arquiweb.dtos;

import com.grupo04.tf_arquiweb.entities.Bicicleta;
import com.grupo04.tf_arquiweb.entities.Reserva;

public class DetalledeReservaDTO {

    private int DetalleID;

    private Reserva reserva;

    private Bicicleta bicicleta;

    public int getDetalleID() {
        return DetalleID;
    }

    public void setDetalleID(int detalleID) {
        DetalleID = detalleID;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public Bicicleta getBicicleta() {
        return bicicleta;
    }

    public void setBicicleta(Bicicleta bicicleta) {
        this.bicicleta = bicicleta;
    }
}
