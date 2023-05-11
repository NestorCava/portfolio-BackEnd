package com.argentinaPrograma.portfolioBackEnd.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UsuarioDTO {
    
    private Long id;
    private String usuario;
    private String password;
    private Long id_persona;
    
}
