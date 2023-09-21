package com.grupo04.tf_arquiweb.dtos;


import com.grupo04.tf_arquiweb.entities.Roles;

public class UsuarioDTO {

    private int UsuarioId;
    private String UsuarioCorreo;

    private String UsuarioContrasena;

    private int UsuarioTelefono;

    private String UsuarioNombre;

    private String UsuarioApellido;

    private String UsuarioDni;

    private int UsuarioEdad;

    private String UsuarioCiudad;

    private String UsuarioFoto;

    private String UsuarioRazonsocial;

    private String UsuarioDireccion;

    private String UsuarioRuc;

    private Roles Roles;

    public int getUsuarioId() {
        return UsuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        UsuarioId = usuarioId;
    }

    public String getUsuarioCorreo() {
        return UsuarioCorreo;
    }

    public void setUsuarioCorreo(String usuarioCorreo) {
        UsuarioCorreo = usuarioCorreo;
    }

    public String getUsuarioContrasena() {
        return UsuarioContrasena;
    }

    public void setUsuarioContrasena(String usuarioContrasena) {
        UsuarioContrasena = usuarioContrasena;
    }

    public int getUsuarioTelefono() {
        return UsuarioTelefono;
    }

    public void setUsuarioTelefono(int usuarioTelefono) {
        UsuarioTelefono = usuarioTelefono;
    }

    public String getUsuarioNombre() {
        return UsuarioNombre;
    }

    public void setUsuarioNombre(String usuarioNombre) {
        UsuarioNombre = usuarioNombre;
    }

    public String getUsuarioApellido() {
        return UsuarioApellido;
    }

    public void setUsuarioApellido(String usuarioApellido) {
        UsuarioApellido = usuarioApellido;
    }

    public String getUsuarioDni() {
        return UsuarioDni;
    }

    public void setUsuarioDni(String usuarioDni) {
        UsuarioDni = usuarioDni;
    }

    public int getUsuarioEdad() {
        return UsuarioEdad;
    }

    public void setUsuarioEdad(int usuarioEdad) {
        UsuarioEdad = usuarioEdad;
    }

    public String getUsuarioCiudad() {
        return UsuarioCiudad;
    }

    public void setUsuarioCiudad(String usuarioCiudad) {
        UsuarioCiudad = usuarioCiudad;
    }

    public String getUsuarioFoto() {
        return UsuarioFoto;
    }

    public void setUsuarioFoto(String usuarioFoto) {
        UsuarioFoto = usuarioFoto;
    }

    public String getUsuarioRazonsocial() {
        return UsuarioRazonsocial;
    }

    public void setUsuarioRazonsocial(String usuarioRazonsocial) {
        UsuarioRazonsocial = usuarioRazonsocial;
    }

    public String getUsuarioDireccion() {
        return UsuarioDireccion;
    }

    public void setUsuarioDireccion(String usuarioDireccion) {
        UsuarioDireccion = usuarioDireccion;
    }

    public String getUsuarioRuc() {
        return UsuarioRuc;
    }

    public void setUsuarioRuc(String usuarioRuc) {
        UsuarioRuc = usuarioRuc;
    }

    public Roles getRoles() {
        return Roles;
    }

    public void setRoles(Roles rol) {
        Roles = rol;
    }
}
