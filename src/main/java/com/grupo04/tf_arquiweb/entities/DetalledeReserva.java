package com.grupo04.tf_arquiweb.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.Cascade;

@Entity
@Table(name="DetalledeReserva")
public class DetalledeReserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int detalleId;

    @ManyToOne()
    @JoinColumn(name="ReservaId")
    private Reserva reserva;

    @ManyToOne()
    @JoinColumn(name="BicicletaId")
    private Bicicleta bicicleta;


    public DetalledeReserva(){

    }

    public DetalledeReserva(int detalleId, Reserva reserva, Bicicleta bicicleta) {
        this.detalleId = detalleId;
        this.reserva = reserva;
        this.bicicleta = bicicleta;
    }

    public int getDetalleId() {
        return detalleId;
    }

    public void setDetalleId(int detalleId) {
        this.detalleId = detalleId;
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
