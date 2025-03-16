package aadrii09.rocketLeague.model.entities;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonBackReference;

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
@Table(name = "participaciones")
public class Participacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonBackReference
    @ManyToOne(fetch = FetchType.EAGER, targetEntity = Jugador.class)
    @JoinColumn(nullable = false, name = "jugadorId")
    private Jugador jugadorId;
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonBackReference
    @ManyToOne(fetch = FetchType.EAGER, targetEntity = Torneo.class)
    @JoinColumn(nullable = false, name = "torneoId")
    private Torneo torneoId;
    @Column(nullable = false, length = 50)
    private Integer posicionFinal;

    public Participacion() {
    }

    public Participacion(Jugador jugadorId, Torneo torneoId, Integer posicionFinal) {
        this.jugadorId = jugadorId;
        this.torneoId = torneoId;
        this.posicionFinal = posicionFinal;
    }

    public Participacion(Long id, Jugador jugadorId, Torneo torneoId, Integer posicionFinal) {
        this.id = id;
        this.jugadorId = jugadorId;
        this.torneoId = torneoId;
        this.posicionFinal = posicionFinal;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Jugador getJugadorId() {
        return jugadorId;
    }

    public void setJugadorId(Jugador jugadorId) {
        this.jugadorId = jugadorId;
    }

    public Torneo getTorneoId() {
        return torneoId;
    }

    public void setTorneoId(Torneo torneoId) {
        this.torneoId = torneoId;
    }

    public Integer getPosicionFinal() {
        return posicionFinal;
    }

    public void setPosicionFinal(Integer posicionFinal) {
        this.posicionFinal = posicionFinal;
    }

    
    
}
