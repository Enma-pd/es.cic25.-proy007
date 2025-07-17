package es.cic25.proy007.controller;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import es.cic25.proy007.model.Croqueta;
@SpringBootTest
public class CroquetaControllerTest {

    @Autowired
    private CroquetaController croquetaContoller;
    @Test
    void testCreate() {
        Croqueta croqueta = new Croqueta(); 
        croqueta.setPuntuacion(10);
        croqueta.setRestaurante("Casa Tito");
        croqueta.setSaborCroqueta("Jamón");

        long tipoCroqueta = croquetaContoller.create((croqueta));
        assertTrue(tipoCroqueta > 100);

    }
    private long croquetaId;
    @Test
    void testDelete() {
        
        Croqueta croqueta = new Croqueta();
        croqueta.setCroquetaId(croquetaId);
        croqueta.setPuntuacion(2);
        croqueta.setRestaurante("null");
        croqueta.setSaborCroqueta("Jamon");
        croquetaEliminada = croquetaContoller.delete(croquetaId);
        assertNull(croqueta);
    }
    private long croquetaId3;
    @Test
    void testGet() {
        Croqueta croqueta = croquetaContoller.get(croquetaId3);
        assertInstanceOf(Croqueta.class, croqueta);

    }
    private int puntuacion;
    private List<Croqueta> lista;
    @Test
    void testGet2() {
        Croqueta croqueta = croquetaContoller.get(puntuacion);
        lista.add(croqueta);
        assertNotNull(lista);

    }
    private long croquetaId2;
    @Test
    void testUpdate() {

        Croqueta croqueta = new Croqueta();
        croqueta.setCroquetaId(croquetaId2);
        croqueta.setPuntuacion(2);
        croqueta.setRestaurante("null");
        croqueta.setSaborCroqueta("Jamon");
        croquetaActualizada = croquetaContoller.update(croquetaId2);
        assertInstanceOf(Croqueta.class, croqueta);

    }
}
