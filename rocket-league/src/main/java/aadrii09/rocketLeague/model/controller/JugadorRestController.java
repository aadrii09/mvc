package aadrii09.rocketLeague.model.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import aadrii09.rocketLeague.model.entities.Jugador;
import aadrii09.rocketLeague.model.services.service.IJugadorService;

@RestController
@RequestMapping("/jugadorRest")
public class JugadorRestController {
    @Autowired
    private IJugadorService jugadorService;

    @GetMapping("/{id}")
    public Jugador findByJugador(@RequestParam("id") Long id) {
        return jugadorService.findById(id);
    }
    @GetMapping("/all")
    public List<Jugador> findAll() {
        return jugadorService.findAll();
    }
    @GetMapping("/nombre/{nombre}")
    public Jugador findByNombre(@RequestParam("nombre") String nombre) {
        return jugadorService.findByNombre(nombre);
    }
    @DeleteMapping("/delete/{id}")
    
    public void deleteJugador(@RequestParam("id") Long id) {
        jugadorService.deleteJugador(id);
    }
    @PutMapping("/update/{id}")
    public Jugador updateJugador(@RequestBody Jugador jugador) {
        return jugadorService.updateJugador(jugador);
    }
    @PostMapping("/save")
    public Jugador saveJugador(@RequestBody Jugador jugador) {
        return jugadorService.saveJugador(jugador);
    }
}