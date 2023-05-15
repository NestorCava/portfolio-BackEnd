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
public class Experiencia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String empresa;
    private String cargo;
    private Date fechaInicio;
    private Date fechaFin;
    private String descripcion;
    
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name="idPersona", nullable=false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Persona persona;

    public Experiencia() {
    }

    public Experiencia(Long id, String empresa, String cargo, Date fechaInicio, Date fechaFin, String descripcion, Persona persona) {
        this.id = id;
        this.empresa = empresa;
        this.cargo = cargo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.descripcion = descripcion;
        this.persona = persona;
    }

}
