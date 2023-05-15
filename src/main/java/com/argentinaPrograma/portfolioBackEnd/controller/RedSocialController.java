package com.argentinaPrograma.portfolioBackEnd.controller;

import com.argentinaPrograma.portfolioBackEnd.model.RedSocial;
import com.argentinaPrograma.portfolioBackEnd.service.IRedSocialService;
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
public class RedSocialController {
    
    @Autowired
    private IRedSocialService redSocialService;
    
    @PostMapping ("/new/redsocial")
    public void agregarRedSocial(@RequestBody RedSocial redSocial){
        redSocialService.crearRedSocial(redSocial);
    }
    
    @GetMapping ("/ver/redsocial")
    @ResponseBody
    public List<RedSocial> verListaRedSocial(){
        return redSocialService.verListaRedSocial();
    }
    
    @DeleteMapping ("/delete/redsocial/{id}")
    public void eliminarRedSocial(@PathVariable Long id){
        redSocialService.eliminarRedSocialById(id);
    }
    
    @GetMapping ("/ver/redsocial/{id}")
    @ResponseBody
    public RedSocial buscarRedSocial(@PathVariable Long id){
        return redSocialService.buscarRedSocialById(id);
    }
    
    @GetMapping ("/ver/redsocial/idTipo/{id}")
    @ResponseBody
    public List<RedSocial> buscarRedSocialPorTipoId(@PathVariable Long id){
        return redSocialService.buscarRedSocialByIdTipoRedSocial(id);
    }
    
}
