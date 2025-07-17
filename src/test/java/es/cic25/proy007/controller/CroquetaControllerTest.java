package es.cic25.proy007.controller;

import static org.junit.jupiter.api.Assertions.assertTrue;

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

    @Test
    void testDelete() {

    }

    @Test
    void testGet() {

    }

    @Test
    void testGet2() {

    }

    @Test
    void testUpdate() {

    }
}
