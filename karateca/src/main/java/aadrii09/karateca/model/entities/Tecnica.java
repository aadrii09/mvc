package aadrii09.karateca.model.entities;

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
@Table(name = "tecnica")
public class Tecnica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 50, nullable = false)
    private String nombre;
    @Column(length = 50, nullable = false)
    private String nacionalidad;
    @Column(length = 50, nullable = false)
    private String arte_marcial;
    @OnDelete(action= OnDeleteAction.CASCADE)
    @JsonManagedReference
    @OneToMany(mappedBy = "tecnica", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<LuchadorTec> luchadoresTecnicas;
    
    public Tecnica() {
    }

    public Tecnica(String nombre, String nacionalidad, String arte_marcial) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.arte_marcial = arte_marcial;
    }

    public Tecnica(String nombre, String nacionalidad, String arte_marcial, List<LuchadorTec> luchadoresTecnicas) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.arte_marcial = arte_marcial;
        this.luchadoresTecnicas = luchadoresTecnicas;
    }

    public Tecnica(Long id, String nombre, String nacionalidad, String arte_marcial) {
        this.id = id;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.arte_marcial = arte_marcial;
    }

    public Tecnica(Long id, String nombre, String nacionalidad, String arte_marcial,
            List<LuchadorTec> luchadoresTecnicas) {
        this.id = id;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.arte_marcial = arte_marcial;
        this.luchadoresTecnicas = luchadoresTecnicas;
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

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getArte_marcial() {
        return arte_marcial;
    }

    public void setArte_marcial(String arte_marcial) {
        this.arte_marcial = arte_marcial;
    }

    public List<LuchadorTec> getLuchadoresTecnicas() {
        return luchadoresTecnicas;
    }

    public void setLuchadoresTecnicas(List<LuchadorTec> luchadoresTecnicas) {
        this.luchadoresTecnicas = luchadoresTecnicas;
    }

    

}
