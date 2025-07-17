package es.cic25.proy007;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import es.cic25.proy007.controller.CroquetaController;
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
        
        Croqueta croqueta = new Croqueta();
        croqueta.setPuntuacion(2);
        croqueta.setRestaurante("null");
        croqueta.setSaborCroqueta("Jamon");

        long croquetaId2 = croquetaContoller.create(croqueta);

        croquetaContoller.delete(croquetaId2);

        Croqueta croquetaEliminada =croquetaContoller.get(croquetaId2);
        assertNull(croquetaEliminada);
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
        Croqueta croqueta = (Croqueta) croquetaContoller.getPuntuacion(puntuacion);
        lista.add(croqueta);
        assertNotNull(lista);

    }
    
    @Test
    void testUpdate() {

        Croqueta croqueta = new Croqueta();
        croqueta.setPuntuacion(2);
        croqueta.setRestaurante("null");
        croqueta.setSaborCroqueta("Jamon");

        long croquetaId2 = croquetaContoller.create(croqueta);

        croquetaContoller.update(croqueta);

        Croqueta croquetaActualizada =croquetaContoller.get(croquetaId2);
        assertNotNull(croquetaActualizada);

    }
}
