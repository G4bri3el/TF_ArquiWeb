package com.grupo04.tf_arquiweb.serviceinterfaces;

import com.grupo04.tf_arquiweb.entities.Reserva;
import com.grupo04.tf_arquiweb.entities.Roles;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IReservaService {
    public void insert(Reserva reserva);
    public List<Reserva> list();
    public void delete(int reservaId);
    public List<String[]> cantidadreservasporlocal(@Param("usuario_id")int usuarioid);

    public List<Reserva> reservasXcliente(int id);
    public List<Reserva> reservasPorEmpresario(@Param("usuarioid") int id);

}
