package aadrii09.rocketLeague.model.services.service;

import java.util.List;

import aadrii09.rocketLeague.model.entities.Jugador;

public interface IJugadorService  {

    public Jugador findById(Long id);
    List<Jugador> findAll();
}
