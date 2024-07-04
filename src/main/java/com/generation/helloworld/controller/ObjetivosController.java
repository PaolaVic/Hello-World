package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ObjetivosController {

	    @GetMapping("/Objetivos")
	    public List<String> Objetivos() {
	    return Arrays.asList(
	      "Objetivos de Aprendizagem:",
	      "WEB JAVA",
	      "FullStack",
	      "LinkedIn" );
	  }
}
