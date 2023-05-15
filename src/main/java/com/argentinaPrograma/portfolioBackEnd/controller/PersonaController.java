package com.argentinaPrograma.portfolioBackEnd.controller;

import com.argentinaPrograma.portfolioBackEnd.model.Persona;
import com.argentinaPrograma.portfolioBackEnd.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController {
    @Autowired
    private IPersonaService personaService;
    
    @PostMapping ("/new/persona")
    public void agregarPersona(@RequestBody Persona persona){
        personaService.crearPersona(persona);
    }
    
    @GetMapping ("/ver/persona")
    @ResponseBody
    public List<Persona> verListaPersona(){
        return personaService.verListaPersona();
    }
    
    @DeleteMapping ("/delete/persona/{id}")
    public void eliminarPersona(@PathVariable Long id){
        personaService.eliminarPersonaById(id);
    }
    
    @GetMapping ("/ver/persona/{id}")
    @ResponseBody
    public Persona buscarPersona(@PathVariable Long id){
        return personaService.buscarPersonaById(id);
    }
}
