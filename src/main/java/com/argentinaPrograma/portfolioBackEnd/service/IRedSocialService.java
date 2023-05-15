package com.argentinaPrograma.portfolioBackEnd.service;

import com.argentinaPrograma.portfolioBackEnd.model.RedSocial;
import java.util.List;

public interface IRedSocialService {
    public List<RedSocial> verListaRedSocial();
    public void crearRedSocial(RedSocial redSocial);
    public void eliminarRedSocialById(Long id);
    public RedSocial buscarRedSocialById(Long id);
    public RedSocial buscarRedSocialByUsuario(String usuario);
    public List<RedSocial> buscarRedSocialByIdPersona(Long id);
    public List<RedSocial> buscarRedSocialByIdTipoRedSocial(Long id);
}
