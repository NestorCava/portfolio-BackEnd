
package com.argentinaPrograma.portfolioBackEnd.service;

import com.argentinaPrograma.portfolioBackEnd.model.RedSocial;
import com.argentinaPrograma.portfolioBackEnd.repository.PersonaRepository;
import com.argentinaPrograma.portfolioBackEnd.repository.RedSocialRepository;
import com.argentinaPrograma.portfolioBackEnd.repository.TipoRedSocialRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RedSocialService implements IRedSocialService{
    
    @Autowired
    public RedSocialRepository redSocialRepository;
    
    @Autowired
    public PersonaRepository personaRepository;
    
    @Autowired
    public TipoRedSocialRepository tipoRedSocialRepository;

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

    @Override
    public RedSocial buscarRedSocialByUsuario(String usuario) {
        List<RedSocial> redesSocial = redSocialRepository.findAll();
        RedSocial redSocial = new RedSocial();
        
        for(RedSocial rS : redesSocial){
            if (rS.getUsuario().toUpperCase()
                                 .equals(usuario.toUpperCase())){
            
                redSocial = rS;
                break;
            }else redSocial=null;
        }
        
        return redSocial;
    }

    @Override
    public List<RedSocial> buscarRedSocialByIdPersona(Long id) {
        return redSocialRepository.findByPersonaId(id);
    }

    @Override
    public List<RedSocial> buscarRedSocialByIdTipoRedSocial(Long id) {
        return redSocialRepository.findByTipoRedSocialId(id);
    }
       
}
