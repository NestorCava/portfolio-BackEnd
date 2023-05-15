package com.argentinaPrograma.portfolioBackEnd.service;

import com.argentinaPrograma.portfolioBackEnd.model.Skill;
import java.util.List;

public interface ISkillService {
    public List<Skill> verListaSkill();
    public void crearSkill(Skill skill);
    public void eliminarSkillById(Long id);
    public Skill buscarSkillById(Long id);
    public List<Skill> buscarSkillByIdPersona(Long id);
}
