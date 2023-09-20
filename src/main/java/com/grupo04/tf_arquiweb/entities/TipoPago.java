package com.grupo04.tf_arquiweb.entities;

import jakarta.persistence.*;

@Entity
@Table(name="TipoPago")
public class TipoPago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int TipoPagoId;

    @Column(name = "TipoPagoModo",nullable = false,length = 50)
    private String TipoPagoModo;

    public TipoPago() {
    }

    public TipoPago(int tipoPagoId, String tipoPagoModo) {
        TipoPagoId = tipoPagoId;
        TipoPagoModo = tipoPagoModo;
    }

    public int getTipoPagoId() {
        return TipoPagoId;
    }

    public void setTipoPagoId(int tipoPagoId) {
        TipoPagoId = tipoPagoId;
    }

    public String getTipoPagoModo() {
        return TipoPagoModo;
    }

    public void setTipoPagoModo(String tipoPagoModo) {
        TipoPagoModo = tipoPagoModo;
    }
}
