package es.cic25.proy007.service;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import es.cic25.proy007.repository.CroquetaRepository;
import es.cic25.proy007.model.Croqueta;


@Service
public class CroquetaService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CroquetaService.class);
    
    @Autowired
    private CroquetaRepository croquetaRepository;

    //POST
    //crea una croqueta
    public long create(Croqueta croqueta){

        LOGGER.info("Creo la croqueta" + croqueta);
        return croquetaRepository.save(croqueta).getCroquetaId();
    }

    //GET
    //lista todas las croquetas
    public List<Croqueta> get(){

        LOGGER.info("Obtengo todas las croquetas");
        return croquetaRepository.findAll();
    }

    //Obtiene una croqueta por id
    public Croqueta get1(long croquetaID){
        LOGGER.info("Obtengo la croqueta con el id" + croquetaID);
        return croquetaRepository.findById(croquetaID).orElse(null);
    }

    //Obtiene un listado de croquetas por sabor
    public String getSabor(String saborCroqueta){
        LOGGER.info("Obtengo el sabor de croqueta" + saborCroqueta);
        return croquetaRepository.findBySaborCroqueta(saborCroqueta);
    }

    //Obtiene un listado de croquetas por restaurante
    public String getRestaurante(String restaurante){
        LOGGER.info("Obtengo el resuaturante"+restaurante);
        return croquetaRepository.findByRestaurante(restaurante);
    }

    //Obtiene un listado de croquetas con una igual o mayor puntuacion
    public int get2(int puntuacion){
        LOGGER.info("La puntuación es"+ puntuacion);
        return croquetaRepository.findByPuntuacionGreaterThanEqual(puntuacion);
    }

    //PUT
    //Actualiza una croqueta
    public void update(Croqueta croqueta){
        LOGGER.info("Actualización"+ croqueta);
        croquetaRepository.save(croqueta);
    }

    //DELETE
    //Borra una croquetea por id
    public void delete(long croqueta){
        LOGGER.info("Eliminando la croqueta"+ croqueta);
        croquetaRepository.deleteById(croqueta);
    }

    public Object findById(long croquetaId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    public List<Croqueta> setPuntuacion(int puntuacion) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setPuntuacion'");
    }
}
