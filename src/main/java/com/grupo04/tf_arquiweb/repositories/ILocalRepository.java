package com.grupo04.tf_arquiweb.repositories;

import com.grupo04.tf_arquiweb.entities.Local;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ILocalRepository extends JpaRepository<Local, Integer> {

    public List<Local> findByLocalnombre(String localnombre);

    public List<Local> findByLocaldireccion(String localdireccion);


    @Query("SELECT f FROM Local f INNER JOIN Bicicleta b ON f.localid = b.local.localid\n" +
            " INNER JOIN DetalledeReserva dr ON b.bicicletaId=dr.bicicleta.bicicletaId\n" +
            " INNER JOIN Reserva rv ON dr.reserva.reservaid = rv.reservaid\n" +
            " INNER JOIN Resena rn ON rv.reservaid = rn.reserva.reservaid\n" +
            " WHERE rn.resenaestrellas = :estrellas")
    public List<Local> buscarXcalificacion(@Param("estrellas") int estrellas);

    @Query("SELECT u.UsuarioId, l.localid, l.localnombre, l.localdireccion FROM Local l\n" +
            " Inner join Usuario u on l.usuario.UsuarioId = u.UsuarioId\n" +
            " ORDER BY u.UsuarioId ASC ")
    public List<Local> buscarXempresario(int usuarioid);
}
