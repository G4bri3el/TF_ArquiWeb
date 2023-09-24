package com.grupo04.tf_arquiweb.repositories;

import com.grupo04.tf_arquiweb.entities.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IReservaRepository extends JpaRepository<Reserva, Integer> {
@Query(value = "select r.ReservaId, u.UsuarioId, u.UsuarioNombre, r.ReservaFechaInicio, r.ReservaFechaFin, r.ReservaMontoTotal" +
        " from Reserva r inner join Usuario u on r.ReservaId=u.UsuarioId Group by r.UsuarioId",nativeQuery = true)
    List<Reserva> reservasPorEmpresario(int usuarioid);
}
