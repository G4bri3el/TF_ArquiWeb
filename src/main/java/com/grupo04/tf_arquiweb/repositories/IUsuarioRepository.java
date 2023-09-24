package com.grupo04.tf_arquiweb.repositories;

import com.grupo04.tf_arquiweb.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario,Integer> {

    public Usuario findByUsuarionombre(String Usuarionombre);
    /*
    //BUSCAR POR NOMBRE
    @Query("select count(u.UsuarioNombre) from Usuario u where u.UsuarioNombre =:username")
    public int buscarUsername(@Param("username") String nombre);
     */


}
