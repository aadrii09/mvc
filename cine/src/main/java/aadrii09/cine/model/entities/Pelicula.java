package aadrii09.cine.model.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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
@Table(name="peliculas")
public class Pelicula {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 150)
    private String titulo;
    @Column(nullable = false, length = 150)
    private String genero;
    @Column(nullable = false, length = 150)
    private String director;
    @Column(nullable = false, length = 150)
    private Integer duracion;
    @JsonIgnoreProperties("pelicula")
    @OneToMany(mappedBy = "pelicula", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Funcion> funciones;

    public Pelicula() {
    }

    public Pelicula(String titulo, String genero, String director, Integer duracion, List<Funcion> funciones) {
        this.titulo = titulo;
        this.genero = genero;
        this.director = director;
        this.duracion = duracion;
        this.funciones = funciones;
    }

    public Pelicula(Long id, String titulo, String genero, String director, Integer duracion) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.director = director;
        this.duracion = duracion;
    }

    public Pelicula(String titulo, String genero, String director, Integer duracion) {
        this.titulo = titulo;
        this.genero = genero;
        this.director = director;
        this.duracion = duracion;
    }

    public Pelicula(Long id, String titulo, String genero, String director, Integer duracion, List<Funcion> funciones) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.director = director;
        this.duracion = duracion;
        this.funciones = funciones;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public List<Funcion> getFunciones() {
        return funciones;
    }

    public void setFunciones(List<Funcion> funciones) {
        this.funciones = funciones;
    }

    
}
