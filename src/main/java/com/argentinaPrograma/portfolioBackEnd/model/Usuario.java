package com.argentinaPrograma.portfolioBackEnd.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Getter @Setter
@Entity
public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String usuario;
    private String password;
    
    //private Long idPersona;//foreign key de persona
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idPersona", referencedColumnName = "id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Persona persona;

    public Usuario() {
    }

    public Usuario(Long id, String usuario, String password, Persona persona) {
        this.id = id;
        this.usuario = usuario;
        this.password = password;
        this.persona = persona;
    }

    
}
