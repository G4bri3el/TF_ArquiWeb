package com.grupo04.tf_arquiweb.serviceinterfaces;

import com.grupo04.tf_arquiweb.entities.Local;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ILocalService {

    public void insert(Local local);
    public List<Local> list();
    public void delete(int LocalId);

    public List<Local> findByLocalnombre(String localnombre);
    public List<Local> findByLocaldireccion(String localdireccion);

    public List<Local> buscarXcalificacion(int estrellas);

    public List<Local> buscarXempresario(int usuarioid);

    public int cantidadLocales();

    public List<String[]> quantityLocalesByEmpresario();

}
