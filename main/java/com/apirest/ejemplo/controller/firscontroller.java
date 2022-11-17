package com.apirest.ejemplo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class firscontroller {
   @RequestMapping("/")
    public String returnMessage(){
        return "PRIMER CONTROLADOR";
    }
}
