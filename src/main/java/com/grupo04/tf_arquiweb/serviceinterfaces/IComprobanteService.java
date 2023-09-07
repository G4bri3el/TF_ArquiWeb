package com.grupo04.tf_arquiweb.serviceinterfaces;

import com.grupo04.tf_arquiweb.entities.Comprobante;

import java.util.List;

public interface IComprobanteService {
    public void insert(Comprobante comprobante);
    public List<Comprobante> list();
    public void delete(int ComprobanteId);
}
