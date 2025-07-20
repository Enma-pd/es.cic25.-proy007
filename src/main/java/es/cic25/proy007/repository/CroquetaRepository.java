package es.cic25.proy007.repository;

import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import es.cic25.proy007.model.Croqueta;

public interface CroquetaRepository extends JpaRepository <Croqueta,Long> {

    //private static final LOGGER = LoggerFactory.getLogger(CroquetaRepository.interface);

    long findByCroquetaId(long croquetaId);
    String findBySaborCroqueta(String saborCroqueta);
    String findByRestaurante(String restaurante);
    int findByPuntuacionGreaterThanEqual(int puntuacion);
}
