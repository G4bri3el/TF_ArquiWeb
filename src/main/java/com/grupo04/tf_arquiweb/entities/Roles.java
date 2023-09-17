package com.grupo04.tf_arquiweb.entities;



import javax.persistence.*;

@Entity
@Table(name = "Roles")
public class Roles {
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
