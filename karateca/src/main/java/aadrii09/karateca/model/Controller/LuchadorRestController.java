package aadrii09.karateca.model.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import aadrii09.karateca.model.Services.Service.LuchadorService;
import aadrii09.karateca.model.entities.Luchador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/luchador")
public class LuchadorRestController {

    @Autowired
    private LuchadorService luchadorService;

    @GetMapping("/{id}")
    public Luchador findByILuchador(@PathVariable Long id) {
        return luchadorService.findById(id);
    }
   
    
    
}
