package br.org.generation.blogpessoal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.org.generation.blogpessoal.model.Postagem;
import br.org.generation.blogpessoal.repository.PostagemRepository;

@RestController
@RequestMapping("/postagens")
@CrossOrigin(origins = "*", allowedHeaders = "*") //Relação com frontend - Liberar requisoções de qualquer origem, ou origem específica
public class PostagemController {
	
	@Autowired //Injeção de dependência - Transferindo a responsabilidade de criar a postagem para o Spring
	private PostagemRepository postagemRepository;
	
	@GetMapping
	public ResponseEntity<List<Postagem>> getAll(){ //Classe responsável por retornar as requisições, se deram certo ou errado emite o erro.
		return ResponseEntity.ok(postagemRepository.findAll());
		// select * from tb_postagens;
	}
}
