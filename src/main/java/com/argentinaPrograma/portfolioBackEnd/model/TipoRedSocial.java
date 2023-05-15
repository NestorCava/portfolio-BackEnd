package com.argentinaPrograma.portfolioBackEnd.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
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

@Getter @Setter
@Entity
public class TipoRedSocial {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String redSocial;
    
    @OneToMany(mappedBy="tipoRedSocial")
    private List<RedSocial> redesSociales;
    
    public TipoRedSocial() {
    }

    public TipoRedSocial(Long id, String redSocial, List<RedSocial> redesSociales) {
        this.id = id;
        this.redSocial = redSocial;
        this.redesSociales = redesSociales;
    }



   
    
    
    
}
