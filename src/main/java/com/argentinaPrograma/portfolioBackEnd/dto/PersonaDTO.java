package com.argentinaPrograma.portfolioBackEnd.dto;

import com.argentinaPrograma.portfolioBackEnd.model.Educacion;
import com.argentinaPrograma.portfolioBackEnd.model.Experiencia;
import com.argentinaPrograma.portfolioBackEnd.model.Proyecto;
import com.argentinaPrograma.portfolioBackEnd.model.Skill;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class PersonaDTO {
    
    private Long id;
    
    private String usuario;
    private String password;
    
    private String nombre;
    private String apellido;
    private String banner;
    private String foto;
    private String posicion;
    private String localidad;
    private String acerca;
    
    private Experiencia[] experiencias;
    private Educacion[] educacion;
    private Skill[] skills;
    private Proyecto[] proyectos;

    public PersonaDTO() {
    }

    public PersonaDTO(Long id, 
                      String usuario, 
                      String password,
                      String nombre, 
                      String apellido, 
                      String banner, 
                      String foto, 
                      String posicion, 
                      String localidad, 
                      String acerca, 
                      Experiencia[] experiencias, 
                      Educacion[] educacion, 
                      Skill[] skills, 
                      Proyecto[] proyectos) {
        this.id = id;
        this.usuario = usuario;
        this.password = usuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.banner = banner;
        this.foto = foto;
        this.posicion = posicion;
        this.localidad = localidad;
        this.acerca = acerca;
        this.experiencias = experiencias;
        this.educacion = educacion;
        this.skills = skills;
        this.proyectos = proyectos;
    }
    
    
}
