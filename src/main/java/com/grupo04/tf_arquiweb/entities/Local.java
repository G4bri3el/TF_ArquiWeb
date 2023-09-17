package com.grupo04.tf_arquiweb.entities;

import javax.persistence.*;


import java.awt.Image;

@Entity
@Table(name = "Local")
public class Local {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int LocalId;

    @Column(name = "LocalDireccion", length = 50, nullable = false)
    private String LocalDireccion;
    @Column(name = "LocalNombre", length = 50, nullable = false)
    private String LocalNombre;

    @Column(name = "LocalFoto", length = 50, nullable = false)
    private String LocalFoto;
    @ManyToOne
    @JoinColumn(name = "UsuarioId")
    private Usuario usuario;

    public Local() {

    }

    public Local(int localId, String localDireccion, String localNombre, String localFoto, Usuario usuario) {
        LocalId = localId;
        LocalDireccion = localDireccion;
        LocalNombre = localNombre;
        LocalFoto = localFoto;
        this.usuario = usuario;
    }

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
