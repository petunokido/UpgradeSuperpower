//SKILL REPOSITORY
package com.example.bootcamp.repository;

import org.springframework.stereotype.Component;

@Component("my repository")  //Componente it's a bean

public class SkillRepository {
    String skills = "Champion Skills:\nSkill 1: 100DMG / 50MANA\nSkill 2: +50DEF/30MANA\n";

    public String getSkills() {
        return skills;
    }
}