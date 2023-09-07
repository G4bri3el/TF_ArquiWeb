package com.grupo04.tf_arquiweb.serviceimplements;

import com.grupo04.tf_arquiweb.entities.Calificacion;
import com.grupo04.tf_arquiweb.repositories.ICalificacionRepository;
import com.grupo04.tf_arquiweb.serviceinterfaces.ICalificacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalificacionServiceImplement implements ICalificacionService {
    @Autowired
    private ICalificacionRepository cR;

    @Override
    public void insert(Calificacion calificacion) {
        cR.save(calificacion);
    }

    @Override
    public List<Calificacion> list() {
        return cR.findAll();
    }

    public void delete(int CalificacionId) {
        cR.deleteById(CalificacionId);
    }
}
