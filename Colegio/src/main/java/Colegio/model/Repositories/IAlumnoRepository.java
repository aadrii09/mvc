package Colegio.model.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import Colegio.model.Entities.Alumno;

public interface IAlumnoRepository extends JpaRepository<Alumno, Long> {

    List<Alumno> findByEdadBetween(int edadMin, int edadMax);
}
