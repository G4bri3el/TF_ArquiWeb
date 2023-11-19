package com.grupo04.tf_arquiweb.controllers;


import com.grupo04.tf_arquiweb.dtos.BicicletaDTO;
import com.grupo04.tf_arquiweb.dtos.DetalledeReservaDTO;
import com.grupo04.tf_arquiweb.entities.Bicicleta;
import com.grupo04.tf_arquiweb.entities.DetalledeReserva;
import com.grupo04.tf_arquiweb.serviceinterfaces.IDetalledeReservaService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/detallesdereservas") //** REVISAR ESTO
public class DetalledeReservaController {

    @Autowired
    private IDetalledeReservaService dS;

    @PostMapping
    public void registrar(@RequestBody  DetalledeReservaDTO dto) {
        ModelMapper m = new ModelMapper();
        DetalledeReserva d= m.map(dto, DetalledeReserva.class);
        dS.insert(d);
    }

    @GetMapping
    public List<DetalledeReservaDTO> listar() {
        return dS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, DetalledeReservaDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        dS.delete(id);
    }


    @PutMapping
    public void modificar(@RequestBody DetalledeReservaDTO dto) {
        ModelMapper m = new ModelMapper();
        DetalledeReserva d = m.map(dto, DetalledeReserva.class);
        dS.insert(d);
    }

}
