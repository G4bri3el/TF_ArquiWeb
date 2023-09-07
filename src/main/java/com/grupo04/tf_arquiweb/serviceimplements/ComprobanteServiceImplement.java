package com.grupo04.tf_arquiweb.serviceimplements;

import com.grupo04.tf_arquiweb.entities.Comprobante;
import com.grupo04.tf_arquiweb.repositories.IComprobanteRepository;
import com.grupo04.tf_arquiweb.serviceinterfaces.IComprobanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComprobanteServiceImplement implements IComprobanteService {
    @Autowired
    private IComprobanteRepository cR;

    @Override
    public void insert(Comprobante comprobante){
        cR.save(comprobante);
    }
    @Override
    public List<Comprobante> list(){
        return cR.findAll();
    }
    @Override
    public void delete(int ComprobanteId){
        cR.deleteById(ComprobanteId);
    }

}
