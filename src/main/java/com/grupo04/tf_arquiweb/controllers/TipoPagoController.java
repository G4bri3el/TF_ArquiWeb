package com.grupo04.tf_arquiweb.controllers;

import com.grupo04.tf_arquiweb.dtos.TipoPagoDTO;
import com.grupo04.tf_arquiweb.entities.TipoPago;
import com.grupo04.tf_arquiweb.serviceinterfaces.ITipoPagoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tipopagos")
public class TipoPagoController {
    @Autowired
    private ITipoPagoService tpS;
    @PostMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void registrar(@RequestBody TipoPagoDTO dto){
        ModelMapper m=new ModelMapper();
        TipoPago tp=m.map(dto,TipoPago.class);
        tpS.insert(tp);
    }
    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<TipoPagoDTO> listar(){
        return tpS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,TipoPagoDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void delete(@PathVariable("id") Integer id){
        tpS.delete(id);
    }
    @PutMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void modificar(@RequestBody TipoPagoDTO dto){
        ModelMapper m=new ModelMapper();
        TipoPago tp=m.map(dto,TipoPago.class);
        tpS.insert(tp);
    }
}
