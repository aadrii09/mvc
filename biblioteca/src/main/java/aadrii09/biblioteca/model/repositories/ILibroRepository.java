package aadrii09.biblioteca.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import aadrii09.biblioteca.model.entities.Libro;

public interface ILibroRepository extends JpaRepository <Libro, Long> {
    
    
}
