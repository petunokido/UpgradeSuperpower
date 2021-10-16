package com.example.bootcamp.controller;

import com.example.bootcamp.service.ChampionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//O Controller importa o Service porque ambos estão em comunicação

@RestController //iniciação do Spring a  identificar que isto é um Controller

public class ChampionController {

    private ChampionService championServ;

@Autowired
    public ChampionController(ChampionService championService){
        this.championServ = championService;
    }

    @GetMapping(value = "champion-overview")
    public String getChampOverview(){
        return championServ.getChampOverview();
    }
}