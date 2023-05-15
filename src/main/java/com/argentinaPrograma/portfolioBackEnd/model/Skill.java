package com.argentinaPrograma.portfolioBackEnd.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Getter @Setter
@Entity
public class Skill {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String skill;
    private Long porcentaje;
    
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name="idPersona", nullable=false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Persona persona;

    public Skill() {
    }

    public Skill(Long id, String skill, Long porcentaje, Persona persona) {
        this.id = id;
        this.skill = skill;
        this.porcentaje = porcentaje;
        this.persona = persona;
    }

   
    
    
}
