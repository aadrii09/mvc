package aadrii09.biblioteca.model.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RestController;

import aadrii09.biblioteca.model.entities.Libro;
import aadrii09.biblioteca.model.services.service.ILibroService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
@RequestMapping("/libritos")
public class LibroRestController {
    @Autowired
    private ILibroService libroService;

    @GetMapping("/{id}")
    public Libro findById(@PathVariable("id") Long id) {
        return libroService.findById(id);
        
    }
       @GetMapping("/librosgeneros")
    public List<Libro> getLibrosByGenero(Model model) {
        List<Libro> libros = libroService.getLibrosByGenero(); 
        
        return libros; 
    }
    
}
