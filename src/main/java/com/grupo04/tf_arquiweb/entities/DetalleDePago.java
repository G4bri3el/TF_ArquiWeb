package com.grupo04.tf_arquiweb.entities;

import jakarta.persistence.*;

@Entity
@Table(name="DetalleDePago")
public class DetalleDePago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int DetalleDePagoId;
    @OneToOne
    @JoinColumn(name="ReservaId")
    private Reserva reserva;

    public DetalleDePago() {
    }

    public DetalleDePago(int detalleDePagoId, Reserva reserva) {
        DetalleDePagoId = detalleDePagoId;
        this.reserva = reserva;
    }

    public int getDetalleDePagoId() {
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
