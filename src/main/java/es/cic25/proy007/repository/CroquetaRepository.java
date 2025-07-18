package es.cic25.proy007.repository;

import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import es.cic25.proy007.model.Croqueta;

@Repository
public interface CroquetaRepository extends JpaRepository <Croqueta,Long> {
    
    List<Croqueta> findBySaborCroqueta(String saborCroqueta);
    List<Croqueta> findByRestaurante(String restaurante);
    List<Croqueta> findByPuntuacionGreaterThanEqual(int puntuacion);
}
