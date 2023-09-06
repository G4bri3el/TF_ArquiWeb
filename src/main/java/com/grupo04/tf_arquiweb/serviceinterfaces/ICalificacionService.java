package com.grupo04.tf_arquiweb.serviceinterfaces;

import com.grupo04.tf_arquiweb.entities.Calificacion;

import java.util.List;

public interface ICalificacionService {
    public void insert(Calificacion calificacion);
    public List<Calificacion> list();
}
