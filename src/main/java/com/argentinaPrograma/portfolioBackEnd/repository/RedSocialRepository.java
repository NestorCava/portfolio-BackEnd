package com.argentinaPrograma.portfolioBackEnd.repository;

import com.argentinaPrograma.portfolioBackEnd.model.RedSocial;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RedSocialRepository extends JpaRepository<RedSocial, Long>{
    List<RedSocial> findByPersonaId(Long Id);
    List<RedSocial> findByTipoRedSocialId(Long Id);
  
    @Transactional
    void deleteByPersonaId(long IdPersona);
    
    @Transactional
    void deleteByTipoRedSocialId(long IdTipoRedSocial);
    
}
