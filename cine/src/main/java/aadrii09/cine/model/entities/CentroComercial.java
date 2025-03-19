package aadrii09.cine.model.entities;

import jakarta.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
@Table(name="centrosComerciales")
public class CentroComercial {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @Column(length=150, nullable=false)
    private String nombre;
    @Column(length=150, nullable=false)
    private String localidad;
    @Column(nullable=false)
    private Boolean estado;
    @JsonIgnoreProperties("centroComercial")
    @OneToOne(mappedBy="centroComercial")
    private Cine cine;
    
    public CentroComercial() {
    }

    public CentroComercial(String nombre, String localidad, Boolean estado, Cine cine) {
        this.nombre = nombre;
        this.localidad = localidad;
        this.estado = estado;
        this.cine = cine;
    }

    public CentroComercial(Long id, String nombre, String localidad, Boolean estado) {
        this.id = id;
        this.nombre = nombre;
        this.localidad = localidad;
        this.estado = estado;
    }

    public CentroComercial(String nombre, String localidad, Boolean estado) {
        this.nombre = nombre;
        this.localidad = localidad;
        this.estado = estado;
    }

    public CentroComercial(Long id, String nombre, String localidad, Boolean estado, Cine cine) {
        this.id = id;
        this.nombre = nombre;
        this.localidad = localidad;
        this.estado = estado;
        this.cine = cine;
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

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Cine getCine() {
        return cine;
    }

    public void setCine(Cine cine) {
        this.cine = cine;
    }

    
    
}
