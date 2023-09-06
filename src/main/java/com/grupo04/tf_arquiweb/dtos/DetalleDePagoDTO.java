package com.grupo04.tf_arquiweb.dtos;

import com.grupo04.tf_arquiweb.entities.DetalleDePago;

public class DetalleDePagoDTO {
    private int DetalleDePagoID;
    private DetalleDePago detalleDePago;

    public int getDetalleDePagoID() {
        return DetalleDePagoID;
    }

    public void setDetalleDePagoID(int detalleDePagoID) {
        DetalleDePagoID = detalleDePagoID;
    }

    public DetalleDePago getDetalleDePago() {
        return detalleDePago;
    }

    public void setDetalleDePago(DetalleDePago detalleDePago) {
        this.detalleDePago = detalleDePago;
    }
}
