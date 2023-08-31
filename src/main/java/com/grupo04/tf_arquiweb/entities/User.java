package com.grupo04.tf_arquiweb.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int User_ID;

    @Column(name = "User_Nombre",nullable = false,length = 50)
    private String User_Nombre;
    @Column(name = "User_Apellido",nullable = false,length = 50)
    private String User_Apellido;
    @Column(name = "User_Correo",nullable = false,length = 50)
    private String User_Correo;
    @Column(name = "User_Contrasena",nullable = false,length = 50)
    private String User_Contrasena;
    @Column(name = "User_Telefono",nullable = false)
    private int User_Telefono;
    @Column(name = "User_Esadmin",nullable = false)
    private byte User_Esadmin;

    public User() {
    }
    public User(int user_ID, String user_Nombre, String user_Apellido, String user_Correo, String user_Contrasena, int user_Telefono, byte user_Esadmin) {
        this.User_ID = user_ID;
        this.User_Nombre = user_Nombre;
        this.User_Apellido = user_Apellido;
        this.User_Correo = user_Correo;
        this.User_Contrasena = user_Contrasena;
        this.User_Telefono = user_Telefono;
        this.User_Esadmin = user_Esadmin;
    }

    public int getUser_ID() {
        return User_ID;
    }

    public void setUser_ID(int user_ID) {
        User_ID = user_ID;
    }

    public String getUser_Nombre() {
        return User_Nombre;
    }

    public void setUser_Nombre(String user_Nombre) {
        User_Nombre = user_Nombre;
    }

    public String getUser_Apellido() {
        return User_Apellido;
    }

    public void setUser_Apellido(String user_Apellido) {
        User_Apellido = user_Apellido;
    }

    public String getUser_Correo() {
        return User_Correo;
    }

    public void setUser_Correo(String user_Correo) {
        User_Correo = user_Correo;
    }

    public String getUser_Contrasena() {
        return User_Contrasena;
    }

    public void setUser_Contrasena(String user_Contrasena) {
        User_Contrasena = user_Contrasena;
    }

    public int getUser_Telefono() {
        return User_Telefono;
    }

    public void setUser_Telefono(int user_Telefono) {
        User_Telefono = user_Telefono;
    }

    public byte isUser_Esadmin() {
        return User_Esadmin;
    }

    public void setUser_EsAdmin(byte user_Esadmin) {
        User_Esadmin = user_Esadmin;
    }
}
