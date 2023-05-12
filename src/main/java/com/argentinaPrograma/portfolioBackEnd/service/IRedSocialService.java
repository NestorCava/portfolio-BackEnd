package com.argentinaPrograma.portfolioBackEnd.service;

import com.argentinaPrograma.portfolioBackEnd.model.RedSocial;
import java.util.List;

public interface IRedSocialService {
    public List<RedSocial> verListaRedSocial();
    public void crearRedSocial(RedSocial redSocial);
    public void eliminarRedSocialById(Long id);
    public RedSocial buscarRedSocialById(Long id);
}
