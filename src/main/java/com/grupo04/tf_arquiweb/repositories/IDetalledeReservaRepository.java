package com.grupo04.tf_arquiweb.repositories;

import com.grupo04.tf_arquiweb.entities.DetalledeReserva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDetalledeReservaRepository extends JpaRepository<DetalledeReserva, Integer> {
}
