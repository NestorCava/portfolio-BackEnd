package com.argentinaPrograma.portfolioBackEnd.service;

import com.argentinaPrograma.portfolioBackEnd.model.Persona;
import com.argentinaPrograma.portfolioBackEnd.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService{
    
    @Autowired
    public PersonaRepository personaRepository;

    @Override
    public List<Persona> verListaPersona() {
        return personaRepository.findAll();
    }

    @Override
    public void crearPersona(Persona persona) {
        personaRepository.save(persona);
    }

    @Override
    public void eliminarPersonaById(Long id) {
        personaRepository.deleteById(id);
    }

    @Override
    public Persona buscarPersonaById(Long id) {
        return personaRepository.findById(id).orElse(null);
    }

    @Override
    public void actualizarAcercaDe(Long id, String about) {
        Persona persona = new Persona();
        persona = this.buscarPersonaById(id);
        persona.setAcerca(about);
    }
    
    
}
