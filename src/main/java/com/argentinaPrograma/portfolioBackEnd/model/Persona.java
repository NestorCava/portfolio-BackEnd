package com.argentinaPrograma.portfolioBackEnd.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.List;
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
    
    //private List<Long> idRedSocial;//foreign key de las Redes Sociales
    @OneToMany(mappedBy="persona")
    private List<RedSocial> redesSociales;
    
    //private List<Long> idExperiencia; //foreign key de Experiencia
    @OneToMany(mappedBy="persona")
    private List<Experiencia> experiencia;
    
    //private List<Long> idEducacion; //foreign key de Educacion
    @OneToMany(mappedBy="persona")
    private List<Educacion> educacion;
    
    //private List<Long> idSkill; //foreign key de Skill
    @OneToMany(mappedBy="persona")
    private List<Skill> skill;
    
    //private List<Long> idProyecto; //foreign key de Proyecto
    @OneToMany(mappedBy="persona")
    private List<Proyecto> proyecto;
    
    

    public Persona() {
    }

    public Persona(Long id, 
                   String nombre, 
                   String apellido, 
                   String banner, 
                   String foto, 
                   String posicion, 
                   String localidad, 
                   String acerca, 
                   List<RedSocial> redesSociales, 
                   List<Experiencia> experiencia, 
                   List<Educacion> educacion, 
                   List<Skill> skill, 
                   List<Proyecto> proyecto) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.banner = banner;
        this.foto = foto;
        this.posicion = posicion;
        this.localidad = localidad;
        this.acerca = acerca;
        this.redesSociales = redesSociales;
        this.experiencia = experiencia;
        this.educacion = educacion;
        this.skill = skill;
        this.proyecto = proyecto;
    }

    
}
