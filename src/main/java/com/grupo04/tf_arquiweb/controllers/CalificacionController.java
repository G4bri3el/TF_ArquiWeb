package com.grupo04.tf_arquiweb.controllers;

import com.grupo04.tf_arquiweb.dtos.CalificacionDTO;
import com.grupo04.tf_arquiweb.entities.Calificacion;
import com.grupo04.tf_arquiweb.serviceinterfaces.ICalificacionService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/calificaciones")
public class CalificacionController {
    @Autowired
    private ICalificacionService cS;
    @PostMapping
    public void registrar(@RequestBody CalificacionDTO dto){
        ModelMapper m=new ModelMapper();
        Calificacion c=m.map(dto,Calificacion.class);
        cS.insert(c);
    }
    @GetMapping
    public List<CalificacionDTO> listar() {
        return cS.list().stream().map(x -> { //se hace la transformación
            ModelMapper m = new ModelMapper();
            return m.map(x, CalificacionDTO.class);         //retorna con el patron
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){
        cS.delete(id);
    }


}
