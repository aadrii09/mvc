package aadrii09.rocketLeague.model.services.serviceImpl;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aadrii09.rocketLeague.model.entities.Jugador;
import aadrii09.rocketLeague.model.repositories.IJugador;
import aadrii09.rocketLeague.model.services.service.IJugadorService;

@Service
public class JugadorServiceImpl implements IJugadorService {
    @Autowired
    private IJugador jugadorRepo;

    @Override
    public Jugador findById(Long id) {
        Optional<Jugador> jugador = jugadorRepo.findById(id);
        if (jugador.isPresent()) {
            return jugador.get();
        } else {
            return null;
        }
    }

    @Override
    public List<Jugador> findAll() {
        return jugadorRepo.findAll();
    }

    @Override
    public Jugador saveJugador(Jugador jugador) {
        return jugadorRepo.save(jugador);
    }

    @Override
    public void deleteJugador(Long id) {
        jugadorRepo.deleteById(id);
    }

    @Override
    public Jugador updateJugador(Jugador jugador) {
        return jugadorRepo.save(jugador);
    }

    @Override
    public Jugador findByNombre(String nombre) {
        return jugadorRepo.findByNombre(nombre);
    }

   

  
    
    
}
