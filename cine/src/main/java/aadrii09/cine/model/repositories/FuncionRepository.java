package aadrii09.cine.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import aadrii09.cine.model.entities.Funcion;

public interface FuncionRepository extends JpaRepository<Funcion, Long> {
    
}
