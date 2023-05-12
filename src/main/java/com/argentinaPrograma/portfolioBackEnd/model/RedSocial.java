package com.argentinaPrograma.portfolioBackEnd.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class RedSocial {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String usuario;
    private String url;
    private Long idTipoRedSocial;

    public RedSocial() {
    }

    public RedSocial(Long id, String usuario, String url, Long idTipoRedSocial) {
        this.id = id;
        this.usuario = usuario;
        this.url = url;
        this.idTipoRedSocial = idTipoRedSocial;
    }
    
}
