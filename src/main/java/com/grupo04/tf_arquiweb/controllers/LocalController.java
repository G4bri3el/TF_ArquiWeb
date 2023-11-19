package com.grupo04.tf_arquiweb.controllers;

import com.grupo04.tf_arquiweb.dtos.GananciaLocalDTO;
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

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/locales")
public class LocalController {

    @Autowired
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

    @GetMapping("/Amaya")
    @PreAuthorize("hasAuthority('EMPRESARIO') OR hasAuthority('ADMIN')")
    public int cantidadLocales() {
        return lS.cantidadLocales();
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

    @PostMapping("/buscarXnombre")
    @PreAuthorize("hasAuthority('EMPRESARIO') OR hasAuthority('ADMIN')")
    public List<LocalDTO> buscarXnombre(@RequestBody String localnombre) {
        return lS.findByLocalnombre(localnombre).stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,LocalDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping("/buscarXdireccion")
    @PreAuthorize("hasAuthority('EMPRESARIO') OR hasAuthority('ADMIN')")
    public List<LocalDTO> buscarXdireccion(@RequestBody String localdireccion) {
        return lS.findByLocaldireccion(localdireccion).stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,LocalDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping("/buscarXcalificacion")
    @PreAuthorize("hasAuthority('EMPRESARIO') OR hasAuthority('ADMIN')")
    public List<LocalDTO> buscarXcalificacion(@RequestBody int estrellas) {
        return lS.buscarXcalificacion(estrellas).stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,LocalDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping("/buscarXempresario")
    @PreAuthorize("hasAuthority('EMPRESARIO') OR hasAuthority('ADMIN')")
    public List<LocalDTO> buscarXempresario(@RequestBody int usuarioId) {
        return lS.buscarXempresario(usuarioId).stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,LocalDTO.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/ganancia")
    public List<GananciaLocalDTO> calcular(){
        List<String[]>lista=lS.gananciasporlocal();
        List<GananciaLocalDTO> lista2=new ArrayList<>();
        for(String[] data: lista){
            GananciaLocalDTO dto=new GananciaLocalDTO();
            dto.setLocalname(data[0]);
            dto.setGanancia(Double.parseDouble(data[1]));
            lista2.add(dto);
        }
        return lista2 ;
    }


}
