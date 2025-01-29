package Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import Entities.Asignatura;

public interface IAsignatura extends JpaRepository<Asignatura, Integer> {
    
}
