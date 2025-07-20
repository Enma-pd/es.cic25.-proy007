package es.cic25.proy007;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
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
    private List<Croqueta> lista = new ArrayList<>();
    @Test
    void testGet() {
        Croqueta croqueta = new Croqueta();
        croqueta.setPuntuacion(10);
        croqueta.setRestaurante("Mi casa");
        croqueta.setSaborCroqueta("Bonito");
        croquetaService.create(croqueta);
        croquetaService.get();
        assertInstanceOf(Croqueta.class, croqueta);
        lista.add(croqueta);
        assertTrue(lista.size()==1);  
        
    }

    
    @Test
    void testGetRestaurante() {
        Croqueta croqueta = new Croqueta();
        croqueta.setPuntuacion(10);
        croqueta.setSaborCroqueta("queso");
        croquetaService.create(croqueta);
        croquetaService.getRestaurante("mi casa");
        lista.add(croqueta);
        assertTrue(lista.size()==1);
        
    }

    
    @Test
    void testGetSabor() {
        Croqueta croqueta = new Croqueta();
        croqueta.setPuntuacion(10);
        croqueta.setRestaurante("quesona");
        croquetaService.getSabor("queso");
        croquetaService.create(croqueta);
        lista.add(croqueta);
        assertTrue(lista.size()==1);
        
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
