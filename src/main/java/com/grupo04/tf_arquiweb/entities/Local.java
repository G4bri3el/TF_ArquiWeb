package com.grupo04.tf_arquiweb.entities;

import jakarta.persistence.*;

import java.awt.Image;

@Entity
@Table(name = "Local")
public class Local {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int localid;

    @Column(name = "LocalDireccion", length = 50, nullable = false)
    private String localdireccion;
    @Column(name = "LocalNombre", length = 50, nullable = false)
    private String localnombre;

    @Column(name = "LocalFoto", length = 50, nullable = false)
    private String localfoto;
    @ManyToOne
    @JoinColumn(name = "UsuarioId")
    private Usuario usuario;

    public Local() {

    }

    public Local(int localid, String localdireccion, String localnombre, String localfoto, Usuario usuario) {
        this.localid = localid;
        this.localdireccion = localdireccion;
        this.localnombre = localnombre;
        this.localfoto = localfoto;
        this.usuario = usuario;
    }

    public int getLocalid() {
        return localid;
    }

    public void setLocalid(int localid) {
        this.localid = localid;
    }

    public String getLocaldireccion() {
        return localdireccion;
    }

    public void setLocaldireccion(String localdireccion) {
        this.localdireccion = localdireccion;
    }

    public String getLocalnombre() {
        return localnombre;
    }

    public void setLocalnombre(String localnombre) {
        this.localnombre = localnombre;
    }

    public String getLocalfoto() {
        return localfoto;
    }

    public void setLocalfoto(String localfoto) {
        this.localfoto = localfoto;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
