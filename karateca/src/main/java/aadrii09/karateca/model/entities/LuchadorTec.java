package aadrii09.karateca.model.entities;


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
@Table(name = "luchadores_tecnicas")
public class LuchadorTec {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OnDelete(action= OnDeleteAction.CASCADE)
    @JsonBackReference
    @ManyToOne(fetch = FetchType.EAGER, targetEntity = Luchador.class)
    @JoinColumn(name = "luchador_id", nullable = false)
    private Luchador luchador;
    @OnDelete(action= OnDeleteAction.CASCADE)
    @JsonBackReference
    @ManyToOne(fetch = FetchType.EAGER, targetEntity = Tecnica.class)
    @JoinColumn(name = "tecnica_id", nullable = false)
    private Tecnica tecnica;
    @Column(length = 50, nullable = false)
    private Integer nivel_dominio;

    public LuchadorTec() {
    }

    public LuchadorTec(Luchador luchador, Tecnica tecnica, Integer nivel_dominio) {
        this.luchador = luchador;
        this.tecnica = tecnica;
        this.nivel_dominio = nivel_dominio;
    }

    public LuchadorTec(Long id, Luchador luchador, Tecnica tecnica, Integer nivel_dominio) {
        this.id = id;
        this.luchador = luchador;
        this.tecnica = tecnica;
        this.nivel_dominio = nivel_dominio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Luchador getLuchador() {
        return luchador;
    }

    public void setLuchador(Luchador luchador) {
        this.luchador = luchador;
    }

    public Tecnica getTecnica() {
        return tecnica;
    }

    public void setTecnica(Tecnica tecnica) {
        this.tecnica = tecnica;
    }

    public Integer getNivel_dominio() {
        return nivel_dominio;
    }

    public void setNivel_dominio(Integer nivel_dominio) {
        this.nivel_dominio = nivel_dominio;
    }
    
    
    
    
}
