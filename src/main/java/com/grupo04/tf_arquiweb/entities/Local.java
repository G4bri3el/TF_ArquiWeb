package com.grupo04.tf_arquiweb.entities;

import jakarta.persistence.*;

import java.awt.Image;

@Entity
@Table(name = "Local")
public class Local {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int LocalID;

    @Column(name = "LocalDireccion", length = 50, nullable = false)
    private String LocalDireccion;
    @Column(name = "LocalNombre", length = 50, nullable = false)
    private String LocalNombre;

    @Column(name = "LocalFoto", length = 50, nullable = false)
    private String LocalFoto;
    @ManyToOne
    @JoinColumn(name = "UserID")
    private Usuarios user;

    public Local() {

    }

    public Local(int localID, String localDireccion, String localNombre, String localFoto, Usuarios user) {
        LocalID = localID;
        LocalDireccion = localDireccion;
        LocalNombre = localNombre;
        LocalFoto = localFoto;
        this.user = user;
    }

    public int getLocalID() {
        return LocalID;
    }

    public void setLocalID(int localID) {
        LocalID = localID;
    }

    public String getLocalDireccion() {
        return LocalDireccion;
    }

    public void setLocalDireccion(String localDireccion) {
        LocalDireccion = localDireccion;
    }

    public String getLocalNombre() {
        return LocalNombre;
    }

    public void setLocalNombre(String localNombre) {
        LocalNombre = localNombre;
    }

    public Usuarios getUser() {
        return user;
    }

    public String getLocalFoto() {
        return LocalFoto;
    }

    public void setLocalFoto(String localFoto) {
        LocalFoto = localFoto;
    }

    public void setUser(Usuarios user) {
        this.user = user;
    }
}
