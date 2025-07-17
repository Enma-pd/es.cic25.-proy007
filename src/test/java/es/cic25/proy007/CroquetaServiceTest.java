package es.cic25.proy007;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import es.cic25.proy007.model.Croqueta;
import es.cic25.proy007.service.CroquetaService;

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

    @Test
    void testDelete() {

        Croqueta croqueta = new Croqueta();

        croqueta.setPuntuacion(2);
        croqueta.setRestaurante("null");
        croqueta.setSaborCroqueta("Jamon");
        long croquetaId3 = croquetaService.create(croqueta);
        croquetaService.delete(croquetaId3);

        Croqueta croquetaEliminada = croquetaService.get(croquetaId3);
        assertNull(croquetaEliminada);
        
    }

    private long croquetaId = 100;
    @Test
    void testGet() {
        
        Croqueta croqueta = croquetaService.get(croquetaId);
        assertInstanceOf(Croqueta.class, croqueta);
          
    }

    private int puntuacion;
    private List<Croqueta> lista;
    @Test
    void testGet2() {
        
        Croqueta clasificacion = (Croqueta) croquetaService.get(puntuacion);
        lista.add(clasificacion);
        assertInstanceOf(Croqueta.class, clasificacion);
        
    }

    private long croquetaId2;
    @Test
    void testGet3() {

        Croqueta croquetaObtenida = croquetaService.get(croquetaId2);
        assertNotNull(croquetaObtenida);
        
    }

    private String restaurante ="Casa Pepe";
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
    @Test
    void testUpdate() {

        Croqueta croqueta = new Croqueta();

        croqueta.setPuntuacion(2);
        croqueta.setRestaurante("null");
        croqueta.setSaborCroqueta("Jamon");
        long croquetaId3 = croquetaService.create(croqueta);
        croquetaService.update(croqueta);

        Croqueta croquetaActualizaca = croquetaService.get(croquetaId3);
        assertNotNull(croquetaActualizaca);
        
    }
}
