package aadrii09.karateca.model.Services.Service;

import java.util.List;

import aadrii09.karateca.model.entities.Luchador;

public interface LuchadorService {

    Luchador findById(Long id);
    List<Luchador> findByNombre(String nombre);
    
    
}
