package com.argentinaPrograma.portfolioBackEnd.service;

import com.argentinaPrograma.portfolioBackEnd.model.Usuario;
import java.util.List;

public interface IUsuarioService {
    
    public List<Usuario> verListaUsuario();
    public void crearUsuario(Usuario usuario);
    public void eliminarUsuarioById(Long id);
    public Usuario buscarUsuarioById(Long id);
    public Usuario buscarUsuarioByIdPersona(Long id);
    public boolean iniciarSesion(String usuario, String password);
}
