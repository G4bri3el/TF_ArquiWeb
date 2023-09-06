package com.grupo04.tf_arquiweb.dtos;


import com.grupo04.tf_arquiweb.entities.Roles;

public class UserDTO {
    private int UserID;
    private String UserCorreo;
    private String UserContrasena;
    private int UserTelefono;
    private String UseUserNombre;
    private String  UsUserApellido;
    private String UserDNI;
    private int UserEdad;
    private String UserCiudad;
    private String UserFoto;
    private String UserRazonsocial;
    private String UserDireccion;
    private String UserRUC;
    private Roles Rol;

    public int getUserID() {
        return UserID;
    }

    public void setUserID(int userID) {
        UserID = userID;
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

    public String getUseUserNombre() {
        return UseUserNombre;
    }

    public void setUseUserNombre(String useUserNombre) {
        UseUserNombre = useUserNombre;
    }

    public String getUsUserApellido() {
        return UsUserApellido;
    }

    public void setUsUserApellido(String usUserApellido) {
        UsUserApellido = usUserApellido;
    }

    public String getUserDNI() {
        return UserDNI;
    }

    public void setUserDNI(String userDNI) {
        UserDNI = userDNI;
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

    public String getUserRUC() {
        return UserRUC;
    }

    public void setUserRUC(String userRUC) {
        UserRUC = userRUC;
    }

    public Roles getRol() {
        return Rol;
    }

    public void setRol(Roles rol) {
        Rol = rol;
    }
}
