package com.grupo04.tf_arquiweb.serviceinterfaces;

import com.grupo04.tf_arquiweb.entities.Usuario;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;

public interface IUsuarioService { //Se pone todos los metodos que tendra la entidad

    public void insert(Usuario usuario);

    public List<Usuario> list();
    public void delete(int UsuarioId);

    //Metodo para que se pueda logear

    ResponseEntity<String> signUp(Map<String,String> requestMap);
    ResponseEntity<String> login(Map<String,String> requestMap);
}
