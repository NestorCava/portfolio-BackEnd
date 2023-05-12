package com.argentinaPrograma.portfolioBackEnd.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UsuarioDTO {
    
    private Long id;
    private String usuario;
    private String password;
    private Long idPersona;

    public UsuarioDTO() {
    }

    public UsuarioDTO(Long id, 
                      String usuario, 
                      String password, 
                      Long idPersona) {
        this.id = id;
        this.usuario = usuario;
        this.password = password;
        this.idPersona = idPersona;
    }
}
