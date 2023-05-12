package com.argentinaPrograma.portfolioBackEnd.service;

import com.argentinaPrograma.portfolioBackEnd.model.Proyecto;
import java.util.List;


public interface IProyectoService {
    
    public List<Proyecto> verListaProyecto();
    public void crearProyectoa(Proyecto proyecto);
    public void eliminarProyectoById(Long id);
    public Proyecto buscarProyectoById(Long id);
    
}
