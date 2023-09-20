package com.grupo04.tf_arquiweb.controllers;

import com.grupo04.tf_arquiweb.dtos.ResenaDTO;
import com.grupo04.tf_arquiweb.dtos.ReservaDTO;
import com.grupo04.tf_arquiweb.entities.Resena;
import com.grupo04.tf_arquiweb.entities.Reserva;
import com.grupo04.tf_arquiweb.serviceinterfaces.IResenaService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/resenas")
public class ResenaController {
    @Autowired
    private IResenaService cS;
    @PostMapping
    public void registrar(@RequestBody ResenaDTO dto){
        ModelMapper m=new ModelMapper();
        Resena c=m.map(dto, Resena.class);
        cS.insert(c);
    }
    @GetMapping
    public List<ResenaDTO> listar() {
        return cS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, ResenaDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){
        cS.delete(id);
    }

    @PutMapping
    public void modificar(@RequestBody ResenaDTO dto) {
        ModelMapper m = new ModelMapper();
        Resena r = m.map(dto, Resena.class);
        cS.insert(r);
    }

}
