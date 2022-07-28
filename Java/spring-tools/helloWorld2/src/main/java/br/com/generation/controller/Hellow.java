package br.com.generation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class Hellow {

		@GetMapping//coloque a informação abaixo no endereço
		public String hello() {
			return "Hello world! Hello Spring!";
		}
	
		
	}





