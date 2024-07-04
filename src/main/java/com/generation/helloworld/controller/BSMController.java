package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class BSMController {

    @GetMapping("/BSMs")
    public List<String> BSMs() {
        return Arrays.asList(
                "Proatividade",
                "Trabalho em Equipe",
                "Orientação ao Detalhe",
                "Comunicação",
                "Orientação ao Futuro",
                "Responsabilidade Pessoal",
                "Mentalidade de Crescimento",
                "Persistência"
        );
    }
}