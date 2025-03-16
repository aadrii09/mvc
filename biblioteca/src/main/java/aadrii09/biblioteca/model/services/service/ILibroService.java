package aadrii09.biblioteca.model.services.service;

import java.util.List;

import aadrii09.biblioteca.model.entities.Libro;

public interface ILibroService {
    // Consulta para filtrar libros por genero
    List<Libro> getLibrosByGenero();
    Long findLibrosCount();

    public Libro findById(Long id); 
}
