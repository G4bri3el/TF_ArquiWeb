package com.grupo04.tf_arquiweb.serviceinterfaces;

import com.grupo04.tf_arquiweb.entities.DetalledeReserva;

import java.util.List;

public interface IDetalledeReservaService {

    public void insert(DetalledeReserva detalledeReserva);
    public List<DetalledeReserva> list();

    public void delete(int DetalleId);



}
