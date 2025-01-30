package Entities;


import java.util.List;

import Entities.ENUMS.Tipo;
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
@Table(name="asignaturas")
public class Asignatura {
      @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length=55, nullable=false)
    private String nombre;
    @Column(length=55, nullable=false)
    private Integer creditos;
    @Column(length=55, nullable=false)
    private Integer horas;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false, columnDefinition = "ENUM('OBLIGATORIA','OPCIONAL')")
    private Tipo tipo;
    
    
    @OneToMany(mappedBy = "asignatura", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<AlumnoAsignatura> listaAlumnoasignaturas;


    public Asignatura() {
    }


    public Asignatura(String nombre, Integer creditos, Integer horas, Tipo tipo) {
      this.nombre = nombre;
      this.creditos = creditos;
      this.horas = horas;
      this.tipo = tipo;
    }


    public Asignatura(String nombre, Integer creditos, Integer horas, Tipo tipo,
        List<AlumnoAsignatura> listaAlumnoasignaturas) {
      this.nombre = nombre;
      this.creditos = creditos;
      this.horas = horas;
      this.tipo = tipo;
      this.listaAlumnoasignaturas = listaAlumnoasignaturas;
    }


    public Asignatura(Integer id, String nombre, Integer creditos, Integer horas, Tipo tipo) {
      this.id = id;
      this.nombre = nombre;
      this.creditos = creditos;
      this.horas = horas;
      this.tipo = tipo;
    }


    public Asignatura(Integer id, String nombre, Integer creditos, Integer horas, Tipo tipo,
        List<AlumnoAsignatura> listaAlumnoasignaturas) {
      this.id = id;
      this.nombre = nombre;
      this.creditos = creditos;
      this.horas = horas;
      this.tipo = tipo;
      this.listaAlumnoasignaturas = listaAlumnoasignaturas;
    }


    public Integer getId() {
      return id;
    }


    public void setId(Integer id) {
      this.id = id;
    }


    public String getNombre() {
      return nombre;
    }


    public void setNombre(String nombre) {
      this.nombre = nombre;
    }


    public Integer getCreditos() {
      return creditos;
    }


    public void setCreditos(Integer creditos) {
      this.creditos = creditos;
    }


    public Integer getHoras() {
      return horas;
    }


    public void setHoras(Integer horas) {
      this.horas = horas;
    }


    public Tipo getTipo() {
      return tipo;
    }


    public void setTipo(Tipo tipo) {
      this.tipo = tipo;
    }


    public List<AlumnoAsignatura> getListaAlumnoasignaturas() {
      return listaAlumnoasignaturas;
    }


    public void setListaAlumnoasignaturas(List<AlumnoAsignatura> listaAlumnoasignaturas) {
      this.listaAlumnoasignaturas = listaAlumnoasignaturas;
    }


    


    
    


    
    }
