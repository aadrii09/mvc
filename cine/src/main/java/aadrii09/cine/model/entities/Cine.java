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
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="cines")
public class Cine {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @Column(length=15, nullable=false)
    private String nombre;
    @Column(length = 15, nullable = false)
    private Integer aforo;
    @JsonIgnoreProperties("cine")
    @OneToOne
    @JoinColumn(
        name="id_centroComercial", unique=true, nullable=false, updatable=false)
    private CentroComercial centroComercial;

    @JsonIgnoreProperties("cine")
    @OneToMany(mappedBy = "cine", cascade= CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Funcion> funciones;

    public Cine() {
    }

    public Cine(String nombre, Integer aforo, CentroComercial centroComercial, List<Funcion> funciones) {
        this.nombre = nombre;
        this.aforo = aforo;
        this.centroComercial = centroComercial;
        this.funciones = funciones;
    }

    public Cine(Long id, String nombre, Integer aforo, CentroComercial centroComercial) {
        this.id = id;
        this.nombre = nombre;
        this.aforo = aforo;
        this.centroComercial = centroComercial;
    }

    public Cine(String nombre, Integer aforo, CentroComercial centroComercial) {
        this.nombre = nombre;
        this.aforo = aforo;
        this.centroComercial = centroComercial;
    }

    public Cine(Long id, String nombre, Integer aforo, CentroComercial centroComercial, List<Funcion> funciones) {
        this.id = id;
        this.nombre = nombre;
        this.aforo = aforo;
        this.centroComercial = centroComercial;
        this.funciones = funciones;
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

    public Integer getAforo() {
        return aforo;
    }

    public void setAforo(Integer aforo) {
        this.aforo = aforo;
    }

    public CentroComercial getCentroComercial() {
        return centroComercial;
    }

    public void setCentroComercial(CentroComercial centroComercial) {
        this.centroComercial = centroComercial;
    }

    public List<Funcion> getFunciones() {
        return funciones;
    }

    public void setFunciones(List<Funcion> funciones) {
        this.funciones = funciones;
    }
    
    
}
