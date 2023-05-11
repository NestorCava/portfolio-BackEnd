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
public class Experiencia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String empresa;
    private String cargo;
    private Date fecha_inicio;
    private Date fecha_fin;
    private String descripcion;

    public Experiencia() {
    }

    public Experiencia(Long id, String empresa, String cargo, Date fecha_inicio, Date fecha_fin, String descripcion) {
        this.id = id;
        this.empresa = empresa;
        this.cargo = cargo;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.descripcion = descripcion;
    }
}
