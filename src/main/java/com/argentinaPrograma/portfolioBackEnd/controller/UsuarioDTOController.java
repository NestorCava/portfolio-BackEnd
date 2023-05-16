
package com.argentinaPrograma.portfolioBackEnd.controller;

import com.argentinaPrograma.portfolioBackEnd.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UsuarioDTOController {
    
    @Autowired
    private IUsuarioService usuarioService;
    
    @GetMapping ("/login")
    public boolean buscarPersonaDTO(@RequestParam String usuario,
                                    @RequestParam String password){
        return true;//usuarioService.iniciarSesion(usuario, password);
    }
}
