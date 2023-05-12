package com.argentinaPrograma.portfolioBackEnd.service;

import com.argentinaPrograma.portfolioBackEnd.model.Skill;
import com.argentinaPrograma.portfolioBackEnd.repository.SkillRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillService implements ISkillService{
    
    @Autowired
    public SkillRepository skillRepository;

    @Override
    public List<Skill> verListaSkill() {
        return skillRepository.findAll();
    }

    @Override
    public void crearSkill(Skill skill) {
        skillRepository.save(skill);
    }

    @Override
    public void eliminarSkillById(Long id) {
        skillRepository.deleteById(id);
    }

    @Override
    public Skill buscarSkillById(Long id) {
        return skillRepository.findById(id).orElse(null);
    }
    
}
