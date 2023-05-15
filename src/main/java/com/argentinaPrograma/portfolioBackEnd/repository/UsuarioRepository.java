package com.argentinaPrograma.portfolioBackEnd.repository;

import com.argentinaPrograma.portfolioBackEnd.model.Usuario;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
    
    Usuario findByPersonaId(Long Id);
  
    @Transactional
    void deleteByPersonaId(long IdPersona);
    
}
