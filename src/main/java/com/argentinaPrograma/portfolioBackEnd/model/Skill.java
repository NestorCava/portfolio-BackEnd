package com.argentinaPrograma.portfolioBackEnd.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Skill {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String skill;
    private Long porcentaje;

    public Skill() {
    }

    public Skill(Long id, String skill, Long porcentaje) {
        this.id = id;
        this.skill = skill;
        this.porcentaje = porcentaje;
    }
    
    
}
