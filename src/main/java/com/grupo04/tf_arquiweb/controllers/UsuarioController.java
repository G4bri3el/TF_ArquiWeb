package com.grupo04.tf_arquiweb.controllers;


import com.grupo04.tf_arquiweb.dtos.UsuarioDTO;
import com.grupo04.tf_arquiweb.entities.Usuario;
import com.grupo04.tf_arquiweb.serviceinterfaces.IUsuarioService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private IUsuarioService uS;

    @PostMapping("/signup")
    public void registrar(@RequestBody UsuarioDTO dto) {
        ModelMapper m = new ModelMapper();
        Usuario u = m.map(dto, Usuario.class);
        uS.insert(u);
    }

    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<UsuarioDTO> listar() {
        return uS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, UsuarioDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('CLIENTE') OR hasAuthority('EMPRESARIO') OR hasAuthority('ADMIN')")
    public void eliminar(@PathVariable("id") Integer id) {
        uS.delete(id);
    }

    @PutMapping
    @PreAuthorize("hasAuthority('CLIENTE') OR hasAuthority('EMPRESARIO') OR hasAuthority('ADMIN')")
    public void modificar(@RequestBody UsuarioDTO dto){
        ModelMapper m = new ModelMapper();
        Usuario u = m.map(dto,Usuario.class);
        uS.insert(u);
    }


    //CAMBIAR CONTRASEÑA
    /*
    @PutMapping("/cambiarcontraseña")
    @PreAuthorize("hasAuthority('CLIENTE') OR hasAuthority('EMPRESARIO') OR hasAuthority('ADMIN')")
    public void cambiarContraseña(@RequestBody String contraseña){

    }
    */
}
