package es.cic25.proy007.service;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import es.cic25.proy007.model.Croqueta;

public class CroquetaServiceTest {

    @Autowired
    private CroquetaService croquetaService;
    @Test
    void testCreate() {
        Croqueta croqueta = new Croqueta();
        croqueta.setPuntuacion(10);
        croqueta.setRestaurante("Casa Lolo");
        croqueta.setSaborCroqueta("Queso");

        
        long tipoCroqueta = croquetaService.create((croqueta));
        assertTrue(tipoCroqueta > 100);
    }

    private long idEliminacion;
    @Test
    void testDelete() {

        Croqueta croqueta = new Croqueta();
        croqueta.setCroquetaId(idEliminacion);
        croqueta.setPuntuacion(2);
        croqueta.setRestaurante("null");
        croqueta.setSaborCroqueta("Jamon");
        croquetaEliminada = croquetaService.delete(idEliminacion);
        assertNull(croqueta);
        
    }

    private long croquetaId = 100;
    @Test
    void testGet() {
        
        Croqueta croqueta = croquetaService.get(croquetaId);
        assertInstanceOf(Croqueta.class, croqueta);
          
    }

    private int puntuacion;
    @Test
    void testGet2() {
        
        Croqueta clasificacion = croquetaService.get(puntuacion);
        assertInstanceOf(Croqueta.class, clasificacion);
        
    }

    private long croquetaId2;
    @Test
    void testGet3() {

        Croqueta croquetaObtenida = croquetaService.get(croquetaId2);
        assertNotNull(croquetaObtenida);
        
    }

    private String restaurante ="Casa Pepe";
    private List<Croqueta> lista;
    @Test
    void testGetRestaurante() {
        Croqueta ristorante = (Croqueta) croquetaService.getRestaurante(restaurante);
        lista.add(ristorante);
        assertNotNull(lista);
    }


    private String sabor ="Queso";
    @Test
    void testGetSabor() {
        Croqueta sabore = (Croqueta) croquetaService.getRestaurante(sabor);
        lista.add(sabore);
        assertNotNull(lista);
        
    }
    private long croquetaId3;
    @Test
    void testUpdate() {

        Croqueta croqueta = new Croqueta();
        croqueta.setCroquetaId(croquetaId3);
        croqueta.setPuntuacion(2);
        croqueta.setRestaurante("null");
        croqueta.setSaborCroqueta("Jamon");
        croquetaActualizada = croquetaContoller.update(croquetaId3);
        assertInstanceOf(Croqueta.class, croqueta);
        
    }
}
