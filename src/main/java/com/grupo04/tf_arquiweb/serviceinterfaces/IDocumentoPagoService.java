package com.grupo04.tf_arquiweb.serviceinterfaces;

import com.grupo04.tf_arquiweb.entities.DocumentoPago;

import java.util.List;

public interface IDocumentoPagoService {
    public void insert(DocumentoPago documentoPago);
    public List<DocumentoPago> list();
    public void delete(int DocumentoPagoId);
}
