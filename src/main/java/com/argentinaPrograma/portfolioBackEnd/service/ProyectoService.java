package com.argentinaPrograma.portfolioBackEnd.service;

import com.argentinaPrograma.portfolioBackEnd.model.Proyecto;
import com.argentinaPrograma.portfolioBackEnd.repository.ProyectoRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService implements IProyectoService{
    
    @Autowired
    public ProyectoRepository proyectoRepository;

    @Override
    public List<Proyecto> verListaProyecto() {
        return proyectoRepository.findAll();
    }

    @Override
    public void crearProyecto(Proyecto proyecto) {
        proyectoRepository.save(proyecto);
    }

    @Override
    public void eliminarProyectoById(Long id) {
        proyectoRepository.deleteById(id);
    }

    @Override
    public Proyecto buscarProyectoById(Long id) {
        return proyectoRepository.findById(id).orElse(null);
    }

    @Override
    public List<Proyecto> buscarProyectoByIdPersona(Long id) {
        return proyectoRepository.findByPersonaId(id);
    }
}
