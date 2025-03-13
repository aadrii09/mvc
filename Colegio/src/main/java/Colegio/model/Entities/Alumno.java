package Colegio.model.Entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
@Table(name = "alumnos")
public class Alumno {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Long id;
    @Column(length = 155, nullable = false)
    private String nombre;
    @Column(length = 155, nullable = false)
    private String apellidos;
    @Column(nullable = false)
    private int edad;
    @JsonManagedReference
    @OneToMany(mappedBy = "idAlumno", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    List<Matricula> matriculas;
    public Alumno() {
    }
    public Alumno(String nombre, String apellidos, int edad, List<Matricula> matriculas) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.matriculas = matriculas;
    }
    public Alumno(Long id, String nombre, String apellidos, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }
    public Alumno(Long id, String nombre, String apellidos, int edad, List<Matricula> matriculas) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
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
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public List<Matricula> getMatriculas() {
        return matriculas;
    }
    public void setMatriculas(List<Matricula> matriculas) {
        this.matriculas = matriculas;
    }
}
