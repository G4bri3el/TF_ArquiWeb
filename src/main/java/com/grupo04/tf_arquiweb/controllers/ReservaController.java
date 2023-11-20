package com.grupo04.tf_arquiweb.controllers;

import com.grupo04.tf_arquiweb.dtos.ReservaDTO;
import com.grupo04.tf_arquiweb.dtos.ReservaLocalDTO;
import com.grupo04.tf_arquiweb.dtos.ReservasxEmpresarioDto;
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
    public void registrar(@RequestBody ReservaDTO dto) {
        ModelMapper m = new ModelMapper();
        Reserva re = m.map(dto, Reserva.class);
        reS.insert(re);
    }

    @GetMapping
    public List<ReservaDTO> listar() {
        return reS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, ReservaDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        reS.delete(id);
    }

    @PutMapping
    public void modificar(@RequestBody ReservaDTO dto) {
        ModelMapper m = new ModelMapper();
        Reserva re = m.map(dto, Reserva.class);
        reS.insert(re);
    }

    @GetMapping("/cantidad/{user_id}")
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
    public List<ReservaDTO> reservasXcliente(@PathVariable("id") Integer id){
        return  reS.reservasXcliente(id).stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,ReservaDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping("/empresario/{id}")
    public long reservasXempresario(@PathVariable("id") Integer id){
        return reS.reservasPorEmpresario(id).size();
    }

    @GetMapping("/reservaxem")
    public List<ReservasxEmpresarioDto> calcular(){
        List<String[]>lista=reS.quantity();
        List<ReservasxEmpresarioDto> lista2=new ArrayList<>();
        for(String[] data: lista){
            ReservasxEmpresarioDto dto=new ReservasxEmpresarioDto();
            dto.setUsuarionombre(data[0]);
            dto.setReservasxempresario(Integer.parseInt(data[1]));
            lista2.add(dto);
        }
        return lista2 ;
    }


}
