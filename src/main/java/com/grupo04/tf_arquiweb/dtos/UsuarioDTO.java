package com.grupo04.tf_arquiweb.dtos;


import com.grupo04.tf_arquiweb.entities.Roles;

import javax.persistence.*;

public class UsuarioDTO {


    private int usuarioid;

    private String usuariocorreo;

    private String usuariocontrasena;

    private int usuariotelefono;

    private String usuarionombre;

    private String usuarioapellido;

    private String usuariodni;

    private int usuarioedad;

    private String usuariociudad;

     private String usuariofoto;

    private String usuariorazonsocial;

    private String usuariodireccion;

    private String usuarioruc;


    private Roles Roles;

    public int getUsuarioid() {
        return usuarioid;
    }

    public void setUsuarioid(int usuarioid) {
        this.usuarioid = usuarioid;
    }

    public String getUsuariocorreo() {
        return usuariocorreo;
    }

    public void setUsuariocorreo(String usuariocorreo) {
        this.usuariocorreo = usuariocorreo;
    }

    public String getUsuariocontrasena() {
        return usuariocontrasena;
    }

    public void setUsuariocontrasena(String usuariocontrasena) {
        this.usuariocontrasena = usuariocontrasena;
    }

    public int getUsuariotelefono() {
        return usuariotelefono;
    }

    public void setUsuariotelefono(int usuariotelefono) {
        this.usuariotelefono = usuariotelefono;
    }

    public String getUsuarionombre() {
        return usuarionombre;
    }

    public void setUsuarionombre(String usuarionombre) {
        this.usuarionombre = usuarionombre;
    }

    public String getUsuarioapellido() {
        return usuarioapellido;
    }

    public void setUsuarioapellido(String usuarioapellido) {
        this.usuarioapellido = usuarioapellido;
    }

    public String getUsuariodni() {
        return usuariodni;
    }

    public void setUsuariodni(String usuariodni) {
        this.usuariodni = usuariodni;
    }

    public int getUsuarioedad() {
        return usuarioedad;
    }

    public void setUsuarioedad(int usuarioedad) {
        this.usuarioedad = usuarioedad;
    }

    public String getUsuariociudad() {
        return usuariociudad;
    }

    public void setUsuariociudad(String usuariociudad) {
        this.usuariociudad = usuariociudad;
    }

    public String getUsuariofoto() {
        return usuariofoto;
    }

    public void setUsuariofoto(String usuariofoto) {
        this.usuariofoto = usuariofoto;
    }

    public String getUsuariorazonsocial() {
        return usuariorazonsocial;
    }

    public void setUsuariorazonsocial(String usuariorazonsocial) {
        this.usuariorazonsocial = usuariorazonsocial;
    }

    public String getUsuariodireccion() {
        return usuariodireccion;
    }

    public void setUsuariodireccion(String usuariodireccion) {
        this.usuariodireccion = usuariodireccion;
    }

    public String getUsuarioruc() {
        return usuarioruc;
    }

    public void setUsuarioruc(String usuarioruc) {
        this.usuarioruc = usuarioruc;
    }

    public com.grupo04.tf_arquiweb.entities.Roles getRoles() {
        return Roles;
    }

    public void setRoles(com.grupo04.tf_arquiweb.entities.Roles roles) {
        Roles = roles;
    }
}
