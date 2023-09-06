package com.grupo04.tf_arquiweb.dtos;

import com.grupo04.tf_arquiweb.entities.Local;


public class BicicletaDTO {

    private int BicicletaID;

    private String BicicletaModelo;

    private Boolean BicicletaEstado;

    private double BicicletaPrecio; //ver esto (money)**********

    private int BicicletaNumAro;

    private String BicicletaDetalles;

    //FOTO ***************

    private Local local;

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
