
package com.argentinaPrograma.portfolioBackEnd.service;

import com.argentinaPrograma.portfolioBackEnd.model.RedSocial;
import com.argentinaPrograma.portfolioBackEnd.repository.RedSocialRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RedSocialService implements IRedSocialService{
    
    @Autowired
    public RedSocialRepository redSocialRepository;

    @Override
    public List<RedSocial> verListaRedSocial() {
        return redSocialRepository.findAll();
    }

    @Override
    public void crearRedSocial(RedSocial redSocial) {
        redSocialRepository.save(redSocial);
    }

    @Override
    public void eliminarRedSocialById(Long id) {
        redSocialRepository.deleteById(id);
    }

    @Override
    public RedSocial buscarRedSocialById(Long id) {
        return redSocialRepository.findById(id).orElse(null);
    }
       
}
