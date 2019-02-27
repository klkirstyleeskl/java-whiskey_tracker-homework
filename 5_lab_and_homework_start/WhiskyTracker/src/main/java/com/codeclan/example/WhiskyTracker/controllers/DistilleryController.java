package com.codeclan.example.WhiskyTracker.controllers;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository.DistilleryRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/distilleries")
public class DistilleryController {

    DistilleryRepository distilleryRepository;


    @GetMapping(value = "/whiskies/named/{name}")
    public List<Distillery> findDistilleriesThatHaveWhiskiesNamed(@PathVariable String name){
        return distilleryRepository.findDistilleriesThatHaveWhiskiesNamed(name);
    }


}
