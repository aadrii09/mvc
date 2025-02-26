package ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Repositories.IAlumno;
import Entities.Alumno;
import Services.AlumnoService;
@Service
public class IAlumnoService implements AlumnoService {

    @Autowired
    IAlumno alumnoRepo;
    @Override
    public List<Alumno> buscarTodosLosAlumnos() {
        return alumnoRepo.findAll();
    }
    
    
}
