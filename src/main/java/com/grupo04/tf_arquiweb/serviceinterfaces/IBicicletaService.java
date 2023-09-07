package com.grupo04.tf_arquiweb.serviceinterfaces;

import com.grupo04.tf_arquiweb.entities.Bicicleta;

import java.util.List;

public interface IBicicletaService {

    public void insert(Bicicleta bicicleta);
    public List<Bicicleta> list();
    public void delete(int BicicletaId);

}
