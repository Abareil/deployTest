package com.api.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    // Inyecta la variable de entorno SALUDO en la variable saludo
    @Value("${SALUDO}")
    private String saludo;

    @GetMapping("/")
    public String hello() {
        // Retorna el valor de la variable de entorno SALUDO
        return saludo;
    }
}
