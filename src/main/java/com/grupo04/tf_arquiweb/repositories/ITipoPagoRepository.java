package com.grupo04.tf_arquiweb.repositories;

import com.grupo04.tf_arquiweb.entities.TipoPago;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITipoPagoRepository extends JpaRepository<TipoPago, Integer> {
}
