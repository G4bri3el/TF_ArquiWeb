package com.grupo04.tf_arquiweb.repositories;

import com.grupo04.tf_arquiweb.entities.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IReservaRepository extends JpaRepository<Reserva, Integer> {

    @Query("select r from Reserva r where r.usuario.UsuarioId =:usuarioid")
    public List<Reserva> reservasXcliente(@Param("usuarioid") int id);

    @Query("select r from Reserva r\n" +
            " inner join DetalledeReserva dr on r.reservaid=dr.reserva.reservaid\n" +
            " inner join Bicicleta b on dr.bicicleta.bicicletaid=b.bicicletaid\n" +
            " inner join Local l on b.local.localid = l.localid\n" +
            " where l.usuario.UsuarioId=:usuarioid")
    public List<Reserva> reservasPorEmpresario(@Param("usuarioid") int id);

    @Query(value = "select l.local_nombre, count(v.reservaid) as cantidadreservas\n" +
            " from reserva v inner join detallede_reserva dr\n" +
            " on v.reservaid=dr.reserva_id\n" +
            " inner join bicicleta b\n" +
            " on dr.bicicleta_id=b.bicicletaid\n" +
            " inner join local l\n" +
            " on b.local_id=l.localid\n" +
            " where l.usuario_id=:usuario_id\n" +
            " group by l.local_nombre",nativeQuery = true)
    public List<String[]> cantidadreservasporlocal(@Param("usuario_id")int usuarioid);


}
