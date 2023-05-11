package com.argentinaPrograma.portfolioBackEnd.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String nombre;
    private String apellido;
    private String banner;
    private String foto;
    private String posicion;
    private String localidad;
    private String acerca;

    public Persona() {
    }

    public Persona(Long id, 
                   String nombre, 
                   String apellido, 
                   String banner, 
                   String foto, 
                   String posicion, 
                   String localidad, 
                   String acerca) {
        
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.banner = banner;
        this.foto = foto;
        this.posicion = posicion;
        this.localidad = localidad;
        this.acerca = acerca;
    }
    
    
    
}
