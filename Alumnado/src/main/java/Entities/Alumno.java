package Entities;


import java.time.LocalDate;
import java.util.List;

import Entities.ENUMS.Curso;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="alumnos")
public class Alumno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length=55, nullable=false)
    private String nombre;
    @Column(length=55, nullable=false)
    private String apellido;
    @Column(nullable=false )
    private LocalDate fechaCumpl;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false, columnDefinition = "ENUM('PRIMERO','SEGUNDO','TERCERO','CUARTO')")
    private Curso curso;
    @OneToOne
    @JoinColumn(name="ordenador_id",referencedColumnName = "id")
    private Ordenador ordenador;
    
    @OneToMany(mappedBy = "alumno", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<AlumnoAsignatura> listaAlumnoasignaturas;

    public Alumno() {
    }

    public Alumno(String nombre, String apellido, LocalDate fechaCumpl, Curso curso, Ordenador ordenador) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaCumpl = fechaCumpl;
        this.curso = curso;
        this.ordenador = ordenador;
    }

    public Alumno(String nombre, String apellido, LocalDate fechaCumpl, Curso curso, Ordenador ordenador,
            List<AlumnoAsignatura> listaAlumnoasignaturas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaCumpl = fechaCumpl;
        this.curso = curso;
        this.ordenador = ordenador;
        this.listaAlumnoasignaturas = listaAlumnoasignaturas;
    }

    public Alumno(Integer id, String nombre, String apellido, LocalDate fechaCumpl, Curso curso, Ordenador ordenador) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaCumpl = fechaCumpl;
        this.curso = curso;
        this.ordenador = ordenador;
    }

    public Alumno(Integer id, String nombre, String apellido, LocalDate fechaCumpl, Curso curso, Ordenador ordenador,
            List<AlumnoAsignatura> listaAlumnoasignaturas) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaCumpl = fechaCumpl;
        this.curso = curso;
        this.ordenador = ordenador;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaCumpl() {
        return fechaCumpl;
    }

    public void setFechaCumpl(LocalDate fechaCumpl) {
        this.fechaCumpl = fechaCumpl;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Ordenador getOrdenador() {
        return ordenador;
    }

    public void setOrdenador(Ordenador ordenador) {
        this.ordenador = ordenador;
    }

    public List<AlumnoAsignatura> getListaAlumnoasignaturas() {
        return listaAlumnoasignaturas;
    }

    public void setListaAlumnoasignaturas(List<AlumnoAsignatura> listaAlumnoasignaturas) {
        this.listaAlumnoasignaturas = listaAlumnoasignaturas;
    }


    
    

}
