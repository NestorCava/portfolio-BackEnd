package com.argentinaPrograma.portfolioBackEnd.service;

import com.argentinaPrograma.portfolioBackEnd.model.Usuario;
import com.argentinaPrograma.portfolioBackEnd.repository.UsuarioRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements IUsuarioService{
    
    @Autowired
    public UsuarioRepository usuarioRepository;

    @Override
    public List<Usuario> verListaUsuario() {
        return usuarioRepository.findAll();
    }

    @Override
    public void crearUsuario(Usuario usuario) {
        usuarioRepository.save(usuario);
    }

    @Override
    public void eliminarUsuarioById(Long id) {
        usuarioRepository.deleteById(id);
    }

    @Override
    public Usuario buscarUsuarioById(Long id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    @Override
    public Usuario buscarUsuarioByIdPersona(Long id) {
        return usuarioRepository.findByPersonaId(id);
    }

    @Override
    public Usuario iniciarSesion(Usuario usuario) {
        Usuario usuarioValidado = new Usuario();
        //usuario.setUsuario("admin");
        List<Usuario> listaUsuarios = usuarioRepository.findByUsuario(usuario.getUsuario());
          
        if ((!listaUsuarios.isEmpty()) || listaUsuarios == null){
                
            listaUsuarios = usuarioRepository.findByPassword(usuario.getPassword());
            
            if (!listaUsuarios.isEmpty()){
                usuarioValidado = listaUsuarios.get(0);
            }
        }
        return usuarioValidado;
    }
    
}
