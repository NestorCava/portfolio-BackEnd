
package com.argentinaPrograma.portfolioBackEnd.service;

import com.argentinaPrograma.portfolioBackEnd.model.Experiencia;
import com.argentinaPrograma.portfolioBackEnd.repository.ExperienciaRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements IExperienciaService{
    
    @Autowired
    public ExperienciaRepository experienciaRepository;

    @Override
    public List<Experiencia> verListaExperiencia() {
        return experienciaRepository.findAll();
    }

    @Override
    public void crearExperiencia(Experiencia experiencia) {
        experienciaRepository.save(experiencia);
    }

    @Override
    public void eliminarExperienciaById(Long id) {
        experienciaRepository.deleteById(id);
    }

    @Override
    public Experiencia buscarExperienciaById(Long id) {
        return experienciaRepository.findById(id).orElse(null);
    }

    @Override
    public List<Experiencia> buscarExperienciaByIdPersona(Long id) {
        return experienciaRepository.findByPersonaId(id);
    }
    
}
