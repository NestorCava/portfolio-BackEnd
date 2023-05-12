
package com.argentinaPrograma.portfolioBackEnd.service;

import com.argentinaPrograma.portfolioBackEnd.model.Educacion;
import com.argentinaPrograma.portfolioBackEnd.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements IEducacionService{
    
    @Autowired
    public EducacionRepository educacionRepository;
    
    @Override
    public List<Educacion> verListaEducacion() {
        return educacionRepository.findAll();
    }

    @Override
    public void crearEducacion(Educacion educacion) {
        educacionRepository.save(educacion);
    }

    @Override
    public void eliminarEducacionById(Long id) {
        educacionRepository.deleteById(id);
    }

    @Override
    public Educacion buscarEducacionById(Long id) {
        return educacionRepository.findById(id).orElse(null);
    }
    
}
