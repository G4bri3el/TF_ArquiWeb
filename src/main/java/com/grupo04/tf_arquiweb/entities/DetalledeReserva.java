package com.grupo04.tf_arquiweb.entities;

import jakarta.persistence.*;

@Entity
@Table(name="DetalledeReserva")
public class DetalledeReserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int DetalleID;

    @ManyToOne
    @JoinColumn(name="ReservaID")
    private Reserva reserva;

    @ManyToOne
    @JoinColumn(name="BicicletaID")
    private Bicicleta bicicleta;


    public DetalledeReserva(){

    }

    public DetalledeReserva(int detalleID, Reserva reserva, Bicicleta bicicleta) {
        DetalleID = detalleID;
        this.reserva = reserva;
        this.bicicleta = bicicleta;
    }

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
