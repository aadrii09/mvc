package aadrii09.biblioteca.model.services.serviceImpl;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aadrii09.biblioteca.model.entities.Libro;
import aadrii09.biblioteca.model.entities.ENUMS.Genero;
import aadrii09.biblioteca.model.repositories.ILibroRepository;
import aadrii09.biblioteca.model.services.service.ILibroService;

@Service
public class LibroServiceImpl implements ILibroService {
    @Autowired
    private ILibroRepository libroRepo;

    @Override
    public List<Libro> getLibrosByGenero() {

        return libroRepo.findByGenero(Genero.MISTERIO);
    }

    

  
    
    
   
}
