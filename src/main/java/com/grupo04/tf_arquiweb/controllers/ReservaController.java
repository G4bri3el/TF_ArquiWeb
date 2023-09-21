package com.grupo04.tf_arquiweb.controllers;

import com.grupo04.tf_arquiweb.dtos.ReservaDTO;
import com.grupo04.tf_arquiweb.entities.Reserva;
import com.grupo04.tf_arquiweb.serviceinterfaces.IReservaService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/reservas")
public class ReservaController {

    @Autowired
    private IReservaService reS;

    @PostMapping
    @PreAuthorize("hasAuthority('CLIENTE') OR hasAuthority('ADMIN')")
    public void registrar(@RequestBody ReservaDTO dto) {
        ModelMapper m = new ModelMapper();
        Reserva re = m.map(dto, Reserva.class);
        reS.insert(re);
    }

    @GetMapping
    @PreAuthorize("hasAuthority('CLIENTE') OR hasAuthority('ADMIN')")
    public List<ReservaDTO> listar() {
        return reS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, ReservaDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('CLIENTE') OR hasAuthority('ADMIN')")
    public void eliminar(@PathVariable("id") Integer id) {
        reS.delete(id);
    }

    @PutMapping
    @PreAuthorize("hasAuthority('CLIENTE') OR hasAuthority('ADMIN')")
    public void modificar(@RequestBody ReservaDTO dto) {
        ModelMapper m = new ModelMapper();
        Reserva re = m.map(dto, Reserva.class);
        reS.insert(re);
    }

}
