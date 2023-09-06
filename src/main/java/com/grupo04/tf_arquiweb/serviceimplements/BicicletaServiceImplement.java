package com.grupo04.tf_arquiweb.serviceimplements;

import com.grupo04.tf_arquiweb.entities.Bicicleta;
import com.grupo04.tf_arquiweb.repositories.IBicicletaRepository;
import com.grupo04.tf_arquiweb.serviceinterfaces.IBicicletaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BicicletaServiceImplement implements IBicicletaService {

    @Autowired
    private IBicicletaRepository bR;

    @Override
    public void insert(Bicicleta bicicleta) {
        bR.save(bicicleta);
    }

    @Override
    public List<Bicicleta> list() {
        return bR.findAll();
    }

    @Override
    public void delete(int BicicletaID) {
        bR.deleteById(BicicletaID);
    }
}
