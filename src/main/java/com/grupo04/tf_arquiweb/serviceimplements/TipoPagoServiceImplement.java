package com.grupo04.tf_arquiweb.serviceimplements;

import com.grupo04.tf_arquiweb.entities.TipoPago;
import com.grupo04.tf_arquiweb.repositories.ITipoPagoRepository;
import com.grupo04.tf_arquiweb.serviceinterfaces.ITipoPagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoPagoServiceImplement implements ITipoPagoService {
    @Autowired
    private ITipoPagoRepository tpR;
    @Override
    public void insert(TipoPago tipoPago){
        tpR.save(tipoPago);
    }
    @Override
    public List<TipoPago> list(){
        return tpR.findAll();
    }
    @Override
    public void delete(int TipoPagoID){
        tpR.deleteById(TipoPagoID);
    }
}
