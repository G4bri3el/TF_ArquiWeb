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

}
