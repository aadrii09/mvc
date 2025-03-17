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
@Table(name = "luchador")
public class Luchador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 50, nullable = false)
    private String nombre;
    @Column(length = 50, nullable = false)
    private Integer edad;
    @Column(length = 50, nullable = false)
    private Double peso;
    @Column(length = 50, nullable = false)
    private String pais;
    @OnDelete(action= OnDeleteAction.CASCADE)
    @JsonManagedReference
    @OneToMany(mappedBy = "luchador", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<LuchadorTec> luchadoresTecnicas;

    public Luchador() {
    }

    public Luchador(String nombre, Integer edad, Double peso, String pais) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.pais = pais;
    }

    public Luchador(String nombre, Integer edad, Double peso, String pais, List<LuchadorTec> luchadoresTecnicas) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.pais = pais;
        this.luchadoresTecnicas = luchadoresTecnicas;
    }

    public Luchador(Long id, String nombre, Integer edad, Double peso, String pais) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.pais = pais;
    }

    public Luchador(Long id, String nombre, Integer edad, Double peso, String pais,
            List<LuchadorTec> luchadoresTecnicas) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.pais = pais;
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

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public List<LuchadorTec> getLuchadoresTecnicas() {
        return luchadoresTecnicas;
    }

    public void setLuchadoresTecnicas(List<LuchadorTec> luchadoresTecnicas) {
        this.luchadoresTecnicas = luchadoresTecnicas;
    }
    
    
}
