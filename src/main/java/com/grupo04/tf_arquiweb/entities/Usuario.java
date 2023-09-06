package com.grupo04.tf_arquiweb.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int UserId;
    @Column(name = "UserCorreo", nullable = false, length = 50)
    private String UserCorreo;
    @Column(name = "UserContrasena", nullable = false, length = 50)
    private String UserContrasena;
    @Column(name = "UserTelefono", nullable = false)
    private int UserTelefono;
    @Column(name = "UserNombre", nullable = false, length = 50)
    private String UserNombre;
    @Column(name = "UserApellido", nullable = false, length = 50)
    private String UserApellido;
    @Column(name = "UserDni",nullable = false,length = 8)
    private String UserDni;
    @Column(name = "UserEdad",nullable = false)
    private int UserEdad;
    @Column(name = "UserCiudad", nullable = false, length = 50)
    private String UserCiudad;
    @Column(name = "UserFoto", nullable = false, length = 50)
    private String UserFoto;
    @Column(name = "UserRazonsocial", nullable = false, length = 50)
    private String UserRazonsocial;
    @Column(name = "UserDireccion", nullable = false, length = 50)
    private String UserDireccion;
    @Column(name = "UserRuc", nullable = false, length = 50)
    private String UserRuc;

    @ManyToOne
    @JoinColumn(name = "RolesID")
    private Roles Rol;


    public Usuario() {
    }

    public Usuario(int userId, String userCorreo, String userContrasena, int userTelefono, String userNombre, String userApellido, String userDni, int userEdad, String userCiudad, String userFoto, String userRazonsocial, String userDireccion, String userRuc, Roles rol) {
        UserId = userId;
        UserCorreo = userCorreo;
        UserContrasena = userContrasena;
        UserTelefono = userTelefono;
        UserNombre = userNombre;
        UserApellido = userApellido;
        UserDni = userDni;
        UserEdad = userEdad;
        UserCiudad = userCiudad;
        UserFoto = userFoto;
        UserRazonsocial = userRazonsocial;
        UserDireccion = userDireccion;
        UserRuc = userRuc;
        Rol = rol;
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
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
