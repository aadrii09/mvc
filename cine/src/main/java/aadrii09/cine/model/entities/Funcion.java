package aadrii09.cine.model.entities;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="funciones")
public class Funcion {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @JsonIgnoreProperties("funciones")
    @ManyToOne(fetch=FetchType.EAGER, targetEntity=Cine.class)
    @JoinColumn(nullable = false, name = "id_cine")
    private Cine cine;
    @JsonIgnoreProperties("funciones")
    @ManyToOne(fetch=FetchType.EAGER, targetEntity=Pelicula.class)
    @JoinColumn(nullable = false, name = "id_pelicula")
    private Pelicula pelicula;
    @Column(nullable = false)
    private LocalDate fecha;
    
    public Funcion() {
    }

    public Funcion(Cine cine, Pelicula pelicula, LocalDate fecha) {
        this.cine = cine;
        this.pelicula = pelicula;
        this.fecha = fecha;
    }

    public Funcion(Long id, Cine cine, Pelicula pelicula) {
        this.id = id;
        this.cine = cine;
        this.pelicula = pelicula;
    }

    public Funcion(Cine cine, Pelicula pelicula) {
        this.cine = cine;
        this.pelicula = pelicula;
    }

    public Funcion(Long id, Cine cine, Pelicula pelicula, LocalDate fecha) {
        this.id = id;
        this.cine = cine;
        this.pelicula = pelicula;
        this.fecha = fecha;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cine getCine() {
        return cine;
    }

    public void setCine(Cine cine) {
        this.cine = cine;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    
    
}
