
package com.argentinaPrograma.portfolioBackEnd.controller;

import com.argentinaPrograma.portfolioBackEnd.model.TipoRedSocial;
import com.argentinaPrograma.portfolioBackEnd.service.ITipoRedSocialService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TipoRedSocialController {
    
    @Autowired
    private ITipoRedSocialService tipoRedSocialService;
    
    @PostMapping ("/new/tiporedsocial")
    public void agregarTipoRedSocial(@RequestBody TipoRedSocial tipoRedSocial){
        tipoRedSocialService.crearTipoRedSocial(tipoRedSocial);
    }
    
    @GetMapping ("/ver/tiporedsocial")
    @ResponseBody
    public List<TipoRedSocial> verListaTipoRedSocial(){
        return tipoRedSocialService.verListaTipoRedSocial();
    }
    
    @DeleteMapping ("/delete/tiporedsocial/{id}")
    public void eliminarTipoRedSocial(@PathVariable Long id){
        tipoRedSocialService.eliminarTipoRedSocialById(id);
    }
    
    @GetMapping ("/ver/tiporedsocial/{id}")
    @ResponseBody
    public TipoRedSocial buscarTipoRedSocial(@PathVariable Long id){
        return tipoRedSocialService.buscarTipoRedSocialById(id);
    }
}
