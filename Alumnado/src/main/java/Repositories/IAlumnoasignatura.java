package Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import Entities.AlumnoAsignatura;


public interface IAlumnoasignatura extends JpaRepository<AlumnoAsignatura, Integer> {
    
}
