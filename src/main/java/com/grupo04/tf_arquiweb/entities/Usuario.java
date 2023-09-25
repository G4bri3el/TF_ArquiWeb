package com.grupo04.tf_arquiweb.entities;


import javax.persistence.*;


@Entity
@Table(name = "Usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int usuarioid;
    @Column(name = "UsuarioCorreo", nullable = false, length = 50)
    private String usuariocorreo;
    @Column(name = "UsuarioContrasena", nullable = false, length = 50)
    private String usuariocontrasena;
    @Column(name = "UsuarioTelefono", nullable = false)
    private int usuariotelefono;
    @Column(name = "UsuarioNombre", nullable = true, length = 50)
    private String usuarionombre;
    @Column(name = "UsuarioApellido", nullable = true, length = 50)
    private String usuarioapellido;
    @Column(name = "UsuarioDni",nullable = true,length = 8)
    private String usuariodni;
    @Column(name = "UsuarioEdad",nullable = true)
    private int usuarioedad;
    @Column(name = "UsuarioCiudad", nullable = true, length = 50)
    private String usuariociudad;
    @Column(name = "UsuarioFoto", nullable = true, length = 50)
    private String usuariofoto;
    @Column(name = "UsuarioRazonsocial", nullable = true, length = 50)
    private String usuariorazonsocial;
    @Column(name = "UsuarioDireccion", nullable = true, length = 50)
    private String usuariodireccion;
    @Column(name = "UsuarioRuc", nullable = true, length = 11)
    private String usuarioruc;
    @ManyToOne
    @JoinColumn(name = "RolesId")
    private Roles Roles;


    public Usuario() {
    }

    public Usuario(int usuarioid, String usuariocorreo, String usuariocontrasena, int usuariotelefono, String usuarionombre, String usuarioapellido, String usuariodni, int usuarioedad, String usuariociudad, String usuariofoto, String usuariorazonsocial, String usuariodireccion, String usuarioruc, com.grupo04.tf_arquiweb.entities.Roles roles) {
        this.usuarioid = usuarioid;
        this.usuariocorreo = usuariocorreo;
        this.usuariocontrasena = usuariocontrasena;
        this.usuariotelefono = usuariotelefono;
        this.usuarionombre = usuarionombre;
        this.usuarioapellido = usuarioapellido;
        this.usuariodni = usuariodni;
        this.usuarioedad = usuarioedad;
        this.usuariociudad = usuariociudad;
        this.usuariofoto = usuariofoto;
        this.usuariorazonsocial = usuariorazonsocial;
        this.usuariodireccion = usuariodireccion;
        this.usuarioruc = usuarioruc;
        Roles = roles;
    }

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
