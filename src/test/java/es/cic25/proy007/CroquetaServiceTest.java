package es.cic25.proy007;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import es.cic25.proy007.model.Croqueta;
import es.cic25.proy007.service.CroquetaService;

@SpringBootTest
public class CroquetaServiceTest {

    @Autowired
    private CroquetaService croquetaService;
    @Test
    void testCreate() {
    
        Croqueta croqueta = new Croqueta(); 
        croqueta.setPuntuacion(10);
        croqueta.setRestaurante("Casa Tito");
        croqueta.setSaborCroqueta("Jamón");
        croquetaService.create(croqueta);
        
        assertTrue(croquetaService.get1(1).getCroquetaId() == 1);
    }

    @Test
    void testDelete() {

        Croqueta croqueta = new Croqueta();

        croqueta.setPuntuacion(2);
        croqueta.setRestaurante("null");
        croqueta.setSaborCroqueta("Jamon");
        long croquetaId3 = croquetaService.create(croqueta);
        croquetaService.delete(croquetaId3);

        Croqueta croquetaEliminada = croquetaService.get1(croquetaId3);
        assertNull(croquetaEliminada);
        
    }

    @Test
    void testGet1() {
        
        Croqueta croqueta = new Croqueta();
        croqueta.setPuntuacion(10);
        croqueta.setRestaurante("Mi casa");
        croqueta.setSaborCroqueta("Bonito");
        croquetaService.create(croqueta);
        croquetaService.get1(5);
        assertInstanceOf(Croqueta.class, croqueta);
          
    }

    
    @Test
    void testGet2() {

        Croqueta croqueta = new Croqueta();
        croqueta.setRestaurante("Mi casa");
        croqueta.setSaborCroqueta("Bonito");
        croqueta.setPuntuacion(10);
        croquetaService.create(croqueta);
        assertEquals(croqueta.getPuntuacion(), croquetaService.get2(10));
        
    }

    @Test
    void testGet() {
        Croqueta croqueta = new Croqueta();
        croqueta.setPuntuacion(10);
        croqueta.setRestaurante("Mi casa");
        croqueta.setSaborCroqueta("Bonito");
        croquetaService.create(croqueta);
        Croqueta croqueta1 = new Croqueta();
        croqueta1.setPuntuacion(10);
        croqueta1.setRestaurante("Mi casa");
        croqueta1.setSaborCroqueta("Bonito");
        croquetaService.create(croqueta1);
        Croqueta croqueta2 = new Croqueta();
        croqueta2.setPuntuacion(10);
        croqueta2.setRestaurante("Mi casa");
        croqueta2.setSaborCroqueta("Bonito");
        croquetaService.create(croqueta);

        
        
    }

    
    @Test
    void testGetRestaurante() {
         Croqueta croqueta = new Croqueta();
        croqueta.setPuntuacion(10);
        croqueta.setSaborCroqueta("queso");
        croquetaService.getRestaurante("mi casa");
        croquetaService.create(croqueta);
        lista.add(croqueta);
        Croqueta croqueta1 = new Croqueta();
        croqueta1.setPuntuacion(10);
        croqueta1.setSaborCroqueta("jamón");
        croquetaService.getRestaurante("mocasa");
        croquetaService.create(croqueta1);
        lista.add(croqueta1);
        Croqueta croqueta2 = new Croqueta();
        croqueta2.setPuntuacion(10);
        croqueta2.setSaborCroqueta("Queso");
        croquetaService.getRestaurante("mocasa");
        croquetaService.create(croqueta2);
        lista.add(croqueta2);
        assertTrue (lista.size() ==3);
    }

    private List<Croqueta> lista;
    @Test
    void testGetSabor() {
        Croqueta croqueta = new Croqueta();
        croqueta.setPuntuacion(10);
        croquetaService.getSabor(null);
        croqueta.setRestaurante("mocasa");
        croquetaService.create(croqueta);
        lista.add(croqueta);
        Croqueta croqueta1 = new Croqueta();
        croqueta1.setPuntuacion(10);
        croquetaService.getSabor("jamón");
        croqueta1.setRestaurante("mocasa");
        croquetaService.create(croqueta1);
        lista.add(croqueta1);
        Croqueta croqueta2 = new Croqueta();
        croqueta2.setPuntuacion(10);
        croquetaService.getSabor("Queso");
        croqueta2.setRestaurante("mocasa");
        croquetaService.create(croqueta2);
        lista.add(croqueta2);
        assertTrue (lista.size() ==3);
        
        
    }
    @Test
    void testUpdate() {

        Croqueta croqueta = new Croqueta();

        croqueta.setPuntuacion(2);
        croqueta.setRestaurante("null");
        croqueta.setSaborCroqueta("Jamon");
        long croquetaId3 = croquetaService.create(croqueta);
        croquetaService.update(croqueta);

        Croqueta croquetaActualizaca = croquetaService.get1(croquetaId3);
        assertNotNull(croquetaActualizaca);
        
    }
}
