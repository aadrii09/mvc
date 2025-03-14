package Colegio.model.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import Colegio.model.Entities.Alumno;
import Colegio.model.Entities.Matricula;
import Colegio.model.Services.Service.IAlumnoService;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/alumnado")
public class AlumnoController {
    @Autowired
    private IAlumnoService alumnoService;

    @GetMapping("/all")
    public String getAllAlumnos(Model model) {
        List<Alumno> alumnos = alumnoService.findAllAlumnos();
        model.addAttribute("alumnos", alumnos);
        model.addAttribute("alumnosCount", alumnoService.findAlumnosCount());
        return "alumnos/alumnos";
    }
    @GetMapping("/edades")
    public String getBetweenEdades(Model model) {
        List<Alumno> alumnos = alumnoService.findAlumnosEdades();
        model.addAttribute("alumnos", alumnos);
        return "alumnos/alumnosedades";
    }
    @GetMapping("/delete/{id}")
    public String deleteAlumno(@PathVariable Long id) {
        alumnoService.deleteAlumno(id);
        return "redirect:/alumnado/all";
    }
    @GetMapping("/alumnosNotas")
    public String showAlumnosList(Model model) {
        List<Alumno> alumnos = alumnoService.findAllAlumnos();
        Map<Long, Double> avgGrades = new HashMap<>();

        for (Alumno alumno : alumnos) {
            List<Matricula> matriculas = alumno.getMatriculas();
            if (matriculas == null || matriculas.isEmpty()) {
                avgGrades.put(alumno.getId(), 0.0);
            } else {
                double sum = 0.0;
                for (Matricula matricula : matriculas) {
                    sum += matricula.getNota();
                }
                avgGrades.put(alumno.getId(), sum / matriculas.size());
            }
        }

        model.addAttribute("alumnos", alumnos);
        model.addAttribute("avgGrades", avgGrades);
        return "alumnos/alumnosnotas";
    }
    
}
