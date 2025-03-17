package aadrii09.karateca.model.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import aadrii09.karateca.model.Services.Service.LuchadorService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/luchadores")
public class LuchadorController {

    @Autowired
    private LuchadorService luchadorService;
    
    @GetMapping("/luchadorNombre/{nombre}")
    public String getLuchadorByNombre(@PathVariable String nombre, Model model) {
        model.addAttribute("luchadores", luchadorService.findByNombre(nombre));
        return "luchador/luchadorNombre";
    }
}