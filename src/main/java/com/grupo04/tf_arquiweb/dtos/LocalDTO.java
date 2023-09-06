package com.grupo04.tf_arquiweb.dtos;

import com.grupo04.tf_arquiweb.entities.Usuarios;
import jakarta.persistence.*;

public class LocalDTO {

    private int LocalID;

    private String LocalDireccion;

    private String LocalNombre;

    //private LocalFoto;

    private Usuarios user;

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

    public void setUser(Usuarios user) {
        this.user = user;
    }
}
