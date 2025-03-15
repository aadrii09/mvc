package aadrii09.rocketLeague.model.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import aadrii09.rocketLeague.model.entities.Jugador;
import aadrii09.rocketLeague.model.services.service.IJugadorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
@RequestMapping("/jugadorController")
public class JugadorController {
    @Autowired
    private IJugadorService jugadorService;

    @GetMapping("/all")
    public String findAll( Model model) {
        List<Jugador> listaJugadores = jugadorService.findAll();
        model.addAttribute("jugadores", listaJugadores);
        return "jugador/jugadores";
    }
    @GetMapping("/delete")
    public String deleteJugador(@RequestParam("id") Long id) {
        jugadorService.deleteJugador(id);
        return "redirect:/jugadorController/all";
    }   
    

}
