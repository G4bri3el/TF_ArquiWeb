package com.grupo04.tf_arquiweb.dtos;

import com.grupo04.tf_arquiweb.entities.DetalleDePago;
import com.grupo04.tf_arquiweb.entities.Reserva;

public class DetalleDePagoDTO {
    private int DetalleDePagoID;
    private Reserva reserva;

    public int getDetalleDePagoID() {
        return DetalleDePagoID;
    }

    public void setDetalleDePagoID(int detalleDePagoID) {
        DetalleDePagoID = detalleDePagoID;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }
}
