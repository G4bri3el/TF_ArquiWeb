package com.grupo04.tf_arquiweb.controllers;


import com.grupo04.tf_arquiweb.dtos.BicicletaDTO;
import com.grupo04.tf_arquiweb.dtos.BicicletaLocalEmpresarioDTO;
import com.grupo04.tf_arquiweb.dtos.LocalDTO;
import com.grupo04.tf_arquiweb.entities.Bicicleta;
import com.grupo04.tf_arquiweb.entities.Local;
import com.grupo04.tf_arquiweb.serviceinterfaces.IBicicletaService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/bicicletas")
public class BicicletaController {

    @Autowired
    private IBicicletaService bS;

    @PostMapping
    public void registrar(@RequestBody BicicletaDTO dto) {
        ModelMapper m = new ModelMapper();
        Bicicleta b= m.map(dto, Bicicleta.class);
        bS.insert(b);
    }

    @GetMapping
    public List<BicicletaDTO> listar() {
        return bS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, BicicletaDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        bS.delete(id);
    }


    @PutMapping
    public void modificar(@RequestBody BicicletaDTO dto) {
        ModelMapper m = new ModelMapper();
        Bicicleta b = m.map(dto, Bicicleta.class);
        bS.insert(b);
    }

    @GetMapping("/{user_id}/{local_id}")
    public List<BicicletaLocalEmpresarioDTO> listaBicicletasPorLocalEmpresario(@PathVariable("user_id") Integer user_id,
                                                                               @PathVariable("local_id")  Integer local_id){


        List<String[]> lista = bS.listaBicicletasPorLocalEmpresario(user_id, local_id);
        List<BicicletaLocalEmpresarioDTO> listaDTO = new ArrayList<>();
        for(String[] data:lista){
            BicicletaLocalEmpresarioDTO dto = new BicicletaLocalEmpresarioDTO();
            dto.setBicicletamodelo(data[1]);
            dto.setBicicletaestado(Boolean.parseBoolean(data[2]));
            dto.setBicicletaprecio(Double.parseDouble(data[3]));
            dto.setBicicletanumaro(Integer.parseInt(data[4]));
            dto.setBicicletadetalles(data[5]);
            dto.setBicicletafoto(data[6]);
            listaDTO.add(dto);
        }
        return listaDTO;


    }

}
