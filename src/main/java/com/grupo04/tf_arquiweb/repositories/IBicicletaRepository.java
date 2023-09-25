package com.grupo04.tf_arquiweb.repositories;

import com.grupo04.tf_arquiweb.dtos.BicicletaLocalEmpresarioDTO;
import com.grupo04.tf_arquiweb.entities.Bicicleta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IBicicletaRepository extends JpaRepository<Bicicleta, Integer> {

    @Query(value = "SELECT b.bicicleta_modelo, b.bicicleta_estado," +
            "b.bicicleta_precio, b.bicicleta_num_aro, b.bicicleta_detalles, " +
            "b.bicicleta_foto FROM bicicleta b INNER JOIN Local l \n" +
            "ON l.localid = b.local_id INNER JOIN\n" +
            "usuario u ON u.usuarioid = l.usuario_id  WHERE u.usuarioid =:usuarioid and \n" +
            "l.localid = :localid", nativeQuery = true)
    public List<String[]> listaBicicletasPorLocalEmpresario(@Param("usuarioid") int usuarioid, @Param("localid") int localid);

}
