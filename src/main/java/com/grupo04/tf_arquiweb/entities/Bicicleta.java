package com.grupo04.tf_arquiweb.entities;

import jakarta.persistence.*;



@Entity
@Table(name = "Bicicleta")
public class Bicicleta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bicicletaid;

    @Column(name = "BicicletaModelo", nullable = false, length = 50)
    private String bicicletamodelo;

    @Column(name = "BicicletaEstado", nullable = false)
    private Boolean bicicletaestado;

    @Column(name = "BicicletaPrecio", nullable = false)
    private double bicicletaprecio; //ver esto (money)**********

    @Column(name = "BicicletaNumAro", nullable = false)
    private int bicicletanumaro;

    @Column(name = "BicicletaDetalles", nullable = false, length = 100)
    private String bicicletadetalles;

    @Column(name = "BicicletaFoto", nullable = false, length = 100)
    private String bicicletafoto;

    @ManyToOne
    @JoinColumn(name = "LocalId")
    private Local local;

    public Bicicleta() {

    }

    public Bicicleta(int bicicletaid, String bicicletamodelo, Boolean bicicletaestado, double bicicletaprecio, int bicicletanumaro, String bicicletadetalles, String bicicletafoto, Local local) {
        this.bicicletaid = bicicletaid;
        this.bicicletamodelo = bicicletamodelo;
        this.bicicletaestado = bicicletaestado;
        this.bicicletaprecio = bicicletaprecio;
        this.bicicletanumaro = bicicletanumaro;
        this.bicicletadetalles = bicicletadetalles;
        this.bicicletafoto = bicicletafoto;
        this.local = local;
    }

    public int getBicicletaid() {
        return bicicletaid;
    }

    public void setBicicletaid(int bicicletaid) {
        this.bicicletaid = bicicletaid;
    }

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

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
