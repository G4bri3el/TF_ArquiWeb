package com.grupo04.tf_arquiweb.controllers;

import com.grupo04.tf_arquiweb.dtos.DocumentoPagoDTO;
import com.grupo04.tf_arquiweb.entities.DocumentoPago;
import com.grupo04.tf_arquiweb.serviceinterfaces.IDocumentoPagoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/documentospagos")
public class DocumentoPagoController {
    @Autowired
    private IDocumentoPagoService dpS;
    @PostMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void registrar(@RequestBody DocumentoPagoDTO dto){
        ModelMapper m=new ModelMapper();
        DocumentoPago dp=m.map(dto,DocumentoPago.class);
        dpS.insert(dp);
    }
    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<DocumentoPagoDTO> listar(){
        return dpS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,DocumentoPagoDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void delete(@PathVariable("id") Integer id){
        dpS.delete(id);
    }
    @PutMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void modificar(@RequestBody DocumentoPagoDTO dto){
        ModelMapper m=new ModelMapper();
        DocumentoPago dp=m.map(dto, DocumentoPago.class);
        dpS.insert(dp);
    }
}
