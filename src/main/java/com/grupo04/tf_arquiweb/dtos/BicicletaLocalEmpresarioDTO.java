package com.grupo04.tf_arquiweb.dtos;



public class BicicletaLocalEmpresarioDTO {


    private String bicicletamodelo;


    private Boolean bicicletaestado;


    private double bicicletaprecio; //ver esto (money)**********


    private int bicicletanumaro;


    private String bicicletadetalles;


    private String bicicletafoto;

    public String getBicicletamodelo() {
        return bicicletamodelo;
    }

    public void setBicicletamodelo(String bicicletamodelo) {
        this.bicicletamodelo = bicicletamodelo;
    }

    public Boolean getBicicletaestado() {
        return bicicletaestado;
    }

    public void setBicicletaestado(Boolean bicicletaestado) {
        this.bicicletaestado = bicicletaestado;
    }

    public double getBicicletaprecio() {
        return bicicletaprecio;
    }

    public void setBicicletaprecio(double bicicletaprecio) {
        this.bicicletaprecio = bicicletaprecio;
    }

    public int getBicicletanumaro() {
        return bicicletanumaro;
    }

    public void setBicicletanumaro(int bicicletanumaro) {
        this.bicicletanumaro = bicicletanumaro;
    }

    public String getBicicletadetalles() {
        return bicicletadetalles;
    }

    public void setBicicletadetalles(String bicicletadetalles) {
        this.bicicletadetalles = bicicletadetalles;
    }

    public String getBicicletafoto() {
        return bicicletafoto;
    }

    public void setBicicletafoto(String bicicletafoto) {
        this.bicicletafoto = bicicletafoto;
    }
}
