package com.grupo04.tf_arquiweb.controllers;


import com.grupo04.tf_arquiweb.dtos.UsuarioDTO;
import com.grupo04.tf_arquiweb.entities.Usuarios;
import com.grupo04.tf_arquiweb.serviceinterfaces.IUserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private IUserService userService;

    @PostMapping
    public void registrar(@RequestBody UsuarioDTO dto) {
        ModelMapper m = new ModelMapper();
        Usuarios u = m.map(dto, Usuarios.class);
        userService.insert(u);
    }

    @GetMapping
    public List<UsuarioDTO> listar() {
        return userService.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, UsuarioDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        userService.delete(id);
    }

    @PutMapping
    public void modificar(@RequestBody UsuarioDTO dto){
        ModelMapper m = new ModelMapper();
        Usuarios u = m.map(dto,Usuarios.class);
        userService.insert(u);
    }

}
