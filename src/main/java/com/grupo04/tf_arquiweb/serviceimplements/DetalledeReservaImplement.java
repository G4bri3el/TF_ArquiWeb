package com.grupo04.tf_arquiweb.serviceimplements;

import com.grupo04.tf_arquiweb.entities.DetalledeReserva;
import com.grupo04.tf_arquiweb.repositories.IDetalledeReservaRepository;
import com.grupo04.tf_arquiweb.serviceinterfaces.IDetalledeReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetalledeReservaImplement implements IDetalledeReservaService {

    @Autowired
    private IDetalledeReservaRepository dR;


    @Override
    public void insert(DetalledeReserva detalledeReserva) {
        dR.save(detalledeReserva);
    }

    @Override
    public List<DetalledeReserva> list() {
        return dR.findAll();
    }

    @Override
    public void delete(int DetalleId) {
        dR.deleteById(DetalleId);
    }
}
