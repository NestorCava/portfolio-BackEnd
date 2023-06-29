
package com.argentinaPrograma.portfolioBackEnd.controller;

import com.argentinaPrograma.portfolioBackEnd.dto.UsuarioDTO;
import com.argentinaPrograma.portfolioBackEnd.model.Usuario;
import com.argentinaPrograma.portfolioBackEnd.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UsuarioDTOController {
    
    @Autowired
    private IUsuarioService usuarioService;
    
    @PostMapping ("/login")
    public UsuarioDTO buscarUsuarioDTO(@RequestBody UsuarioDTO usuarioDTO){
        
        System.out.println(usuarioDTO.getUsuario());
        Usuario usuario = new Usuario(null,
                                      usuarioDTO.getUsuario(),
                                      usuarioDTO.getPassword(),
                                      null);
        usuario = usuarioService.iniciarSesion(usuario);
        
        System.out.println(usuarioDTO.getUsuario());
        
        usuarioDTO.setId(usuario.getId());
        usuarioDTO.setUsuario(usuario.getUsuario());
        usuarioDTO.setPassword(usuario.getPassword());
        if (usuario.getPersona() != null){
            usuarioDTO.setIdPersona(usuario.getPersona().getId());
            System.out.println("Existe");
        }    
        else{
            usuarioDTO.setIdPersona(null);
        }
        System.out.println("Anda");
        System.out.print(usuario.getId());
        return usuarioDTO;//usuarioService.iniciarSesion(usuario);
    }
}
