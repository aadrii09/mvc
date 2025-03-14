package aadrii09.biblioteca.model.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import aadrii09.biblioteca.model.entities.ENUMS.Estado;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "prestamos")
public class Prestamo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @JsonBackReference
    @ManyToOne(fetch = FetchType.EAGER, targetEntity = Libro.class)
    @JoinColumn(nullable = false, name = "libro_id")
    private Libro libroId;
    @JsonBackReference
    @ManyToOne(fetch = FetchType.EAGER, targetEntity = Usuario.class)
    @JoinColumn(nullable = false, name = "usuario_id")
    private Usuario usuarioId;
    @Column(nullable = false)
    private String fecha_prestamo;
    @Column(nullable = true)
    private String fecha_devolucion;
    @Enumerated(EnumType.STRING)
    @Column(length = 50, nullable = false, columnDefinition = "ENUM('ACTIVO', 'DEVUELTO')")
    private Estado estado;
    
    public Prestamo() {
    }

    public Prestamo(Libro libroId, Usuario usuarioId, String fecha_prestamo, String fecha_devolucion, Estado estado) {
        this.libroId = libroId;
        this.usuarioId = usuarioId;
        this.fecha_prestamo = fecha_prestamo;
        this.fecha_devolucion = fecha_devolucion;
        this.estado = estado;
    }

    public Prestamo(Long id, Libro libroId, Usuario usuarioId, String fecha_prestamo, String fecha_devolucion,
            Estado estado) {
        this.id = id;
        this.libroId = libroId;
        this.usuarioId = usuarioId;
        this.fecha_prestamo = fecha_prestamo;
        this.fecha_devolucion = fecha_devolucion;
        this.estado = estado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Libro getLibroId() {
        return libroId;
    }

    public void setLibroId(Libro libroId) {
        this.libroId = libroId;
    }

    public Usuario getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Usuario usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getfecha_prestamo() {
        return fecha_prestamo;
    }

    public void setfecha_prestamo(String fecha_prestamo) {
        this.fecha_prestamo = fecha_prestamo;
    }

    public String getfecha_devolucion() {
        return fecha_devolucion;
    }

    public void setfecha_devolucion(String fecha_devolucion) {
        this.fecha_devolucion = fecha_devolucion;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    } 
    
    
    
}
