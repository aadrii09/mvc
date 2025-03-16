package aadrii09.rocketLeague.model.entities;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

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
@Table(name = "torneos")
public class Torneo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 50)
    private String nombre;
    @Column(nullable = false)
    private LocalDate fechaInicio;
    @Column(nullable = false, length = 50)
    private Integer premioTotal;
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonManagedReference
    @OneToMany(mappedBy="torneoId", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    List<Participacion> participaciones;

    public Torneo() {
    }

    public Torneo(String nombre, LocalDate fechaInicio, Integer premioTotal, List<Participacion> participaciones) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.premioTotal = premioTotal;
        this.participaciones = participaciones;
    }

    public Torneo(Long id, String nombre, LocalDate fechaInicio, Integer premioTotal) {
        this.id = id;
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.premioTotal = premioTotal;
    }

    public Torneo(String nombre, LocalDate fechaInicio, Integer premioTotal) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.premioTotal = premioTotal;
    }

    public Torneo(Long id, String nombre, LocalDate fechaInicio, Integer premioTotal,
            List<Participacion> participaciones) {
        this.id = id;
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.premioTotal = premioTotal;
        this.participaciones = participaciones;
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

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Integer getPremioTotal() {
        return premioTotal;
    }

    public void setPremioTotal(Integer premioTotal) {
        this.premioTotal = premioTotal;
    }

    public List<Participacion> getParticipaciones() {
        return participaciones;
    }

    public void setParticipaciones(List<Participacion> participaciones) {
        this.participaciones = participaciones;
    }
    
    
}
