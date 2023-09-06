package com.grupo04.tf_arquiweb.controllers;

import com.grupo04.tf_arquiweb.dtos.DetalleDePagoDTO;
import com.grupo04.tf_arquiweb.entities.DetalleDePago;
import com.grupo04.tf_arquiweb.serviceinterfaces.IDetalleDePagoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/detallesdepago")
public class DetalleDePagoController {
    @Autowired
    private IDetalleDePagoService dpS;

    @PostMapping
    public void registrar(@RequestBody DetalleDePagoDTO dto){
        ModelMapper m=new ModelMapper();
        DetalleDePago dp=m.map(dto,DetalleDePago.class);
        dpS.insert(dp);
    }

    @GetMapping
    public List<DetalleDePagoDTO> listar(){
        return dpS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,DetalleDePagoDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){
        dpS.delete(id);
    }
    @PutMapping
    public void modificar(@RequestBody DetalleDePagoDTO dto){
        ModelMapper m=new ModelMapper();
        DetalleDePago dp=m.map(dto, DetalleDePago.class);
        dpS.insert(dp);
    }
}
