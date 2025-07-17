package es.cic25.proy007.service;

import static org.junit.jupiter.api.Assertions.assertTrue;

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

    @Test
    void testListar() {

    }
}
