package com.argentinaPrograma.portfolioBackEnd.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class TipoRedSocial {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String nombre;

    public TipoRedSocial() {
    }

    public TipoRedSocial(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    
    
}
