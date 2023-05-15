package com.argentinaPrograma.portfolioBackEnd.repository;

import com.argentinaPrograma.portfolioBackEnd.model.Experiencia;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaRepository extends JpaRepository<Experiencia, Long>{
    List<Experiencia> findByPersonaId(Long Id);
  
    @Transactional
    void deleteByPersonaId(long IdPersona);    
    
}
