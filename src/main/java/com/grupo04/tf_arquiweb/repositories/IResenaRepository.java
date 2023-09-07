package com.grupo04.tf_arquiweb.repositories;

import com.grupo04.tf_arquiweb.entities.Resena;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IResenaRepository extends JpaRepository<Resena,Integer> {

}