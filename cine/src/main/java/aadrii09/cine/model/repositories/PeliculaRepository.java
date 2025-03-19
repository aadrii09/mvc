package aadrii09.cine.model.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import aadrii09.cine.model.entities.Pelicula;

public interface PeliculaRepository extends JpaRepository<Pelicula, Long> {
    
    List<Pelicula> findByDuracionBetween(Integer min, Integer max);
    List<Pelicula> findByGeneroOrGenero(String genero, String genero2);

}
