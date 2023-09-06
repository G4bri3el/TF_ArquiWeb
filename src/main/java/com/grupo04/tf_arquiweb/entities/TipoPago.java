package com.grupo04.tf_arquiweb.entities;

import jakarta.persistence.*;

@Entity
@Table(name="TipoPago")
public class TipoPago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int TipoPagoID;
    private String TipoPagoModo;

    public TipoPago() {
    }

    public TipoPago(int tipoPagoID, String tipoPagoModo) {
        TipoPagoID = tipoPagoID;
        TipoPagoModo = tipoPagoModo;
    }

    public int getTipoPagoID() {
        return TipoPagoID;
    }

    public void setTipoPagoID(int tipoPagoID) {
        TipoPagoID = tipoPagoID;
    }

    public String getTipoPagoModo() {
        return TipoPagoModo;
    }

    public void setTipoPagoModo(String tipoPagoModo) {
        TipoPagoModo = tipoPagoModo;
    }
}
