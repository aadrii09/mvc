package Colegio.model.Entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "asignaturas")
public class Asignatura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 155, nullable = false)
    private String nombre;
    @JsonManagedReference
    @OneToMany(mappedBy = "idAsignatura", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    List<Matricula> matriculas;
    
    public Asignatura() {
    }

    public Asignatura(String nombre, List<Matricula> matriculas) {
        this.nombre = nombre;
        this.matriculas = matriculas;
    }

    public Asignatura(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Asignatura(Long id, String nombre, List<Matricula> matriculas) {
        this.id = id;
        this.nombre = nombre;
        this.matriculas = matriculas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Matricula> getMatriculas() {
        return matriculas;
    }

    public void setMatriculas(List<Matricula> matriculas) {
        this.matriculas = matriculas;
    }
  


    
}
