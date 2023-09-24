package com.grupo04.tf_arquiweb.serviceinterfaces;

import com.grupo04.tf_arquiweb.entities.Reserva;
import com.grupo04.tf_arquiweb.entities.Roles;

import java.util.List;

public interface IReservaService {
    public void insert(Reserva reserva);
    public List<Reserva> list();

    public void delete(int ReservaId);

    List<Reserva> reservasPorEmpresario(int Usuarioid);

}
