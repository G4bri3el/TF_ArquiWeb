package com.grupo04.tf_arquiweb.repositories;

import com.grupo04.tf_arquiweb.entities.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.management.relation.Role;

@Repository
public interface IRolesRepository extends JpaRepository<Roles,Integer> {
}
