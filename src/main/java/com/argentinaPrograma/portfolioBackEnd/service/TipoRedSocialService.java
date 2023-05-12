package com.argentinaPrograma.portfolioBackEnd.service;

import com.argentinaPrograma.portfolioBackEnd.model.TipoRedSocial;
import com.argentinaPrograma.portfolioBackEnd.repository.TipoRedSocialRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoRedSocialService implements ITipoRedSocialService{
    
    @Autowired
    public TipoRedSocialRepository tipoRedSocialRepository;

    @Override
    public List<TipoRedSocial> verListaTipoRedSocial() {
        return tipoRedSocialRepository.findAll();
    }

    @Override
    public void crearTipoRedSocial(TipoRedSocial tipoRedSocial) {
        tipoRedSocialRepository.save(tipoRedSocial);
    }

    @Override
    public void eliminarTipoRedSocialById(Long id) {
        tipoRedSocialRepository.deleteById(id);
    }

    @Override
    public TipoRedSocial buscarTipoRedSocialById(Long id) {
        return tipoRedSocialRepository.findById(id).orElse(null);
     }
    
}
