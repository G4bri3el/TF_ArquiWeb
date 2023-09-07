package com.grupo04.tf_arquiweb.serviceinterfaces;

import com.grupo04.tf_arquiweb.entities.Usuario;

import java.util.List;

public interface IUsuarioService { //Se pone todos los metodos que tendra la entidad

    public void insert(Usuario usuario);

    public List<Usuario> list();
    public void delete(int UsuarioId);
}
