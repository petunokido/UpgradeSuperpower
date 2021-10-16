package com.example.bootcamp.service;

import com.example.bootcamp.repository.SkillRepository;
import com.example.bootcamp.repository.StatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Os Service importa os repositorios pois o repositorios estao conectados
// À DB e o serviço vai buscar a info à DB diretamente a mando do Controller

@Service //Identifica a pagina com um Serviço
public class ChampionService {
    private StatRepository statRepo;
    private SkillRepository skillRepo;

    @Autowired //Liga diretamente
    public ChampionService(StatRepository statRepo, SkillRepository skillRepo) {
        this.skillRepo = skillRepo;
        this.statRepo = statRepo;
    }

    public String getChampOverview(){
        return statRepo.getStats() + "----------------\n" + skillRepo.getSkills();
    }
}