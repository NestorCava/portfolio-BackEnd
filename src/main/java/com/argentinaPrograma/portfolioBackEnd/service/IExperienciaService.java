package com.argentinaPrograma.portfolioBackEnd.service;

import com.argentinaPrograma.portfolioBackEnd.model.Experiencia;
import java.util.List;

public interface IExperienciaService {
    
    public List<Experiencia> verListaExperiencia();
    public void crearExperiencia(Experiencia experiencia);
    public void eliminarExperienciaById(Long id);
    public Experiencia buscarExperienciaById(Long id);
    public List<Experiencia> buscarExperienciaByIdPersona(Long id);
    
}
