package aadrii09.biblioteca.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import aadrii09.biblioteca.model.entities.Prestamo;

public interface IPrestamoRepository extends JpaRepository  <Prestamo, Long> {
 


}
