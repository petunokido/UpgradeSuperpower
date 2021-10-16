//STAT REPOSITORY

package com.example.bootcamp.repository;


import org.springframework.stereotype.Component;

@Component

public class StatRepository {
    String stats = "Champion Stats:\nHP: 1000\nATK: 500\nDEF: 650\nSPEED: 100\n";

    public String getStats() {
        return stats;
    }
}