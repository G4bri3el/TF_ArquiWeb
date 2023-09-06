package com.grupo04.tf_arquiweb.serviceimplements;


import com.grupo04.tf_arquiweb.entities.Reserva;
import com.grupo04.tf_arquiweb.repositories.IReservaRepository;
import com.grupo04.tf_arquiweb.serviceinterfaces.IReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservaServiceImplement implements IReservaService {

    @Autowired
    private IReservaRepository reR;


    @Override
    public void insert(Reserva reserva) {
        reR.save(reserva);
    }

    @Override
    public List<Reserva> list() {
        return reR.findAll();
    }

    @Override
    public void delete(int ReservaID) {
        reR.deleteById(ReservaID);
    }
}
