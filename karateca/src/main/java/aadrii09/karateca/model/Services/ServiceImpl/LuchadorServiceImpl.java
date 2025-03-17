package aadrii09.karateca.model.Services.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aadrii09.karateca.model.Services.Service.LuchadorService;
import aadrii09.karateca.model.entities.Luchador;
import aadrii09.karateca.model.repositories.ILuchadorRepository;

@Service
public class LuchadorServiceImpl implements LuchadorService {

    @Autowired
    private ILuchadorRepository luchadorRepository;

    @Override
    public Luchador findById(Long id) {
        Optional<Luchador> luchador = luchadorRepository.findById(id);
        if (luchador.isPresent()) {
            return luchador.get();
        } else {
            return null; 
        }
    }

    @Override
    public List<Luchador> findByNombre(String nombre) {
        List<Luchador> luchadores = luchadorRepository.findByNombre(nombre);
        if (luchadores.isEmpty()) {
            return null;
        } else {
            return luchadores;
        }
    }

    


    
}
