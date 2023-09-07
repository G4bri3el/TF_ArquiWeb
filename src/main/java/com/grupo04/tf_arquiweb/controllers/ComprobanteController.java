package com.grupo04.tf_arquiweb.controllers;

import com.grupo04.tf_arquiweb.dtos.ComprobanteDTO;
import com.grupo04.tf_arquiweb.entities.Comprobante;
import com.grupo04.tf_arquiweb.serviceinterfaces.IComprobanteService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/comprobantes")
public class ComprobanteController {
    @Autowired
    private IComprobanteService cS;
    @PostMapping
    public void registrar(@RequestBody ComprobanteDTO dto){
        ModelMapper m=new ModelMapper();
        Comprobante c=m.map(dto,Comprobante.class);
        cS.insert(c);
    }
    @GetMapping
    public List<ComprobanteDTO> listar(){
        return cS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,ComprobanteDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){
        cS.delete(id);
    }
    @PutMapping
    public void modificar(@RequestBody ComprobanteDTO dto){
        ModelMapper m=new ModelMapper();
        Comprobante c=m.map(dto, Comprobante.class);
        cS.insert(c);
    }

}
