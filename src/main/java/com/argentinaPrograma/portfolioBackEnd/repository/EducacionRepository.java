package com.argentinaPrograma.portfolioBackEnd.repository;

import com.argentinaPrograma.portfolioBackEnd.model.Educacion;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducacionRepository extends JpaRepository<Educacion, Long>{
    List<Educacion> findByPersonaId(Long Id);
  
    @Transactional
    void deleteByPersonaId(long IdPersona);    
}
