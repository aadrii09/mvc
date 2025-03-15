package aadrii09.rocketLeague.model.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import aadrii09.rocketLeague.model.entities.Jugador;
import aadrii09.rocketLeague.model.services.service.IJugadorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;





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

    @GetMapping("/form")
    public String showForm(Model model) {
    // Crear un objeto Jugador vacío para el formulario
    model.addAttribute("jugador", new Jugador());
    return "jugador/form";
    }
    @PostMapping("/save")
    public String saveJugador(@ModelAttribute Jugador jugador) {
    jugadorService.saveJugador(jugador);
    return "redirect:/jugadorController/all";
    }

    @GetMapping("/update")
    public String showUpdateForm(@RequestParam("id") Long id, Model model) {
        Jugador jugador = jugadorService.findById(id);
        if (jugador != null) {
            model.addAttribute("jugador", jugador);
            return "jugador/update";
        }
        return "redirect:/jugadorController/all";
    }
    @PostMapping("/update/{id}")
    public String updateJugador(@PathVariable("id") Long id, @ModelAttribute Jugador jugador) {
    jugador.setId(id); 
    jugadorService.updateJugador(jugador);
    return "redirect:/jugadorController/all";
}
    

}
