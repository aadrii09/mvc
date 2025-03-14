package aadrii09.biblioteca.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import aadrii09.biblioteca.model.entities.Usuario;

public interface IUsuarioRepositoy extends JpaRepository<Usuario, Long> {
  
    
}
