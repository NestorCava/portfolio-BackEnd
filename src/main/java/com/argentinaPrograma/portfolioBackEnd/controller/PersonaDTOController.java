package com.argentinaPrograma.portfolioBackEnd.controller;

import com.argentinaPrograma.portfolioBackEnd.dto.PersonaDTO;
import com.argentinaPrograma.portfolioBackEnd.model.Educacion;
import com.argentinaPrograma.portfolioBackEnd.model.Experiencia;
import com.argentinaPrograma.portfolioBackEnd.model.Persona;
import com.argentinaPrograma.portfolioBackEnd.model.Proyecto;
import com.argentinaPrograma.portfolioBackEnd.model.RedSocial;
import com.argentinaPrograma.portfolioBackEnd.model.Skill;
import com.argentinaPrograma.portfolioBackEnd.service.IEducacionService;
import com.argentinaPrograma.portfolioBackEnd.service.IExperienciaService;
import com.argentinaPrograma.portfolioBackEnd.service.IPersonaService;
import com.argentinaPrograma.portfolioBackEnd.service.IProyectoService;
import com.argentinaPrograma.portfolioBackEnd.service.IRedSocialService;
import com.argentinaPrograma.portfolioBackEnd.service.ISkillService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@CrossOrigin(origins = "http://localhost:4200")
@CrossOrigin(origins = "https://portfolio-cavallini-nestor.web.app")
public class PersonaDTOController {
    @Autowired
    private IPersonaService personaService;
    
    @Autowired
    private IRedSocialService redSocialService;
    @Autowired
    private IExperienciaService experienciaService;
    @Autowired
    private IEducacionService educacionService;
    @Autowired
    private ISkillService skillService;
    @Autowired
    private IProyectoService proyectoService;
        
    @GetMapping ("/personadto/ver/{id}")
    @ResponseBody
    public PersonaDTO buscarPersonaDTO(@PathVariable Long id){
        PersonaDTO personaDTO;
        
        Persona persona = personaService.buscarPersonaById(id);
        
        //Si la persona existe la cargamos al DTO
        if (persona != null){
            personaDTO = new PersonaDTO();
            personaDTO.setId(persona.getId());
            personaDTO.setNombre(persona.getNombre());
            personaDTO.setApellido(persona.getApellido());
            personaDTO.setBanner(persona.getBanner());
            personaDTO.setFoto(persona.getFoto());
            personaDTO.setPosicion(persona.getPosicion());
            personaDTO.setLocalidad(persona.getLocalidad());
            personaDTO.setAcerca(persona.getAcerca());
            
            //Carga de las redes sociales
            personaDTO.setRedesSociales(redSocialService
                                            .buscarRedSocialByIdPersona(id));
            
            //Carga de las experiencias
            personaDTO.setExperiencias(experienciaService
                                            .buscarExperienciaByIdPersona(id));
            
            //Carga de las educacion
            personaDTO.setEducacion(educacionService
                                            .buscarEducacionByIdPersona(id));
            
            //Carga de las skills
            personaDTO.setSkills(skillService
                                            .buscarSkillByIdPersona(id));
            
            //Carga de las skills
            personaDTO.setProyectos(proyectoService
                                            .buscarProyectoByIdPersona(id));
            
        }else personaDTO = null;
        
        return personaDTO;
    }
    
    @PostMapping ("/actualizar/about")
    public void actualizarAbout(@RequestBody Long id,
                                @RequestBody String about){
        personaService.actualizarAcercaDe(id,about);
        System.out.println("Persona guardada???");
    }
    
}
