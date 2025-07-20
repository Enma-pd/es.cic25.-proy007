package es.cic25.proy007.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import es.cic25.proy007.model.Croqueta;

public interface CroquetaRepository extends JpaRepository <Croqueta,Long> {

    //private static final LOGGER = LoggerFactory.getLogger(CroquetaRepository.interface);

    List<Croqueta> findByCroquetaId(long croquetaId);
    List<Croqueta> findBySaborCroqueta(String saborCroqueta);
    List<Croqueta> findByRestaurante(String restaurante);
    List<Croqueta> findByPuntuacion(int puntuacion);
}
