package aadrii09.rocketLeague.model.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import aadrii09.rocketLeague.model.entities.Enum.Rango;
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
@Table(name = "jugadores")
public class Jugador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;    
    @Column(nullable = false, length = 50)
    private String nombre;
    @Column(nullable = false, length = 50)
    private Integer nivel;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false, columnDefinition = "ENUM('BRONCE', 'PLATA', 'ORO', 'PLATINO', 'DIAMANTE', 'CAMPEON', 'GRAN_CAMPEON', 'SSL')")
    private Rango rango;
    @JsonManagedReference
    @OneToMany(mappedBy="jugadorId", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    List<Participacion> participaciones;

    public Jugador() {
    }
    public Jugador(Long id, String nombre, Integer nivel, Rango rango) {
        this.id = id;
        this.nombre = nombre;
        this.nivel = nivel;
        this.rango = rango;
    }
    public Jugador(String nombre, Integer nivel, Rango rango, List<Participacion> participaciones) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.rango = rango;
        this.participaciones = participaciones;
    }
    public Jugador(String nombre, Integer nivel, Rango rango) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.rango = rango;
    }
    public Jugador(Long id, String nombre, Integer nivel, Rango rango, List<Participacion> participaciones) {
        this.id = id;
        this.nombre = nombre;
        this.nivel = nivel;
        this.rango = rango;
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
    public Integer getNivel() {
        return nivel;
    }
    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }
    public Rango getRango() {
        return rango;
    }
    public void setRango(Rango rango) {
        this.rango = rango;
    }
    public List<Participacion> getParticipaciones() {
        return participaciones;
    }
    public void setParticipaciones(List<Participacion> participaciones) {
        this.participaciones = participaciones;
    }
    
}
