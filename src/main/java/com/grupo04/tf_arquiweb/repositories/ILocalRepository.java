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

    @Query("SELECT COUNT(l.localid) FROM Local l")
    public int cantidadLocales();
    @Query("SELECT f FROM Local f INNER JOIN Bicicleta b ON f.localid = b.local.localid\n" +
            " INNER JOIN DetalledeReserva dr ON b.bicicletaid=dr.bicicleta.bicicletaid\n" +
            " INNER JOIN Reserva rv ON dr.reserva.reservaid = rv.reservaid\n" +
            " INNER JOIN Resena rn ON rv.reservaid = rn.reserva.reservaid\n" +
            " WHERE rn.resenaestrellas = :estrellas")
    public List<Local> buscarXcalificacion(@Param("estrellas") int estrellas);

    @Query("SELECT l FROM Local l\n" +
            " Inner join Usuario u on l.usuario.UsuarioId = u.UsuarioId\n" +
            " Where u.UsuarioId=:usuarioid")

    public List<Local> buscarXempresario(@Param("usuarioid")int usuarioid);


    @Query(value = "SELECT u.usuario_nombre, count(l.local_nombre)\n" +
            "FROM local l\n" +
            "JOIN usuario u ON l.usuario_id = u.usuario_id\n" +
            "JOIN roles r ON u.roles_id = r.roles_id\n" +
            "WHERE r.rol = 'EMPRESARIO'\n" +
            "group by u.usuario_nombre", nativeQuery = true)
    public List<String[]> quantityLocalesByEmpresario();

}
