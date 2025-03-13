package Colegio.model.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Colegio.model.Entities.Alumno;
import Colegio.model.Services.Service.IAlumnoService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
@RequestMapping("/alumnos")
public class AlumnoRest {

    @Autowired
    private IAlumnoService alumnoService;

    @GetMapping("/all")
    public List<Alumno> findAllAlumnos() {
        return alumnoService.findAllAlumnos();
    }
    
    @PostMapping("crear")
    public Alumno crearAlumno(@RequestBody Alumno alumno) {
        return alumnoService.saveAlumno(alumno);
    }
    
    @PutMapping("/actualizar")
    public Alumno actualizarAlumno(@RequestBody Alumno alumno) {
        return alumnoService.updateAlumno(alumno);
    }

    @DeleteMapping("/eliminar")
    public void eliminarAlumno(@RequestBody Long id) {
        alumnoService.deleteAlumno(id);
    }
    @GetMapping("/buscarId/{id}")
    public Alumno buscarAlumno(@PathVariable("id") Long id) {
        return alumnoService.findAlumnoById(id);
    }
    
}
