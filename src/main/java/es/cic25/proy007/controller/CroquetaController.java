package es.cic25.proy007.controller;
import java.util.List;


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

    @Autowired
    private CroquetaService croquetaService;
    
    //POST
    //crea una croqueta a partir de un objeto Croqueta
    @PostMapping
    public long create(@RequestBody Croqueta croqueta){
        return croquetaService.create(croqueta);
    }

    //GET
    //Obtiene todas las croquetas
    @GetMapping
    public List<Croqueta> get(){
        return croquetaService.get();
    }
    
    //Obtiene una croqueta por id
    @GetMapping("/{croquetaId}")
    public Croqueta get(@PathVariable long croquetaId){
        return croquetaService.get(croquetaId);
    }   

    //Obtiene una croqueta por sabor 
    @GetMapping("/sabor/{saborcroqueta}")
    public List<Croqueta> getSabor(@PathVariable String saborCroqueta){
        return croquetaService.getSabor(saborCroqueta);
    }

    //Obtiene una croqueta por id
    @GetMapping("/restaurante/{restaurante}")
    public List<Croqueta> getRestaurante(@PathVariable String restaurante){
        return croquetaService.getRestaurante(restaurante);

    }

    //Obtiene una croqueta por puntuacion
    @GetMapping("/puntuacion/{puntuacion}")
    public List<Croqueta> get(@PathVariable int puntuacion){
        return croquetaService.get(puntuacion);
    }

    //PUT
    //Actualiza un registro de croqueta
    @PutMapping
    public void update (@RequestBody Croqueta croqueta){
        croquetaService.update(croqueta);
    }

    //DELETE
    //Borrra una croqueta por id
    @DeleteMapping
    public void delete(@PathVariable long idCroqueta){
        croquetaService.delete(idCroqueta);
    }

}
 