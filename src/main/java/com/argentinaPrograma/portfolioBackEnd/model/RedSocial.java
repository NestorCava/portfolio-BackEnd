package com.argentinaPrograma.portfolioBackEnd.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Getter @Setter
@Entity
public class RedSocial {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String usuario;
    private String url;
    
    //private Long idTipoRedSocial;
    
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "idTipoRedSocial", referencedColumnName = "id")
//    private TipoRedSocial tipoRedesSociales; 
    
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name="idTipoRedSocial", nullable=false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private TipoRedSocial tipoRedSocial;
    
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name="idPersona", nullable=false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Persona persona;

    public RedSocial() {
    }

    public RedSocial(Long id, String usuario, String url, TipoRedSocial tipoRedSocial, Persona persona) {
        this.id = id;
        this.usuario = usuario;
        this.url = url;
        this.tipoRedSocial = tipoRedSocial;
        this.persona = persona;
    }


}
