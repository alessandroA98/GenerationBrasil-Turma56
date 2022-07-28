package br.com.generation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello/objetivos")
public class Objetivos {

	@GetMapping
	public String objetiosSemana() {
		
		return "aperfeiçoar o aprendizado de spring-tools";
	}
	
}
