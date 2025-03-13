package Colegio.model.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Colegio.model.Entities.Alumno;
import Colegio.model.Services.Service.IAlumnoService;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/alumnos")
public class AlumnoRest {

    @Autowired
    private IAlumnoService alumnoService;

    @GetMapping("/all")
    public List<Alumno> findAllAlumnos() {
        return alumnoService.findAllAlumnos();
    }
    
    
    
}
