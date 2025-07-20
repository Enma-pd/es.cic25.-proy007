package es.cic25.proy007.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import es.cic25.proy007.repository.CroquetaRepository;
import es.cic25.proy007.model.Croqueta;


@Service
public class CroquetaService {
    
    @Autowired
    private CroquetaRepository croquetaRepository;

    //POST
    //crea una croqueta
    public long create(Croqueta croqueta){
        return croquetaRepository.save(croqueta).getCroquetaId();
    }

    //GET
    //lista todas las croquetas
    public List<Croqueta> get(){
        return croquetaRepository.findAll();
    }

    //Obtiene una croqueta por id
    public Croqueta get1(long croquetaID){
        return croquetaRepository.findById(croquetaID).orElse(null);
    }

    //Obtiene un listado de croquetas por sabor
    public String getSabor(String saborCroqueta){
        return croquetaRepository.findBySaborCroqueta(saborCroqueta);
    }

    //Obtiene un listado de croquetas por restaurante
    public String getRestaurante(String restaurante){
        return croquetaRepository.findByRestaurante(restaurante);
    }

    //Obtiene un listado de croquetas con una igual o mayor puntuacion
    public int get2(int puntuacion){
        return croquetaRepository.findByPuntuacionGreaterThanEqual(puntuacion);
    }

    //PUT
    //Actualiza una croqueta
    public void update(Croqueta croqueta){
        croquetaRepository.save(croqueta);
    }

    //DELETE
    //Borra una croquetea por id
    public void delete(long croqueta){
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
