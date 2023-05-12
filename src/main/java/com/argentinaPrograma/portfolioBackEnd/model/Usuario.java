package com.argentinaPrograma.portfolioBackEnd.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String usuario;
    private String password;
    private Long idPersona;//foreign key de persona

    public Usuario() {
    }

    public Usuario(Long id, String usuario, String password, Long idPersona) {
        this.id = id;
        this.usuario = usuario;
        this.password = password;
        this.idPersona = idPersona;
    }
}
