package com.grupo04.tf_arquiweb.dtos;


import com.grupo04.tf_arquiweb.entities.Roles;

public class UsuarioDTO {

    private String UserCorreo;

    private String UserContrasena;

    private int UserTelefono;

    private String UserNombre;

    private String UserApellido;

    private String UserDni;

    private int UserEdad;

    private String UserCiudad;

    private String UserFoto;

    private String UserRazonsocial;

    private String UserDireccion;

    private String UserRuc;

    private Roles Rol;

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

    public String getUserDni() {
        return UserDni;
    }

    public void setUserDni(String userDni) {
        UserDni = userDni;
    }

    public int getUserEdad() {
        return UserEdad;
    }

    public void setUserEdad(int userEdad) {
        UserEdad = userEdad;
    }

    public String getUserCiudad() {
        return UserCiudad;
    }

    public void setUserCiudad(String userCiudad) {
        UserCiudad = userCiudad;
    }

    public String getUserFoto() {
        return UserFoto;
    }

    public void setUserFoto(String userFoto) {
        UserFoto = userFoto;
    }

    public String getUserRazonsocial() {
        return UserRazonsocial;
    }

    public void setUserRazonsocial(String userRazonsocial) {
        UserRazonsocial = userRazonsocial;
    }

    public String getUserDireccion() {
        return UserDireccion;
    }

    public void setUserDireccion(String userDireccion) {
        UserDireccion = userDireccion;
    }

    public String getUserRuc() {
        return UserRuc;
    }

    public void setUserRuc(String userRuc) {
        UserRuc = userRuc;
    }

    public Roles getRol() {
        return Rol;
    }

    public void setRol(Roles rol) {
        Rol = rol;
    }
}
