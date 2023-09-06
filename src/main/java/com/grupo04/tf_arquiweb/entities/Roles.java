package com.grupo04.tf_arquiweb.entities;


import jakarta.persistence.*;

@Entity
@Table(name = "Roles")
public class Roles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int RolesID;

    @Column(name = "Rol", nullable = false, length = 50)
    private String Rol;

    public Roles() {

    }
    public Roles(int rolesID, String rol) {
        RolesID = rolesID;
        Rol = rol;
    }

    public int getRolesID() {
        return RolesID;
    }

    public void setRolesID(int rolesID) {
        RolesID = rolesID;
    }

    public String getRol() {
        return Rol;
    }

    public void setRol(String rol) {
        Rol = rol;
    }
}
