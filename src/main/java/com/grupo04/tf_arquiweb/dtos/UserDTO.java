package com.grupo04.tf_arquiweb.dtos;


public class UserDTO {
    private int User_ID;
    private String User_Nombre;
    private String User_Apellido;
    private String User_Correo;
    private String User_Contrasena;
    private int User_Telefono;
    private byte User_Esadmin;

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
