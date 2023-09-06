package com.grupo04.tf_arquiweb.controllers;

import com.grupo04.tf_arquiweb.dtos.LocalDTO;
import com.grupo04.tf_arquiweb.dtos.ReservaDTO;
import com.grupo04.tf_arquiweb.entities.Local;
import com.grupo04.tf_arquiweb.entities.Reserva;
import com.grupo04.tf_arquiweb.serviceinterfaces.ILocalService;
import org.modelmapper.ModelMapper;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/locales")
public class LocalController {

    private ILocalService lS;

    @PostMapping
    public void registrar(@RequestBody LocalDTO dto) {
        ModelMapper m = new ModelMapper();
        Local l = m.map(dto, Local.class);
        lS.insert(l);
    }

    @GetMapping
    public List<LocalDTO> listar() {
        return lS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, LocalDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("{/id}")
    public void delete(@PathVariable("id") Integer id) {
        lS.delete(id);
    }

    @PutMapping
    public void modificar(@RequestBody LocalDTO dto) {
        ModelMapper m = new ModelMapper();
        Local l = m.map(dto, Local.class);
        lS.insert(l);
    }
}