package com.grupo04.tf_arquiweb.entities;


import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "Roles", uniqueConstraints = { @UniqueConstraint(columnNames = { "user_id", "rol" }) })
public class Roles implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int RolesId;

    @Column(name = "Rol", nullable = false, length = 50)
    private String Rol;

    public Roles() {

    }

    public Roles(int rolesId, String rol) {
        RolesId = rolesId;
        Rol = rol;
    }

    public int getRolesId() {
        return RolesId;
    }

    public void setRolesId(int rolesId) {
        RolesId = rolesId;
    }

    public String getRol() {
        return Rol;
    }

    public void setRol(String rol) {
        Rol = rol;
    }
}
