package com.argentinaPrograma.portfolioBackEnd.controller;

import com.argentinaPrograma.portfolioBackEnd.model.Experiencia;
import com.argentinaPrograma.portfolioBackEnd.service.IExperienciaService;
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
public class ExperienciaController {
    @Autowired
    private IExperienciaService experienciaService;
    
    @PostMapping ("/new/experiencia")
    public void agregarExperiencia(@RequestBody Experiencia experiencia){
        experienciaService.crearExperiencia(experiencia);
    }
    
    @GetMapping ("/ver/experiencia")
    @ResponseBody
    public List<Experiencia> verListaExperiencia(){
        return experienciaService.verListaExperiencia();
    }
    
    @DeleteMapping ("/delete/experiencia/{id}")
    public void eliminarExperiencia(@PathVariable Long id){
        experienciaService.eliminarExperienciaById(id);
    }
    
    @GetMapping ("/ver/experiencia/{id}")
    @ResponseBody
    public Experiencia buscarExperiencia(@PathVariable Long id){
        return experienciaService.buscarExperienciaById(id);
    }
}
