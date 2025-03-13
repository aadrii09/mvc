package Colegio.model.Services.Service;

import java.util.List;

import Colegio.model.Entities.Alumno;

public interface IAlumnoService  {
   
    List<Alumno> findAllAlumnos();
    Long findAlumnosCount();
    List<Alumno> findAlumnosEdades();
    void deleteAlumno(Long id);

    public Alumno saveAlumno(Alumno alumno);
    public Alumno updateAlumno(Alumno alumno);
    public Alumno findAlumnoById(Long id);
    
}
