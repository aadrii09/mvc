package Colegio.model.Entities;

import java.time.LocalDate;

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
@Table(name = "matriculas")
public class Matricula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @JsonBackReference
    @ManyToOne(fetch = FetchType.EAGER, targetEntity = Alumno.class)
    @JoinColumn(nullable = false, name = "idAlumno")
    private Alumno idAlumno;
    @JsonBackReference
    @ManyToOne(fetch = FetchType.EAGER, targetEntity = Asignatura.class)
    @JoinColumn(nullable = false, name = "idAsignatura")
    private Asignatura idAsignatura;
    @Column(nullable = false)
    private LocalDate curso;
    @Column(length = 6, nullable = false)
    private double nota;
    
    public Matricula() {
    }

    public Matricula(Alumno idAlumno, Asignatura idAsignatura, LocalDate curso, double nota) {
        this.idAlumno = idAlumno;
        this.idAsignatura = idAsignatura;
        this.curso = curso;
        this.nota = nota;
    }

    public Matricula(Long id, Alumno idAlumno, Asignatura idAsignatura, LocalDate curso) {
        this.id = id;
        this.idAlumno = idAlumno;
        this.idAsignatura = idAsignatura;
        this.curso = curso;
    }

    public Matricula(Alumno idAlumno, Asignatura idAsignatura, LocalDate curso) {
        this.idAlumno = idAlumno;
        this.idAsignatura = idAsignatura;
        this.curso = curso;
    }

    public Matricula(Long id, Alumno idAlumno, Asignatura idAsignatura, LocalDate curso, double nota) {
        this.id = id;
        this.idAlumno = idAlumno;
        this.idAsignatura = idAsignatura;
        this.curso = curso;
        this.nota = nota;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Alumno getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(Alumno idAlumno) {
        this.idAlumno = idAlumno;
    }

    public Asignatura getIdAsignatura() {
        return idAsignatura;
    }

    public void setIdAsignatura(Asignatura idAsignatura) {
        this.idAsignatura = idAsignatura;
    }

    public LocalDate getCurso() {
        return curso;
    }

    public void setCurso(LocalDate curso) {
        this.curso = curso;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}
