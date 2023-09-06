package com.grupo04.tf_arquiweb.controllers;


import com.grupo04.tf_arquiweb.dtos.BicicletaDTO;
import com.grupo04.tf_arquiweb.dtos.LocalDTO;
import com.grupo04.tf_arquiweb.entities.Bicicleta;
import com.grupo04.tf_arquiweb.entities.Local;
import com.grupo04.tf_arquiweb.serviceinterfaces.IBicicletaService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/bicicletas")
public class BicicletaController {

    @Autowired
    private IBicicletaService bS;

    @PostMapping
    public void registrar(@RequestBody BicicletaDTO dto) {
        ModelMapper m = new ModelMapper();
        Bicicleta b= m.map(dto, Bicicleta.class);
        bS.insert(b);
    }

    @GetMapping
    public List<BicicletaDTO> listar() {
        return bS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, BicicletaDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("{/id}")
    public void delete(@PathVariable("id") Integer id) {
        bS.delete(id);
    }


    @PutMapping
    public void modificar(@RequestBody BicicletaDTO dto) {
        ModelMapper m = new ModelMapper();
        Bicicleta b = m.map(dto, Bicicleta.class);
        bS.insert(b);
    }


}
