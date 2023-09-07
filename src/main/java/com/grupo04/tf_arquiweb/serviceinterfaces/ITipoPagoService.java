package com.grupo04.tf_arquiweb.serviceinterfaces;

import com.grupo04.tf_arquiweb.entities.TipoPago;

import java.util.List;

public interface ITipoPagoService {
    public void insert(TipoPago tipoPago);
    public List<TipoPago> list();
    public void delete(int TipoPagoId);
}
