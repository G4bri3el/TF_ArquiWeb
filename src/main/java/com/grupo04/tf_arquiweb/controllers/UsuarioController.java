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
    public void eliminar(@PathVariable("id") Integer id) {
        uS.delete(id);
    }

    @PutMapping
    public void modificar(@RequestBody UsuarioDTO dto){
        ModelMapper m = new ModelMapper();
        Usuario u = m.map(dto,Usuario.class);
        uS.insert(u);
    }

    //LOGIN
    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody(required = true) Map<String,String> requestMap){
        try {
            return uS.login(requestMap);
        }catch (Exception exception){
            exception.printStackTrace();
        }

        return new ResponseEntity<String>("mensaje: Algo ha salido mal", HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
