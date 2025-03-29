package com.example.proyecto.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class Proyecto1Controller {

    @GetMapping("/hola")
    public String holaMundo() {
        return "Holissss Mundo";

    }
    
    @GetMapping("/chao")
    public String otrometodo() {
        return "adiosito";

    }
    

}
