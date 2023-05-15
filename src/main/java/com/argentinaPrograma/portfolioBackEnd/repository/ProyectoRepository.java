
package com.argentinaPrograma.portfolioBackEnd.repository;

import com.argentinaPrograma.portfolioBackEnd.model.Proyecto;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectoRepository extends JpaRepository<Proyecto, Long>{
    
    List<Proyecto> findByPersonaId(Long Id);
  
    @Transactional
    void deleteByPersonaId(long IdPersona);  
    
}
