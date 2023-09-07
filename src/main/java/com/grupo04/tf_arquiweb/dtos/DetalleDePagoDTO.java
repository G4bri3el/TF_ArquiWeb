package com.grupo04.tf_arquiweb.dtos;

import com.grupo04.tf_arquiweb.entities.DetalleDePago;
import com.grupo04.tf_arquiweb.entities.Reserva;

public class DetalleDePagoDTO {
    private int DetalleDePagoId;
    private Reserva reserva;

    public int getDetalleDePagoID() {
        return DetalleDePagoId;
    }

    public void setDetalleDePagoId(int detalleDePagoId) {
        DetalleDePagoId = detalleDePagoId;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }
}
