package com.grupo04.tf_arquiweb.serviceimplements;

import com.grupo04.tf_arquiweb.entities.Local;
import com.grupo04.tf_arquiweb.entities.Reserva;
import com.grupo04.tf_arquiweb.repositories.ILocalRepository;
import com.grupo04.tf_arquiweb.repositories.IReservaRepository;
import com.grupo04.tf_arquiweb.serviceinterfaces.ILocalService;
import com.grupo04.tf_arquiweb.serviceinterfaces.IReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocalServiceImplement implements ILocalService {


    @Autowired
    private ILocalRepository lR;

    @Override
    public void insert(Local local) {
        lR.save(local);
    }

    @Override
    public List<Local> list() {
        return lR.findAll();
    }

    @Override
    public void delete(int LocalId) {
        lR.deleteById(LocalId);
    }

    @Override
    public List<Local> findByLocalNombre(String localnombre) {
        return lR.findByLocalNombre(localnombre);
    }

    @Override
    public List<Local> findByLocalDireccion(String localdireccion) {
        return lR.findByLocalDireccion(localdireccion);
    }

    @Override
    public List<Local> buscarXcalificacion(int estrellas) {
        return lR.buscarXcalificacion(estrellas);
    }
}
