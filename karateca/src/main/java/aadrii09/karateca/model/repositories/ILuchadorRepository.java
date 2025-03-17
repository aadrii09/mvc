package aadrii09.karateca.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import aadrii09.karateca.model.entities.Luchador;
import java.util.List;


public interface ILuchadorRepository extends JpaRepository<Luchador, Long> {

  List<Luchador> findByNombre(String nombre);
    
    
}
