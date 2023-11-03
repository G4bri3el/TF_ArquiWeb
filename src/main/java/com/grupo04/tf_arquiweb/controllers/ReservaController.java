package com.grupo04.tf_arquiweb.controllers;

import com.grupo04.tf_arquiweb.dtos.ReservaDTO;
import com.grupo04.tf_arquiweb.dtos.ReservaLocalDTO;
import com.grupo04.tf_arquiweb.entities.Reserva;
import com.grupo04.tf_arquiweb.serviceinterfaces.IReservaService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/reservas")
public class ReservaController {

    @Autowired
    private IReservaService reS;

    @PostMapping
    @PreAuthorize("hasAuthority('CLIENTE') OR hasAuthority('ADMIN')")
    public void registrar(@RequestBody ReservaDTO dto) {
        ModelMapper m = new ModelMapper();
        Reserva re = m.map(dto, Reserva.class);
        reS.insert(re);
    }

    @GetMapping
    @PreAuthorize("hasAuthority('CLIENTE') OR hasAuthority('ADMIN')")
    public List<ReservaDTO> listar() {
        return reS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, ReservaDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('CLIENTE') OR hasAuthority('ADMIN')")
    public void eliminar(@PathVariable("id") Integer id) {
        reS.delete(id);
    }

    @PutMapping
    @PreAuthorize("hasAuthority('CLIENTE') OR hasAuthority('ADMIN')")
    public void modificar(@RequestBody ReservaDTO dto) {
        ModelMapper m = new ModelMapper();
        Reserva re = m.map(dto, Reserva.class);
        reS.insert(re);
    }

    @GetMapping("/cantidad/{user_id}")
    @PreAuthorize("hasAuthority('EMPRESARIO') OR hasAuthority('ADMIN')")
    public List<ReservaLocalDTO> cantidadreservasporlocal(@PathVariable("user_id") Integer userid){

        List<String[]> lista = reS.cantidadreservasporlocal(userid);
        List<ReservaLocalDTO> listaDTO = new ArrayList<>();
        for(String[] data:lista){
            ReservaLocalDTO dto = new ReservaLocalDTO();
            dto.setNombrelocal(data[0]);
            dto.setCantidadreservas(Integer.parseInt(data[1]));
            listaDTO.add(dto);
        }

        return listaDTO;
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('CLIENTE') OR hasAuthority('ADMIN')")
    public List<ReservaDTO> reservasXcliente(@PathVariable("id") Integer id){
        return  reS.reservasXcliente(id).stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,ReservaDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping("/empresario/{id}")
    @PreAuthorize("hasAuthority('EMPRESARIO') OR hasAuthority('ADMIN')")
    public long reservasXempresario(@PathVariable("id") Integer id){
        return reS.reservasPorEmpresario(id).size();
    }
}
