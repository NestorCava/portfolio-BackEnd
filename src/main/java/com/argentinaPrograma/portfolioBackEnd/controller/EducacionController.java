package com.argentinaPrograma.portfolioBackEnd.controller;

import com.argentinaPrograma.portfolioBackEnd.model.Educacion;
import com.argentinaPrograma.portfolioBackEnd.service.IEducacionService;
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
public class EducacionController {
    
    @Autowired
    private IEducacionService educacionService;
    
    @PostMapping ("/new/educacion")
    public void agregarEducacion(@RequestBody Educacion educacion){
        educacionService.crearEducacion(educacion);
    }
    
    @GetMapping ("/ver/educacion")
    @ResponseBody
    public List<Educacion> verListaEducacion(){
        return educacionService.verListaEducacion();
    }
    
    @DeleteMapping ("/delete/educacion/{id}")
    public void eliminarEducacion(@PathVariable Long id){
        educacionService.eliminarEducacionById(id);
    }
    
    @GetMapping ("/ver/educacion/{id}")
    @ResponseBody
    public Educacion buscarEducacion(@PathVariable Long id){
        return educacionService.buscarEducacionById(id);
    }
}
