package com.grupo04.tf_arquiweb.controllers;

import com.grupo04.tf_arquiweb.dtos.LocalDTO;
import com.grupo04.tf_arquiweb.dtos.LocalEmpresarioDTO;
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
    public int cantidadLocales() {
        return lS.cantidadLocales();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        lS.delete(id);
    }

    @PutMapping
    public void modificar(@RequestBody LocalDTO dto) {
        ModelMapper m = new ModelMapper();
        Local l = m.map(dto, Local.class);
        lS.insert(l);
    }

    @PostMapping("/buscarXnombre")
    public List<LocalDTO> buscarXnombre(@RequestBody String localnombre) {
        return lS.findByLocalnombre(localnombre).stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,LocalDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping("/buscarXdireccion")
    public List<LocalDTO> buscarXdireccion(@RequestBody String localdireccion) {
        return lS.findByLocaldireccion(localdireccion).stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,LocalDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping("/buscarXcalificacion")
    public List<LocalDTO> buscarXcalificacion(@RequestBody int estrellas) {
        return lS.buscarXcalificacion(estrellas).stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,LocalDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping("/buscarXempresario")
    public List<LocalDTO> buscarXempresario(@RequestBody int usuarioId) {
        return lS.buscarXempresario(usuarioId).stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,LocalDTO.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/cantidad")
    public List<LocalEmpresarioDTO> CantidadLocalesporEmpresario() {
        List<String[]> lista = lS.quantityLocalesByEmpresario();
        List<LocalEmpresarioDTO> listaDTO = new ArrayList<>();
        for (String[] data : lista) {
            LocalEmpresarioDTO dto = new LocalEmpresarioDTO();
            dto.setUsuarioNombre(data[0]);
            dto.setCantidadLocales(Integer.parseInt(data[1]));
            listaDTO.add(dto);
        }
        return listaDTO;
    }


}
