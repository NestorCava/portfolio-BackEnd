package com.argentinaPrograma.portfolioBackEnd.dto;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class RedSocialDTO implements Serializable{
    
    private Long id;
    private String usuario;
    private String url;
    private String redSocial;

    public RedSocialDTO() {
    }

    public RedSocialDTO(Long id, 
                        String usuario, 
                        String url, 
                        String redSocial) {
        this.id = id;
        this.usuario = usuario;
        this.url = url;
        this.redSocial = redSocial;
    }
    
    
}
