package com.grupo04.tf_arquiweb.entities;

import jakarta.persistence.*;

@Entity
@Table(name="DetalledeReserva")
public class DetalledeReserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int DetalleId;

    @ManyToOne
    @JoinColumn(name="ReservaId")
    private Reserva reserva;

    @ManyToOne
    @JoinColumn(name="BicicletaId")
    private Bicicleta bicicleta;


    public DetalledeReserva(){

    }

    public DetalledeReserva(int detalleId, Reserva reserva, Bicicleta bicicleta) {
        DetalleId = detalleId;
        this.reserva = reserva;
        this.bicicleta = bicicleta;
    }

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
