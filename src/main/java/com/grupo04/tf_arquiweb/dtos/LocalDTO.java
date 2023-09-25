package com.grupo04.tf_arquiweb.dtos;

import com.grupo04.tf_arquiweb.entities.Usuario;


public class LocalDTO {


    private int localid;

    private String localdireccion;

    private String localnombre;


    private String localfoto;

    private Usuario usuario;

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
