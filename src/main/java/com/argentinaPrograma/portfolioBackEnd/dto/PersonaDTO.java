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
    
}
