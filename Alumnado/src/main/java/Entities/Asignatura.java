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
    private int id;
    @Column(length=55, nullable=false)
    private String nombre;
    @Column(length=55, nullable=false)
    private int creditos;
    @Column(length=55, nullable=false)
    private int horas;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false, columnDefinition = "ENUM('OBLIGATORIA','OPCIONAL')")
    private Tipo tipo;
    
    
    @OneToMany(mappedBy = "asignatura", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Alumnoasignatura> lAlumnoasignaturas;


    public Asignatura() {
    }


    public Asignatura(String nombre, int creditos, int horas, Tipo tipo) {
      this.nombre = nombre;
      this.creditos = creditos;
      this.horas = horas;
      this.tipo = tipo;
    }


    public Asignatura(String nombre, int creditos, int horas, Tipo tipo, List<Alumnoasignatura> lAlumnoasignaturas) {
      this.nombre = nombre;
      this.creditos = creditos;
      this.horas = horas;
      this.tipo = tipo;
      this.lAlumnoasignaturas = lAlumnoasignaturas;
    }


    public Asignatura(int id, String nombre, int creditos, int horas, Tipo tipo) {
      this.id = id;
      this.nombre = nombre;
      this.creditos = creditos;
      this.horas = horas;
      this.tipo = tipo;
    }


    public Asignatura(int id, String nombre, int creditos, int horas, Tipo tipo,
        List<Alumnoasignatura> lAlumnoasignaturas) {
      this.id = id;
      this.nombre = nombre;
      this.creditos = creditos;
      this.horas = horas;
      this.tipo = tipo;
      this.lAlumnoasignaturas = lAlumnoasignaturas;
    }


    public int getId() {
      return id;
    }


    public void setId(int id) {
      this.id = id;
    }


    public String getNombre() {
      return nombre;
    }


    public void setNombre(String nombre) {
      this.nombre = nombre;
    }


    public int getCreditos() {
      return creditos;
    }


    public void setCreditos(int creditos) {
      this.creditos = creditos;
    }


    public int getHoras() {
      return horas;
    }


    public void setHoras(int horas) {
      this.horas = horas;
    }


    public Tipo getTipo() {
      return tipo;
    }


    public void setTipo(Tipo tipo) {
      this.tipo = tipo;
    }


    public List<Alumnoasignatura> getlAlumnoasignaturas() {
      return lAlumnoasignaturas;
    }


    public void setlAlumnoasignaturas(List<Alumnoasignatura> lAlumnoasignaturas) {
      this.lAlumnoasignaturas = lAlumnoasignaturas;
    }


    
    


    
    }
