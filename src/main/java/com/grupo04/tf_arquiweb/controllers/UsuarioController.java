package com.grupo04.tf_arquiweb.controllers;


import com.grupo04.tf_arquiweb.dtos.UsuarioDTO;
import com.grupo04.tf_arquiweb.entities.Usuario;
import com.grupo04.tf_arquiweb.repositories.IUsuarioRepository;
import com.grupo04.tf_arquiweb.serviceinterfaces.IUsuarioService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.springframework.security.core.Authentication;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private IUsuarioService uS;
    @Autowired
    private IUsuarioRepository uR;
    @PostMapping("/signup")
    public void registrar(@RequestBody UsuarioDTO dto) {
        ModelMapper m = new ModelMapper();
        Usuario u = m.map(dto, Usuario.class);
        uS.insert(u);
    }

    @GetMapping
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

    @GetMapping("/info")
    public ResponseEntity<UsuarioDTO> getUserInfo() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String name = authentication.getName();

        Usuario user = uR.findByUsuarionombre(name);
        if (user == null) {
            // Manejar el caso en el que el usuario no existe
            throw new RuntimeException("User not found with email: " + name);
        }
        // Mapear el objeto User a UserDTO para enviar solo los datos necesarios al frontend
        ModelMapper modelMapper = new ModelMapper();
        UsuarioDTO userDTO = modelMapper.map(user, UsuarioDTO.class);

        return ResponseEntity.ok(userDTO);
    }


    //CAMBIAR CONTRASEÑA
    /*
    @PutMapping("/cambiarcontraseña")
    @PreAuthorize("hasAuthority('CLIENTE') OR hasAuthority('EMPRESARIO') OR hasAuthority('ADMIN')")
    public void cambiarContraseña(@RequestBody String contraseña){

    }
    */
}
