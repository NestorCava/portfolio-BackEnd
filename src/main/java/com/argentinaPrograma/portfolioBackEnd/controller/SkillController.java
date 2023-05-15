package com.argentinaPrograma.portfolioBackEnd.controller;

import com.argentinaPrograma.portfolioBackEnd.model.Skill;
import com.argentinaPrograma.portfolioBackEnd.service.ISkillService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SkillController {
    @Autowired
    private ISkillService skillService;
    
    @PostMapping ("/new/skill")
    public void agregarSkill(@RequestBody Skill skill){
        skillService.crearSkill(skill);
    }
    
    @GetMapping ("/ver/skill")
    @ResponseBody
    public List<Skill> verListaSkill(){
        return skillService.verListaSkill();
    }
    
    @DeleteMapping ("/delete/skill/{id}")
    public void eliminarSkill(@PathVariable Long id){
        skillService.eliminarSkillById(id);
    }
    
    @GetMapping ("/ver/skill/{id}")
    @ResponseBody
    public Skill buscarSkill(@PathVariable Long id){
        return skillService.buscarSkillById(id);
    }
}
