package com.argentinaPrograma.portfolioBackEnd.repository;

import com.argentinaPrograma.portfolioBackEnd.model.TipoRedSocial;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoRedSocialRepository extends JpaRepository<TipoRedSocial, Long>{   
}
