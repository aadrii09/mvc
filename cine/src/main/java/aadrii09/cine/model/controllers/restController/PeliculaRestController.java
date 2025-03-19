package aadrii09.cine.model.controllers.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import aadrii09.cine.model.entities.Pelicula;
import aadrii09.cine.model.services.service.PeliculaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/peliculasRest")
public class PeliculaRestController {
    
    @Autowired
    private PeliculaService peliculaService;

    @GetMapping("/peliculas")
    public List<Pelicula> getAll(){
        return peliculaService.findAll();
        
    }
    
    
    
}
