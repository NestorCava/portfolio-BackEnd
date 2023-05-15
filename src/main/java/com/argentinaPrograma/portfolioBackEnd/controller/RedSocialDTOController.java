package com.argentinaPrograma.portfolioBackEnd.controller;

import com.argentinaPrograma.portfolioBackEnd.dto.RedSocialDTO;
import com.argentinaPrograma.portfolioBackEnd.model.RedSocial;
import com.argentinaPrograma.portfolioBackEnd.model.TipoRedSocial;
import com.argentinaPrograma.portfolioBackEnd.service.IRedSocialService;
import com.argentinaPrograma.portfolioBackEnd.service.ITipoRedSocialService;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedSocialDTOController {
    
    @Autowired
    private IRedSocialService redSocialService;
    
    @Autowired
    private ITipoRedSocialService tipoRedSocialService;
    
    @PostMapping ("/new/redsocialdto")
    public void agregarRedSocialDTO(@RequestBody RedSocialDTO redSocialDTO){
        RedSocial redSocial = new RedSocial();
        TipoRedSocial tipoRedSocial;// = new TipoRedSocial();
        
        tipoRedSocial = tipoRedSocialService.buscarTipoRedSocialByTipo
                                              (redSocialDTO.getRedSocial());
        
        //Si la linea anterior retorna null creamos el tipo de red social
        if(tipoRedSocial == null) {
            tipoRedSocial = new TipoRedSocial();
            tipoRedSocial.setRedSocial(redSocialDTO.getRedSocial());
            tipoRedSocialService.crearTipoRedSocial(tipoRedSocial);
            
            tipoRedSocial = tipoRedSocialService.buscarTipoRedSocialByTipo
                                              (redSocialDTO.getRedSocial());
        } 
        
        //redSocial.setId(redSocialDTO.getId());
        redSocial.setUsuario(redSocialDTO.getUsuario());
        redSocial.setUrl(redSocialDTO.getUrl());
        //redSocial.setIdTipoRedSocial(tipoRedSocial.getId());
            
        redSocialService.crearRedSocial(redSocial);
        
    }
  
    @DeleteMapping ("/delete/redsocialDTO/{id}")
    public void eliminarRedSocialDTO(@PathVariable Long id){
        redSocialService.eliminarRedSocialById(id);
    }
    
    @GetMapping ("/ver/redsocialDTO/{id}")
    @ResponseBody
    public RedSocialDTO buscarRedSocialDTO(@PathVariable Long id){
        RedSocial redSocial;// = new RedSocial();
        redSocial = redSocialService.buscarRedSocialById(id);
        
        if (redSocial == null) return null;
        else{
             RedSocialDTO redSocialDTO = new RedSocialDTO();
             
             redSocialDTO.setId(id);
             redSocialDTO.setUsuario(redSocial.getUsuario());
             redSocialDTO.setUrl(redSocial.getUrl());
                                              
             redSocialDTO.setRedSocial(
                  tipoRedSocialService.buscarTipoRedSocialById(
                       redSocial.getId()).getRedSocial());
        
            return redSocialDTO;
        }
    }
}
