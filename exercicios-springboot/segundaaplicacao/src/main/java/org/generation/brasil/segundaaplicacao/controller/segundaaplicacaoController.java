package org.generation.brasil.segundaaplicacao.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/segundaaplicacao")
public class segundaaplicacaoController {
	
	@GetMapping
	public String aprendizagem(){
		return "Meu objetivo é aprender mais sobre Springboot através de cursos externos";
	}

}
