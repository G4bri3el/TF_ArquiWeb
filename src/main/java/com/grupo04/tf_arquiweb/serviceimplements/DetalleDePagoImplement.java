package com.grupo04.tf_arquiweb.serviceimplements;

import com.grupo04.tf_arquiweb.entities.DetalleDePago;
import com.grupo04.tf_arquiweb.repositories.IDetalleDePagoRepository;
import com.grupo04.tf_arquiweb.serviceinterfaces.IDetalleDePagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetalleDePagoImplement implements IDetalleDePagoService {

    @Autowired
    private IDetalleDePagoRepository dpR;
    @Override
    public void insert(DetalleDePago detalleDePago){
        dpR.save(detalleDePago);
    }
    @Override
    public List<DetalleDePago> list(){
        return dpR.findAll();
    }
    @Override
    public void delete(int DetalleDePagoId){
        dpR.deleteById(DetalleDePagoId);
    }
}
