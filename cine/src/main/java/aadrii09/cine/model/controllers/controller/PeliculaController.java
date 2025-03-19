package aadrii09.cine.model.controllers.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import aadrii09.cine.model.entities.Pelicula;
import aadrii09.cine.model.services.service.PeliculaService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;


@Controller
@RequestMapping("/cineweb")
public class PeliculaController {


    @Autowired
    private PeliculaService peliculaService;


    @GetMapping("/peliculaslist")
    public String getAll(Model model) {
        model.addAttribute("peliculas", peliculaService.findAll());
        return "pelicula/peliculaslist";
    }
    
    @ModelAttribute("peliculaDuracion")
    public List<Pelicula> getPeliDuracion(){
        return peliculaService.findByDuracionBetween(95, 135);
    }
   
    @ModelAttribute("peliculaGeneros")
    public Integer getPeliGeneros(){
        return peliculaService.findByGeneroOrGenero("Drama", "Action");
    }
    
    
}
