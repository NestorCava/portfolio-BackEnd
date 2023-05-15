package com.argentinaPrograma.portfolioBackEnd.service;

import com.argentinaPrograma.portfolioBackEnd.model.Educacion;
import java.util.List;


public interface IEducacionService {
    public List<Educacion> verListaEducacion();
    public void crearEducacion(Educacion educacion);
    public void eliminarEducacionById(Long id);
    public Educacion buscarEducacionById(Long id);
    public List<Educacion> buscarEducacionByIdPersona(Long id);
}
