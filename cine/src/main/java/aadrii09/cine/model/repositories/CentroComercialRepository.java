package aadrii09.cine.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import aadrii09.cine.model.entities.CentroComercial;

public interface CentroComercialRepository extends JpaRepository<CentroComercial, Long> {
    
}
