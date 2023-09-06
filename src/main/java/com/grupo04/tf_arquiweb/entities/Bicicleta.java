package com.grupo04.tf_arquiweb.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Bicicleta")
public class Bicicleta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int BicicletaID;

    @Column(name="BicicletaModelo", length = 50, nullable = false)
    private String BicicletaModelo;

    @Column(name="BicicletaEstado", nullable = false)
    private Boolean BicicletaEstado;

    @Column(name="BicicletaPrecio",nullable = false)
    private double BicicletaPrecio; //ver esto (money)**********

    @Column(name="BicicletaNumAro", nullable = false)
    private int BicicletaNumAro;

    @Column(name="BicicletaDetalles",length = 100, nullable = false)
    private String BicicletaDetalles;

    //FOTO ***************

    @ManyToOne
    @JoinColumn(name ="LocalID")
    private Local local;

    public Bicicleta(){

    }
    public Bicicleta(int bicicletaID, String bicicletaModelo, Boolean bicicletaEstado, double bicicletaPrecio, int bicicletaNumAro, String bicicletaDetalles, Local local) {
        BicicletaID = bicicletaID;
        BicicletaModelo = bicicletaModelo;
        BicicletaEstado = bicicletaEstado;
        BicicletaPrecio = bicicletaPrecio;
        BicicletaNumAro = bicicletaNumAro;
        BicicletaDetalles = bicicletaDetalles;
        this.local = local;
    }

    public int getBicicletaID() {
        return BicicletaID;
    }

    public void setBicicletaID(int bicicletaID) {
        BicicletaID = bicicletaID;
    }

    public String getBicicletaModelo() {
        return BicicletaModelo;
    }

    public void setBicicletaModelo(String bicicletaModelo) {
        BicicletaModelo = bicicletaModelo;
    }

    public Boolean getBicicletaEstado() {
        return BicicletaEstado;
    }

    public void setBicicletaEstado(Boolean bicicletaEstado) {
        BicicletaEstado = bicicletaEstado;
    }

    public double getBicicletaPrecio() {
        return BicicletaPrecio;
    }

    public void setBicicletaPrecio(double bicicletaPrecio) {
        BicicletaPrecio = bicicletaPrecio;
    }

    public int getBicicletaNumAro() {
        return BicicletaNumAro;
    }

    public void setBicicletaNumAro(int bicicletaNumAro) {
        BicicletaNumAro = bicicletaNumAro;
    }

    public String getBicicletaDetalles() {
        return BicicletaDetalles;
    }

    public void setBicicletaDetalles(String bicicletaDetalles) {
        BicicletaDetalles = bicicletaDetalles;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}