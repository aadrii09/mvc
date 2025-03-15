package aadrii09.rocketLeague.model.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import aadrii09.rocketLeague.model.entities.Jugador;
import aadrii09.rocketLeague.model.services.service.IJugadorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/jugador")
public class JugadorRestController {
    @Autowired  
    private IJugadorService jugadorService;

    @GetMapping("/{id}")
    public Jugador findByJugador(@PathVariable("id") Long id){
        return jugadorService.findById(id);
    }
    @GetMapping("/all")
    public List<Jugador> findAll(){
        return jugadorService.findAll();
    
    }
}