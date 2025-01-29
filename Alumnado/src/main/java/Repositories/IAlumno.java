package Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import Entities.Alumno;

public interface IAlumno extends JpaRepository <Alumno, Integer> {
    
}
