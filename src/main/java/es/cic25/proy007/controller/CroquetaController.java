package es.cic25.proy007.controller;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.cic25.proy007.model.Croqueta;
import es.cic25.proy007.service.CroquetaService;



@RestController
@RequestMapping("/croqueta")
public class CroquetaController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CroquetaController.class);


    @Autowired
    private CroquetaService croquetaService;
    
    //POST
    //crea una croqueta a partir de un objeto Croqueta
    @PostMapping
    public long create(@RequestBody Croqueta croqueta){
        LOGGER.info("Crear una croqueta"+ croqueta);
        return croquetaService.create(croqueta);
    }

    //GET
    //Obtiene todas las croquetas
    @GetMapping
    public List<Croqueta> get(){
        LOGGER.info("Hacer una lista con las croquetas obtenidas");
        return croquetaService.get();
    }
    
    //Obtiene una croqueta por id
    @GetMapping("/{croquetaId}")
    public Croqueta get(@PathVariable long croquetaId){
        LOGGER.info("Obtener la croqueta por id"+croquetaId);
        return croquetaService.get1(croquetaId);
    }   

    //Obtiene una croqueta por sabor 
    @GetMapping("/sabor/{saborcroqueta}")
    public String getSabor(@PathVariable String saborCroqueta){
        LOGGER.info("Obtener las croquetas con sabor"+saborCroqueta);
        return croquetaService.getSabor(saborCroqueta);
    }

    //Obtiene una croqueta por id
    @GetMapping("/restaurante/{restaurante}")
    public String getRestaurante(@PathVariable String restaurante){
        LOGGER.info("Obtener las croquetas de"+restaurante);
        return croquetaService.getRestaurante(restaurante);

    }

    //Obtiene una croqueta por puntuacion
    @GetMapping("/puntuacion/{puntuacion}")
    public List<Croqueta> getPuntuacion(@PathVariable int puntuacion){
        LOGGER.info("Obtener las croquetas con puntuacion"+puntuacion);
        return croquetaService.setPuntuacion(puntuacion);
    }

    //PUT
    //Actualiza un registro de croqueta
    @PutMapping
    public void update (@RequestBody Croqueta croqueta){
        LOGGER.info("Actualizar la croqueta"+croqueta);
        croquetaService.update(croqueta);
    }

    //DELETE
    //Borrra una croqueta por id
    @DeleteMapping
    public void delete(@PathVariable long idCroqueta){
        LOGGER.info("Eliminar la croqueta con id"+idCroqueta);
        croquetaService.delete(idCroqueta);
    }

}
 