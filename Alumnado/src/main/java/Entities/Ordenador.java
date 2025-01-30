package Entities;

import java.time.LocalDate;

import Entities.ENUMS.Procesador;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="ordenadores")
public class Ordenador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length=55, nullable=false)
    private String marca;
    @Column(nullable=false )
    private LocalDate fechaSalida;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false, columnDefinition = "ENUM('INTEL','AMD')")
    private Procesador procesador;
    @OneToOne(mappedBy = "ordenador")
    private Alumno alumno;
    
    public Ordenador() {
    }

    public Ordenador(String marca, LocalDate fechaSalida, Procesador procesador, Alumno alumno) {
        this.marca = marca;
        this.fechaSalida = fechaSalida;
        this.procesador = procesador;
        this.alumno = alumno;
    }

    public Ordenador(Integer id, String marca, LocalDate fechaSalida, Procesador procesador) {
        this.id = id;
        this.marca = marca;
        this.fechaSalida = fechaSalida;
        this.procesador = procesador;
    }

    public Ordenador(String marca, LocalDate fechaSalida, Procesador procesador) {
        this.marca = marca;
        this.fechaSalida = fechaSalida;
        this.procesador = procesador;
    }

    public Ordenador(Integer id, String marca, LocalDate fechaSalida, Procesador procesador, Alumno alumno) {
        this.id = id;
        this.marca = marca;
        this.fechaSalida = fechaSalida;
        this.procesador = procesador;
        this.alumno = alumno;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Procesador getProcesador() {
        return procesador;
    }

    public void setProcesador(Procesador procesador) {
        this.procesador = procesador;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    

}

