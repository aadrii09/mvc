package aadrii09.cine.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import aadrii09.cine.model.entities.Cine;

public interface CineRepository extends JpaRepository<Cine, Long> {
    
}
