package com.grupo04.tf_arquiweb.dtos;

public class ReservaLocalDTO {

    private String nombrelocal;
    private int cantidadreservas;

    public String getNombrelocal() {
        return nombrelocal;
    }

    public void setNombrelocal(String nombrelocal) {
        this.nombrelocal = nombrelocal;
    }

    public int getCantidadreservas() {
        return cantidadreservas;
    }

    public void setCantidadreservas(int cantidadreservas) {
        this.cantidadreservas = cantidadreservas;
    }
}
