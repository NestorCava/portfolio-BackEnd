package com.argentinaPrograma.portfolioBackEnd.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

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

    public Educacion() {
    }

    public Educacion(Long id, 
                     String titulo, 
                     String institucion, 
                     Date fechaInicio, 
                     Date fechaFin, 
                     String mensiones) {
        this.id = id;
        this.titulo = titulo;
        this.institucion = institucion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.mensiones = mensiones;
    }
    
    
}
