package ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import Repositories.IAlumno;
import Entities.Alumno;
import Services.AlumnoService;

public class IAlumnoService implements AlumnoService {

    @Autowired
    IAlumno alumnoRepo;
    @Override
    public List<Alumno> buscarTodosLosAlumnos() {
        return alumnoRepo.findAll();
    }
    
    
}
