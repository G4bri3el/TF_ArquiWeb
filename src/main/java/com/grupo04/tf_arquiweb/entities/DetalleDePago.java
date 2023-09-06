package com.grupo04.tf_arquiweb.entities;

import jakarta.persistence.*;

@Entity
@Table(name="DetalleDePago")
public class DetalleDePago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int DetalleDePagoID;
    @OneToOne
    @JoinColumn(name="ReservaID")
    private Reserva reserva;

    public DetalleDePago() {
    }

    public DetalleDePago(int detalleDePagoID, Reserva reserva) {
        DetalleDePagoID = detalleDePagoID;
        this.reserva = reserva;
    }

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
