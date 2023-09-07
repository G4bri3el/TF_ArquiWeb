package com.grupo04.tf_arquiweb.serviceimplements;

import com.grupo04.tf_arquiweb.entities.Resena;
import com.grupo04.tf_arquiweb.repositories.IResenaRepository;
import com.grupo04.tf_arquiweb.serviceinterfaces.IResenaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResenaServiceImplement implements IResenaService {
    @Autowired
    private IResenaRepository cR;

    @Override
    public void insert(Resena calificacion) {
        cR.save(calificacion);
    }

    @Override
    public List<Resena> list() {
        return cR.findAll();
    }

    public void delete(int CalificacionId) {
        cR.deleteById(CalificacionId);
    }
}
