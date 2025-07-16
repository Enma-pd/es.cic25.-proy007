package es.cic25.proy007.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import es.cic25.proy007.model.Croqueta;


@Service
public class CroquetaService {
    private long contador =100;
    public long create(Croqueta croquetas){
        return ++contador;
    }
    private List<Croqueta> lista = new ArrayList<>();
    public List<Croqueta> listar(Croqueta croqueta){
        //if (ordenar lista segun croquetas.Puntuacion pero no sabemos hacerlo todavia muy bien)
        return lista;
    }
}
