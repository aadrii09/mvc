package aadrii09.cine.model.services.service;

import java.util.List;

import aadrii09.cine.model.entities.Pelicula;

public interface PeliculaService {

List<Pelicula> findAll();
List<Pelicula> findByDuracionBetween(Integer min, Integer max);
Integer findByGeneroOrGenero(String genero, String genero2);
public Pelicula findById();


}
