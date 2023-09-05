package com.grupo04.tf_arquiweb.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int UserID;

    @Column(name = "User_Nombre",nullable = false,length = 50)
    private String UserNombre;
    @Column(name = "User_Apellido",nullable = false,length = 50)
    private String UserApellido;
    @Column(name = "User_Correo",nullable = false,length = 50)
    private String UserCorreo;
    @Column(name = "User_Contrasena",nullable = false,length = 50)
    private String UserContrasena;
    @Column(name = "User_Telefono",nullable = false)
    private int UserTelefono;
    @Column(name = "User_Esadmin",nullable = false)
    private byte UserEsadmin;

    public User() {
    }

    public User(int userID, String userNombre, String userApellido, String userCorreo, String userContrasena, int userTelefono, byte userEsadmin) {
        UserID = userID;
        UserNombre = userNombre;
        UserApellido = userApellido;
        UserCorreo = userCorreo;
        UserContrasena = userContrasena;
        UserTelefono = userTelefono;
        UserEsadmin = userEsadmin;
    }

    public int getUserID() {
        return UserID;
    }

    public void setUserID(int userID) {
        UserID = userID;
    }

    public String getUserNombre() {
        return UserNombre;
    }

    public void setUserNombre(String userNombre) {
        UserNombre = userNombre;
    }

    public String getUserApellido() {
        return UserApellido;
    }

    public void setUserApellido(String userApellido) {
        UserApellido = userApellido;
    }

    public String getUserCorreo() {
        return UserCorreo;
    }

    public void setUserCorreo(String userCorreo) {
        UserCorreo = userCorreo;
    }

    public String getUserContrasena() {
        return UserContrasena;
    }

    public void setUserContrasena(String userContrasena) {
        UserContrasena = userContrasena;
    }

    public int getUserTelefono() {
        return UserTelefono;
    }

    public void setUserTelefono(int userTelefono) {
        UserTelefono = userTelefono;
    }

    public byte getUserEsadmin() {
        return UserEsadmin;
    }

    public void setUserEsadmin(byte userEsadmin) {
        UserEsadmin = userEsadmin;
    }
}
