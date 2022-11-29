package com.openbootcamp.modulo4.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String Saludo(){
        return "Hola desde HelloController!";
    }
}
