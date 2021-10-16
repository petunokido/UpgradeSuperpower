package com.example.bootcamp.controller;

//SUPERPOWER CONTROLLER
import com.example.bootcamp.models.Superpower;
import com.example.bootcamp.services.SuperpowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@Validated
public class SuperpowerController {
    @Autowired
    SuperpowerService superpowerServ;

    @GetMapping("/getSuperpowers")
    public List<Superpower> getSuperpowers(){
        return superpowerServ.findAll();
    }

}
