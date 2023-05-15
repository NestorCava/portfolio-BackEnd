package com.argentinaPrograma.portfolioBackEnd.controller;

import com.argentinaPrograma.portfolioBackEnd.model.Proyecto;
import com.argentinaPrograma.portfolioBackEnd.service.IProyectoService;
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
public class ProyectoController {
    @Autowired
    private IProyectoService proyectoService;
    
    @PostMapping ("/new/proyecto")
    public void agregarProyecto(@RequestBody Proyecto proyecto){
        proyectoService.crearProyecto(proyecto);
    }
    
    @GetMapping ("/ver/proyecto")
    @ResponseBody
    public List<Proyecto> verListaProyecto(){
        return proyectoService.verListaProyecto();
    }
    
    @DeleteMapping ("/delete/proyecto/{id}")
    public void eliminarProyecto(@PathVariable Long id){
        proyectoService.eliminarProyectoById(id);
    }
    
    @GetMapping ("/ver/proyecto/{id}")
    @ResponseBody
    public Proyecto buscarProyecto(@PathVariable Long id){
        return proyectoService.buscarProyectoById(id);
    }
}
