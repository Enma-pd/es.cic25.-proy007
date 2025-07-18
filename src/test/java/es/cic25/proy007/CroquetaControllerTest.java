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
        long tipoCroqueta = croquetaContoller.create(croqueta);
        assertTrue(tipoCroqueta == 1);

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
    
    
    @Test
    void testGet() {
        Croqueta croqueta = new Croqueta(); 
        croqueta.setPuntuacion(10);
        croqueta.setRestaurante("Casa Tito");
        croqueta.setSaborCroqueta("Jamón");
        long tipoCroqueta = croquetaContoller.create(croqueta);

        Croqueta tipCroqueta = croquetaContoller.get(1);
        assertTrue(tipCroqueta.getRestaurante().equals("Casa Tito"));
    }
    

    @Test
    void testGetListado() {
        Croqueta croqueta = new Croqueta(); 
        croqueta.setPuntuacion(10);
        croqueta.setRestaurante("Casa Tito");
        croqueta.setSaborCroqueta("Jamón");
        Croqueta croqueta2 = new Croqueta(); 
        croqueta.setPuntuacion(10);
        croqueta.setRestaurante("Casa Tito");
        croqueta.setSaborCroqueta("Jamón");
        Croqueta croqueta3 = new Croqueta(); 
        croqueta.setPuntuacion(10);
        croqueta.setRestaurante("Casa Tito");
        croqueta.setSaborCroqueta("Jamón");
        croquetaContoller.create(croqueta);
        croquetaContoller.create(croqueta2);
        croquetaContoller.create(croqueta3);
        
        
        List<Croqueta> lista = croquetaContoller.get();
        
        
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
