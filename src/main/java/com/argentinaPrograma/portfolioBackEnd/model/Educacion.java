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
    private Date fecha_inicio;
    private Date fecha_fin;
    private String mensiones;

    public Educacion() {
    }

    public Educacion(Long id, String titulo, String institucion, Date fecha_inicio, Date fecha_fin, String mensiones) {
        this.id = id;
        this.titulo = titulo;
        this.institucion = institucion;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.mensiones = mensiones;
    }
    
    
}
