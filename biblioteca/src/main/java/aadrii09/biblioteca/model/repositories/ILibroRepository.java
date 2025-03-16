package aadrii09.biblioteca.model.repositories;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import aadrii09.biblioteca.model.entities.Libro;
import aadrii09.biblioteca.model.entities.ENUMS.Genero;

public interface ILibroRepository extends JpaRepository <Libro, Long> {
// Consulta para filtrar libros por genero
List<Libro> findByGenero(Genero genero);
}
