package edu.mum.cs.cs425.exercise.banking.bankingapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping(value = {"/","/bankingapp/home","/bankingapp/","/bankingapp"})
    public String homePage(){
        return "home/index";
    }
}
