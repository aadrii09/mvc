package aadrii09.rocketLeague.model.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import aadrii09.rocketLeague.model.entities.Jugador;
import aadrii09.rocketLeague.model.services.service.IJugadorService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;




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
    @PostMapping("/save")
    public Jugador saveJugador(@RequestBody Jugador jugador){
        return jugadorService.saveJugador(jugador);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteJugador(@PathVariable("id") Long id){
        jugadorService.deleteJugador(id);
    }
    @PutMapping("update/{id}")
    public Jugador updateJugador(@RequestBody Jugador jugador) {
        return jugadorService.updateJugador(jugador);
    }
    @GetMapping("/nombre/{nombre}")
    public Jugador findByNombre(@PathVariable("nombre") String nombre) {
        return jugadorService.findByNombre(nombre);
    } 
    
}  
