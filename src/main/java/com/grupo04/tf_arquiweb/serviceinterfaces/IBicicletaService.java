package com.grupo04.tf_arquiweb.serviceinterfaces;

import com.grupo04.tf_arquiweb.entities.Bicicleta;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IBicicletaService {

    public void insert(Bicicleta bicicleta);
    public List<Bicicleta> list();
    public void delete(int BicicletaId);

    public List<String[]> listaBicicletasPorLocalEmpresario( int usuarioid,  int localid);

}
