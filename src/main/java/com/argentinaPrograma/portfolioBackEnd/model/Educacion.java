package com.argentinaPrograma.portfolioBackEnd.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Getter @Setter
@Entity
public class Educacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String titulo;
    private String institucion;
    private Date fechaInicio;
    private Date fechaFin;
    private String mensiones;
    
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name="idPersona", nullable=false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Persona persona;

    public Educacion(Long id, String titulo, String institucion, Date fechaInicio, Date fechaFin, String mensiones, Persona persona) {
        this.id = id;
        this.titulo = titulo;
        this.institucion = institucion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.mensiones = mensiones;
        this.persona = persona;
    }

    public Educacion() {
    }
    
}
