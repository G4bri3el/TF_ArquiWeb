package com.grupo04.tf_arquiweb.entities;

import jakarta.persistence.*;

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

    //private LocalFoto *************+

    @ManyToOne
    @JoinColumn(name ="UserID")
    private Usuarios user;

    public Local(){

    }

    public Local(int localID, String localDireccion, String localNombre, Usuarios user) {
        LocalID = localID;
        LocalDireccion = localDireccion;
        LocalNombre = localNombre;
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

    public void setUser(Usuarios user) {
        this.user = user;
    }
}
