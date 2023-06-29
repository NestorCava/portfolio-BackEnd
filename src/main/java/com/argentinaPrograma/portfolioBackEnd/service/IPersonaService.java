package com.argentinaPrograma.portfolioBackEnd.service;

import com.argentinaPrograma.portfolioBackEnd.model.Persona;
import java.util.List;

public interface IPersonaService {
    public List<Persona> verListaPersona();
    public void crearPersona(Persona persona);
    public void eliminarPersonaById(Long id);
    public Persona buscarPersonaById(Long id);
    public void actualizarAcercaDe(Long id, String about);
}
