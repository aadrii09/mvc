package Colegio.model.Services.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Colegio.model.Entities.Alumno;
import Colegio.model.Repositories.IAlumnoRepository;
import Colegio.model.Services.Service.IAlumnoService;

@Service
public class AlumnoServiceImpl implements IAlumnoService {
    @Autowired
    private IAlumnoRepository AlumnoRepo;

    @Override
    public List<Alumno> findAllAlumnos() {
        return AlumnoRepo.findAll();
    }
    @Override
    public Long findAlumnosCount() {
        return AlumnoRepo.count();
    }
    @Override
    public List<Alumno> findAlumnosEdades() {
        return AlumnoRepo.findByEdadBetween(21, 24);
    }
    @Override
    public void deleteAlumno(Long id) {
        AlumnoRepo.deleteById(id);
    }
    @Override
    public Alumno saveAlumno(Alumno alumno) {
        return AlumnoRepo.save(alumno);
    }
    @Override
    public Alumno updateAlumno(Alumno alumno) {
        return AlumnoRepo.save(alumno);
    }
    @Override
    public Alumno findAlumnoById(Long id) {
        Optional<Alumno> optionalAlumno = AlumnoRepo.findById(id);
        if (optionalAlumno.isPresent()) {
            return optionalAlumno.get();
        } else {
            return null;
        }
    }

    

        
}
