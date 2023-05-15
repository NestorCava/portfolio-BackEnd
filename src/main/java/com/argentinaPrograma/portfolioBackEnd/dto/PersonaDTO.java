package com.argentinaPrograma.portfolioBackEnd.dto;

import com.argentinaPrograma.portfolioBackEnd.model.Educacion;
import com.argentinaPrograma.portfolioBackEnd.model.Experiencia;
import com.argentinaPrograma.portfolioBackEnd.model.Proyecto;
import com.argentinaPrograma.portfolioBackEnd.model.RedSocial;
import com.argentinaPrograma.portfolioBackEnd.model.Skill;
import java.util.List;
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
    private List<RedSocial> redesSociales;
    private List<Experiencia> experiencias;
    private List<Educacion> educacion;
    private List<Skill> skills;
    private List<Proyecto> proyectos;

    public PersonaDTO() {
    }

    public PersonaDTO(Long id, 
                      String nombre, 
                      String apellido, 
                      String banner, 
                      String foto, 
                      String posicion, 
                      String localidad, 
                      String acerca, 
                      List<RedSocial> redesSociales, 
                      List<Experiencia> experiencias, 
                      List<Educacion> educacion, 
                      List<Skill> skills, 
                      List<Proyecto> proyectos) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.banner = banner;
        this.foto = foto;
        this.posicion = posicion;
        this.localidad = localidad;
        this.acerca = acerca;
        this.redesSociales = redesSociales;
        this.experiencias = experiencias;
        this.educacion = educacion;
        this.skills = skills;
        this.proyectos = proyectos;
    }

    
    
    
}
