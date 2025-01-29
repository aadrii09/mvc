package Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import Entities.Ordenador;

public interface IOrdenador extends JpaRepository <Ordenador, Integer> {
    
}
