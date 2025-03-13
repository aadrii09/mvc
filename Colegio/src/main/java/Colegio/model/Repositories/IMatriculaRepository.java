package Colegio.model.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import Colegio.model.Entities.Matricula;

public  interface IMatriculaRepository extends JpaRepository<Matricula, Long> {
  
    
} 
