package com.grupo04.tf_arquiweb.serviceinterfaces;

import com.grupo04.tf_arquiweb.entities.Usuarios;

import java.util.List;

public interface IUserService { //Se pone todos los metodos que tendra la entidad

    public void insert(Usuarios user);

    public List<Usuarios> list();
    public void delete(int userID);



}
