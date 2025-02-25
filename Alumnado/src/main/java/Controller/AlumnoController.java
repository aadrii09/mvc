package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import Services.AlumnoService;
import org.springframework.ui.Model;

@Controller

public class AlumnoController {
    @Autowired
    private AlumnoService alumnoService;

    @GetMapping("/listar")
    public String listarAlumnos(Model model) {
        model.addAttribute("alumnos", alumnoService.buscarTodosLosAlumnos());
        return "alumno/listar";
    }

}
