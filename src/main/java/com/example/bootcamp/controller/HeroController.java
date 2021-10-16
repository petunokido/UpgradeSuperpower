package com.example.bootcamp.controller;

import com.example.bootcamp.model.Country;
import com.example.bootcamp.model.Hero;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;
@RestController

public class HeroController {

    @GetMapping("/getHeroes")
    public List<Hero> getHero()
    {
        return Collections.emptyList();
    }

}
