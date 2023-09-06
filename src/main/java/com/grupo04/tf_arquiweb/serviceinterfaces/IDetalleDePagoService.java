package com.grupo04.tf_arquiweb.serviceinterfaces;

import com.grupo04.tf_arquiweb.entities.DetalleDePago;

import java.util.List;

public interface IDetalleDePagoService {
    public void insert(DetalleDePago detalleDePago);
    public List<DetalleDePago> list();
    public void delete(int DetalleDePagoID);
}
