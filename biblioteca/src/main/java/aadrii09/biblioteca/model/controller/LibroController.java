package aadrii09.biblioteca.model.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;


import aadrii09.biblioteca.model.entities.Libro;
import aadrii09.biblioteca.model.services.service.ILibroService;


@Controller
@RequestMapping("/libro")
public class LibroController {
     @Autowired
    private ILibroService libroService;

    @GetMapping("/librosgeneros")
    public String getLibrosByGenero(Model model) {
 
        List<Libro> libros = libroService.getLibrosByGenero();
        
        model.addAttribute("libros", libros);
        return "libro/librosgeneros"; 
    }
    
}