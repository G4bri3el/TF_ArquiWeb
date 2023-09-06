package com.grupo04.tf_arquiweb.serviceimplements;


import com.grupo04.tf_arquiweb.entities.Reserva;
import com.grupo04.tf_arquiweb.repositories.IReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservaServiceImplement {

    @Autowired //inyeccion de dependencias
    private IReservaRepository reR; //capa service con repo


    public void insert(Reserva reserva){
        reR.save(reserva);
    }

    public void delete(int ReservaID){
        reR.deleteById(ReservaID);
    }

    public List<Reserva> list(){
        return reR.findAll();
    }

}
