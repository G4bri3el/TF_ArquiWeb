package com.grupo04.tf_arquiweb.dtos;

import com.grupo04.tf_arquiweb.entities.Usuario;

public class LocalDTO {

    private int LocalId;

    private String LocalDireccion;

    private String LocalNombre;

    private String LocalFoto;
    private Usuario usuario;

    public int getLocalId() {
        return LocalId;
    }

    public void setLocalId(int localId) {
        LocalId = localId;
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

    public String getLocalFoto() {
        return LocalFoto;
    }

    public void setLocalFoto(String localFoto) {
        LocalFoto = localFoto;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
