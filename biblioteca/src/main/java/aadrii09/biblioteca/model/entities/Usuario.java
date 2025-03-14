package aadrii09.biblioteca.model.entities;

import java.time.LocalDate;
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
@Table(name = "usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 100, nullable = false)
    private String nombre;
    @Column(length = 100, nullable = false)
    private String correo;
    @Column(nullable = false)
    private LocalDate fecha_registro;
    @JsonManagedReference
    @OneToMany(mappedBy = "usuarioId", cascade=CascadeType.ALL, fetch = FetchType.EAGER)
    List<Prestamo> prestamos;
    
    public Usuario() {
    }
    
    public Usuario(String nombre, String correo, LocalDate fecha_registro, List<Prestamo> prestamos) {
        this.nombre = nombre;
        this.correo = correo;
        this.fecha_registro = fecha_registro;
        this.prestamos = prestamos;
    }
    
    public Usuario(Long id, String nombre, String correo, LocalDate fecha_registro) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.fecha_registro = fecha_registro;
    }
    
    public Usuario(String nombre, String correo, LocalDate fecha_registro) {
        this.nombre = nombre;
        this.correo = correo;
        this.fecha_registro = fecha_registro;
    }
    
    public Usuario(Long id, String nombre, String correo, LocalDate fecha_registro, List<Prestamo> prestamos) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.fecha_registro = fecha_registro;
        this.prestamos = prestamos;
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
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public LocalDate getFecha_registro() {
        return fecha_registro;
    }
    public void setFecha_registro(LocalDate fecha_registro) {
        this.fecha_registro = fecha_registro;
    }
    public List<Prestamo> getPrestamos() {
        return prestamos;
    }
    public void setPrestamos(List<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }
}