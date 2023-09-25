package com.grupo04.tf_arquiweb.repositories;

import com.grupo04.tf_arquiweb.entities.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IReservaRepository extends JpaRepository<Reserva, Integer> {
    @Query(value = "select l.local_nombre, count(re.reserva_id) as cantidadreservas\n" +
            " from local l inner join usuario u\n" +
            " on l.usuario_id=u.usuario_id\n" +
            " inner join reserva re\n" +
            " on u.usuario_id=re.usuario_id\n" +
            "where u.usuario_id=:usuario_id" +
            " group by l.local_nombre",nativeQuery = true)
    public List<String[]> cantidadreservasporlocal(@Param("usuario_id")int usuario_id);

}
