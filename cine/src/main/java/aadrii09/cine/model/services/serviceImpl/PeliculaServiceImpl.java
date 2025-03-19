package aadrii09.cine.model.services.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aadrii09.cine.model.entities.Pelicula;
import aadrii09.cine.model.repositories.CentroComercialRepository;
import aadrii09.cine.model.repositories.PeliculaRepository;
import aadrii09.cine.model.services.service.PeliculaService;

@Service
public class PeliculaServiceImpl implements PeliculaService {


    
    @Autowired
    private PeliculaRepository peliculaRepository;

    

    @Override
    public List<Pelicula> findAll() {
        return peliculaRepository.findAll();
    }

    @Override
    public List<Pelicula> findByDuracionBetween(Integer min, Integer max) {
        return peliculaRepository.findByDuracionBetween(min, max);
    }

    @Override
    public Integer findByGeneroOrGenero(String genero, String genero2) {
     List<Pelicula> listaPeliculas = peliculaRepository.findByGeneroOrGenero(genero, genero2);
     Integer contador = 0; 
     for (Pelicula pelicula : listaPeliculas) {
        if (pelicula.getTitulo().length()>6) {
            contador ++;
        }
     }
     return contador;
    }

    @Override
    public Pelicula findById() {
        Optional<Pelicula> pelicula = peliculaRepository.findById(1L);
        if (pelicula.isPresent()) {
            return pelicula.get();
        } else {
            return null;
        }
    }

    
    
}
