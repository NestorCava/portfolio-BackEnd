package com.argentinaPrograma.portfolioBackEnd.service;

import com.argentinaPrograma.portfolioBackEnd.model.TipoRedSocial;
import java.util.List;


public interface ITipoRedSocialService {
    public List<TipoRedSocial> verListaTipoRedSocial();
    public void crearTipoRedSocial(TipoRedSocial tipoRedSocial);
    public void eliminarTipoRedSocialById(Long id);
    public TipoRedSocial buscarTipoRedSocialById(Long id);
    public TipoRedSocial buscarTipoRedSocialByTipo(String tipo);
}
