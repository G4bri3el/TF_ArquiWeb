package com.grupo04.tf_arquiweb.dtos;

import com.grupo04.tf_arquiweb.entities.Bicicleta;
import com.grupo04.tf_arquiweb.entities.Reserva;

public class DetalledeReservaDTO {

    private int DetalleId;

    private Reserva reserva;

    private Bicicleta bicicleta;

    public int getDetalleId() {
        return DetalleId;
    }

    public void setDetalleId(int detalleId) {
        DetalleId = detalleId;
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
