package com.grupo04.tf_arquiweb.serviceinterfaces;

import com.grupo04.tf_arquiweb.entities.Local;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ILocalService {

    public void insert(Local local);
    public List<Local> list();
    public void delete(int LocalId);

    public List<Local> findByLocalNombre(String localnombre);
    public List<Local> findByLocalDireccion(String localdireccion);

    public List<Local> buscarXcalificacion(int estrellas);
}
