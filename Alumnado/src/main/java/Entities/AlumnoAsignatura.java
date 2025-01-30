package Entities;


import java.time.LocalDate;

import jakarta.persistence.*;


@Entity
@Table(name = "alumnoasignatura")
public class AlumnoAsignatura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "alumno_id") 
    private Alumno alumno;

    @ManyToOne
    @JoinColumn(name = "asignatura_id") 
    private Asignatura asignatura;
    @Column(nullable=false )
    private LocalDate fechaExamen;
    @Column(length=4, nullable=false)
    private Double nota;



    public AlumnoAsignatura(Integer id, Alumno alumno, Asignatura asignatura, LocalDate fechaExamen, Double nota) {
        this.id = id;
        this.alumno = alumno;
        this.asignatura = asignatura;
        this.fechaExamen = fechaExamen;
        this.nota = nota;
    }


    public AlumnoAsignatura(Alumno alumno, Asignatura asignatura, LocalDate fechaExamen, Double nota) {
        this.alumno = alumno;
        this.asignatura = asignatura;
        this.fechaExamen = fechaExamen;
        this.nota = nota;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public LocalDate getFechaExamen() {
        return fechaExamen;
    }

    public void setFechaExamen(LocalDate fechaExamen) {
        this.fechaExamen = fechaExamen;
    }


}