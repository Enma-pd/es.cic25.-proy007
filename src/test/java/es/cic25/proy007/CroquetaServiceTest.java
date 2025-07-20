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

    
    private List<Croqueta> lista;
    @Test
    void testGet2() {

        Croqueta croqueta = new Croqueta();
        croqueta.setRestaurante("Mi casa");
        croqueta.setSaborCroqueta("Bonito");
        croqueta.setPuntuacion(croquetaService.get2(10));
        Croqueta croqueta1 = new Croqueta();
        croqueta1.setRestaurante("Mi casa");
        croqueta1.setSaborCroqueta("Bonito");
        croqueta1.setPuntuacion(croquetaService.get2(10));
        Croqueta croqueta2 = new Croqueta();
        croqueta2.setPuntuacion(croquetaService.get2(10));
        croqueta2.setRestaurante("Mi casa");
        croqueta2.setSaborCroqueta("Bonito");
        croquetaService.create(croqueta);
        croquetaService.create(croqueta2);
        croquetaService.create(croqueta1);
        lista.add(croqueta);
        lista.add(croqueta2);
        lista.add(croqueta1);
        
        assertTrue(lista.size()==3);
        
    }

    private long croquetaId2;
    @Test
    void testGet() {

        Croqueta croquetaObtenida = croquetaService.get1(croquetaId2);
        assertNotNull(croquetaObtenida);
        
    }

    
    @Test
    void testGetRestaurante() {
        Croqueta croqueta = new Croqueta();
        croqueta.setPuntuacion(10);
        croqueta.setSaborCroqueta("Bonito");
        croqueta.setRestaurante(croquetaService.getRestaurante("Casa Pepe"));
        croquetaService.create(croqueta);

        assertTrue(croqueta.getRestaurante()=="Casa Pepe");
    }


    @Test
    void testGetSabor() {
        Croqueta croqueta = new Croqueta();
        croqueta.setPuntuacion(10);
        croqueta.setSaborCroqueta(croquetaService.getSabor("Bonito"));
        croqueta.setRestaurante("mocasa");
        croquetaService.create(croqueta);

        assertTrue(croqueta.getRestaurante()=="mocasa");
        
        
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
