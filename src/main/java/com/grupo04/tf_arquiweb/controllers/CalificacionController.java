package com.grupo04.tf_arquiweb.controllers;

import com.grupo04.tf_arquiweb.dtos.CalificacionDTO;
import com.grupo04.tf_arquiweb.entities.Calificacion;
import com.grupo04.tf_arquiweb.serviceinterfaces.ICalificacionService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
