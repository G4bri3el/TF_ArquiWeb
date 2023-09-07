package com.grupo04.tf_arquiweb.serviceimplements;

import com.grupo04.tf_arquiweb.entities.DocumentoPago;
import com.grupo04.tf_arquiweb.repositories.IDocumentoPagoRepository;
import com.grupo04.tf_arquiweb.serviceinterfaces.IDocumentoPagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentoPagoServiceImplement implements IDocumentoPagoService {
    @Autowired
    private IDocumentoPagoRepository dpR;
    @Override
    public void insert(DocumentoPago documentoPago){
        dpR.save(documentoPago);
    }
    @Override
    public List<DocumentoPago> list(){
        return dpR.findAll();
    }
    @Override
    public void delete(int DocumentoPagoId){
        dpR.deleteById(DocumentoPagoId);
    }
}
