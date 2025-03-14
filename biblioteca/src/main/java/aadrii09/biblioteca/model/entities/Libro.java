package aadrii09.biblioteca.model.entities;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import aadrii09.biblioteca.model.entities.ENUMS.Genero;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "libros")
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 100, nullable = false)
    private String titulo;
    @Column(length = 100, nullable = false)
    private String autor;
    @Column(nullable = false)
    private LocalDate fecha_publicacion;
    @Enumerated(EnumType.STRING)
    @Column(length = 50, nullable = false, columnDefinition = "ENUM('FICCIÓN', 'CIENCIA_FICCIÓN', 'FANTASÍA', 'HISTORIA', 'MISTERIO')")
    private Genero genero;
    @JsonManagedReference
    @OneToMany(mappedBy = "libroId", cascade=CascadeType.ALL, fetch = FetchType.EAGER)
    List<Prestamo> prestamos;

    public Libro() {
    }

    public Libro(String titulo, String autor, LocalDate fecha_publicacion, Genero genero, List<Prestamo> prestamos) {
        this.titulo = titulo;
        this.autor = autor;
        this.fecha_publicacion = fecha_publicacion;
        this.genero = genero;
        this.prestamos = prestamos;
    }

    public Libro(Long id, String titulo, String autor, LocalDate fecha_publicacion, Genero genero) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.fecha_publicacion = fecha_publicacion;
        this.genero = genero;
    }

    public Libro(String titulo, String autor, LocalDate fecha_publicacion, Genero genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.fecha_publicacion = fecha_publicacion;
        this.genero = genero;
    }

    public Libro(Long id, String titulo, String autor, LocalDate fecha_publicacion, Genero genero,
            List<Prestamo> prestamos) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.fecha_publicacion = fecha_publicacion;
        this.genero = genero;
        this.prestamos = prestamos;
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

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public LocalDate getFecha_publicacion() {
        return fecha_publicacion;
    }

    public void setFecha_publicacion(LocalDate fecha_publicacion) {
        this.fecha_publicacion = fecha_publicacion;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public List<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(List<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }
    
    
}
