package com.argentinaPrograma.portfolioBackEnd.controller;

import com.argentinaPrograma.portfolioBackEnd.model.Usuario;
import com.argentinaPrograma.portfolioBackEnd.service.IUsuarioService;
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
public class UsuarioController {
    @Autowired
    private IUsuarioService usuarioService;
    
    @PostMapping ("/new/usuario")
    public void agregarUsuario(@RequestBody Usuario usuario){
        usuarioService.crearUsuario(usuario);
    }
    
    @GetMapping ("/ver/usuario")
    @ResponseBody
    public List<Usuario> verListaUsuario(){
        return usuarioService.verListaUsuario();
    }
    
    @DeleteMapping ("/delete/usuario/{id}")
    public void eliminarUsuario(@PathVariable Long id){
        usuarioService.eliminarUsuarioById(id);
    }
    
    @GetMapping ("/ver/usuario/{id}")
    @ResponseBody
    public Usuario buscarUsuario(@PathVariable Long id){
        return usuarioService.buscarUsuarioById(id);
    }
}
