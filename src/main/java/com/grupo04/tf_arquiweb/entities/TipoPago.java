package com.grupo04.tf_arquiweb.entities;

import jakarta.persistence.*;

@Entity
@Table(name="TipoPago")
public class TipoPago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tipopagoid;

    @Column(name = "TipoPagoModo",nullable = false,length = 50)
    private String tipopagomodo;

    public TipoPago() {
    }

    public TipoPago(int tipopagoid, String tipopagomodo) {
        this.tipopagoid = tipopagoid;
        this.tipopagomodo = tipopagomodo;
    }

    public int getTipopagoid() {
        return tipopagoid;
    }

    public void setTipopagoid(int tipopagoid) {
        this.tipopagoid = tipopagoid;
    }

    public String getTipopagomodo() {
        return tipopagomodo;
    }

    public void setTipopagomodo(String tipopagomodo) {
        this.tipopagomodo = tipopagomodo;
    }
}
