package com.example.proyecto.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class Proyecto1Controller {

    @GetMapping("/hola")
    public String getMethodName(@RequestParam String param) {
        return new String();
    }
    

}
