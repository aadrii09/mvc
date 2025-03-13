package Colegio.model.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import Colegio.model.Entities.Asignatura;

public interface IAsignaturaRepository extends JpaRepository<Asignatura, Long> {
    
    
}
