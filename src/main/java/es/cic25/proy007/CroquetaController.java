package es.cic25.proy007;
import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/croqueta")
public class CroquetaController {

    @Autowired
    private CroquetaService croquetaService;
    private long contador=100;
    
    @PostMapping
    public long create(@RequestBody Croqueta croqueta){
        long croquetaId = croquetaService.create(croqueta);
        return croquetaId;
    }

    @GetMapping
    public List<Croqueta> get(){
        List<Croqueta> clasificacion = new ArrayList<>();
        Croqueta croqueta1 = new Croqueta();
        croqueta1.setCroquetaId(contador +1);
        croqueta1.setRestaurante("Casa de mi abuela");
        croqueta1.setSaborCroqueta("Jamón");
        croqueta1.setPuntuacion(10);

        clasificacion.add(croqueta1);

        Croqueta croqueta2 = new Croqueta();
        croqueta2.setCroquetaId(contador +2);
        croqueta2.setRestaurante("Buda");
        croqueta2.setSaborCroqueta("Jamón");
        croqueta2.setPuntuacion(8);

        clasificacion.add(croqueta2);

        Croqueta croqueta3 = new Croqueta();
        croqueta3.setCroquetaId(contador +3);
        croqueta3.setRestaurante("Los Girasoles");
        croqueta3.setSaborCroqueta("Huevo");
        croqueta3.setPuntuacion(7);

        clasificacion.add(croqueta3);

        Croqueta croqueta4 = new Croqueta();
        croqueta4.setCroquetaId(contador +4);
        croqueta4.setRestaurante("Taberna del Herrero");
        croqueta4.setSaborCroqueta("Queso");
        croqueta4.setPuntuacion(9);

        clasificacion.add(croqueta4);

        //List<Croquetas> lista= new ArrayList()<>;
       // public Croquetas croqueta = new Croquetas();
        //for i==clasificacion[0] to clasificacion[4];
       // if(clasificacion.max(croqueta.setPuntuacion())){
      //      lista.add(croqueta.setPuntuacion());
        return clasificacion;
    }
    

    @GetMapping("/{croquetaId}")
    public Croqueta get(@PathVariable long croquetaId){
        Croqueta croqueta1 = new Croqueta();
        croqueta1.setCroquetaId(croquetaId);
        croqueta1.setRestaurante("Casa de mi abuela");
        croqueta1.setSaborCroqueta("Jamón");
        croqueta1.setPuntuacion(10);
        return croqueta1;

        //if (croquetaId == croqueta1.setCroquetaId(croquetaId))
    }   

    @PutMapping
    public void update (Croqueta croqueta){
        //falta escribir metodo
    }

    @DeleteMapping
    public void delete(Croqueta croqueta){
        //falta escribir metodo
    }

}
 