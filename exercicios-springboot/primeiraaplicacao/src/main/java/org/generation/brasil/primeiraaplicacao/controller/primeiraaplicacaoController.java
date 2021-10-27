package org.generation.brasil.primeiraaplicacao.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeiraaplicacao")
public class primeiraaplicacaoController {

	@GetMapping
	public String mentalidadeehabilidade() {
		return "Minha principal mentalidade foi PERSISTÊNCIA e habilidade ATENÇÃO AO DETALHE.";
	}
}
