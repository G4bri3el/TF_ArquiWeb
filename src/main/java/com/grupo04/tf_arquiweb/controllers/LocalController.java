package com.grupo04.tf_arquiweb.controllers;

import com.grupo04.tf_arquiweb.dtos.LocalDTO;
import com.grupo04.tf_arquiweb.dtos.ReservaDTO;
import com.grupo04.tf_arquiweb.entities.Local;
import com.grupo04.tf_arquiweb.entities.Reserva;
import com.grupo04.tf_arquiweb.serviceinterfaces.ILocalService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/locales")
public class LocalController {

    @Autowired
    private ILocalService lS;

    @PostMapping
    @PreAuthorize("hasAuthority('EMPRESARIO') OR hasAuthority('ADMIN')")
    public void registrar(@RequestBody LocalDTO dto) {
        ModelMapper m = new ModelMapper();
        Local l = m.map(dto, Local.class);
        lS.insert(l);
    }

    @GetMapping
    @PreAuthorize("hasAuthority('EMPRESARIO') OR hasAuthority('ADMIN')")
    public List<LocalDTO> listar() {
        return lS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, LocalDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('EMPRESARIO') OR hasAuthority('ADMIN')")
    public void delete(@PathVariable("id") Integer id) {
        lS.delete(id);
    }

    @PutMapping
    @PreAuthorize("hasAuthority('EMPRESARIO') OR hasAuthority('ADMIN')")
    public void modificar(@RequestBody LocalDTO dto) {
        ModelMapper m = new ModelMapper();
        Local l = m.map(dto, Local.class);
        lS.insert(l);
    }
}
