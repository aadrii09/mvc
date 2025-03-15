package aadrii09.rocketLeague.model.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import aadrii09.rocketLeague.model.entities.Jugador;

public interface IJugador extends JpaRepository<Jugador, Long> {
    
   public Jugador findByNombre(String nombre);
    
}
