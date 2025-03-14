package aadrii09.biblioteca.model.services.service;

import java.util.List;

import aadrii09.biblioteca.model.entities.Libro;

public interface ILibroService {

    List<Libro> getLibrosByGenero();
}
