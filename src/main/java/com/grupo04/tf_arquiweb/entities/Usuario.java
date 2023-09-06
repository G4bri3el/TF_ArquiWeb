package com.grupo04.tf_arquiweb.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int UsuarioId;
    @Column(name = "UsuarioCorreo", nullable = false, length = 50)
    private String UsuarioCorreo;
    @Column(name = "UsuarioContrasena", nullable = false, length = 50)
    private String UsuarioContrasena;
    @Column(name = "UsuarioTelefono", nullable = false)
    private int UsuarioTelefono;
    @Column(name = "UsuarioNombre", nullable = false, length = 50)
    private String UsuarioNombre;
    @Column(name = "UsuarioApellido", nullable = false, length = 50)
    private String UsuarioApellido;
    @Column(name = "UsuarioDni",nullable = false,length = 8)
    private String UsuarioDni;
    @Column(name = "UsuarioEdad",nullable = false)
    private int UsuarioEdad;
    @Column(name = "UsuarioCiudad", nullable = false, length = 50)
    private String UsuarioCiudad;
    @Column(name = "UsuarioFoto", nullable = false, length = 50)
    private String UsuarioFoto;
    @Column(name = "UsuarioRazonsocial", nullable = false, length = 50)
    private String UsuarioRazonsocial;
    @Column(name = "UsuarioDireccion", nullable = false, length = 50)
    private String UsuarioDireccion;
    @Column(name = "UsuarioRuc", nullable = false, length = 50)
    private String UsuarioRuc;

    @ManyToOne
    @JoinColumn(name = "RolesId")
    private Roles Rol;


    public Usuario() {
    }

    public Usuario(int usuarioId, String usuarioCorreo, String usuarioContrasena, int usuarioTelefono, String usuarioNombre, String usuarioApellido, String usuarioDni, int usuarioEdad, String usuarioCiudad, String usuarioFoto, String usuarioRazonsocial, String usuarioDireccion, String usuarioRuc, Roles rol) {
        UsuarioId = usuarioId;
        UsuarioCorreo = usuarioCorreo;
        UsuarioContrasena = usuarioContrasena;
        UsuarioTelefono = usuarioTelefono;
        UsuarioNombre = usuarioNombre;
        UsuarioApellido = usuarioApellido;
        UsuarioDni = usuarioDni;
        UsuarioEdad = usuarioEdad;
        UsuarioCiudad = usuarioCiudad;
        UsuarioFoto = usuarioFoto;
        UsuarioRazonsocial = usuarioRazonsocial;
        UsuarioDireccion = usuarioDireccion;
        UsuarioRuc = usuarioRuc;
        Rol = rol;
    }

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

    public Roles getRol() {
        return Rol;
    }

    public void setRol(Roles rol) {
        Rol = rol;
    }
}
