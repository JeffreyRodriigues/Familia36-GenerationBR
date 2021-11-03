package br.org.generation.blogpessoal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.org.generation.blogpessoal.model.Postagem;
import br.org.generation.blogpessoal.repository.PostagemRepository;

@RestController
@RequestMapping("/postagens") // Tudo que vier com o endereço /postagens, ela vai executar
@CrossOrigin(origins = "*", allowedHeaders = "*") //Relação com frontend - Liberar requisições de qualquer origem, ou origem específica
public class PostagemController {
	
	@Autowired //Injeção de dependência - Transferindo a responsabilidade de criar a postagem para o Spring
	private PostagemRepository postagemRepository;
	
	@GetMapping
	public ResponseEntity<List<Postagem>> getAll(){ //Classe responsável por retornar as requisições, se deram certo ou errado emite o erro.
		return ResponseEntity.ok(postagemRepository.findAll());
		// select * from tb_postagens;
	}
	
	@GetMapping("/{id}") // dentro das chaves, indica que é um parâmetro
	public ResponseEntity<Postagem> getById(@PathVariable long id){ // Pega o valor indicado no parametro, e coloca dentro do método long id
		return postagemRepository.findById(id)
				.map(resposta -> ResponseEntity.ok(resposta)) // cria o objeto resposta que vai receber o findById, se achar devolve a resposta
				.orElse(ResponseEntity.notFound().build()); // Se não encontrar, informa que não achou	
	}
	
	@GetMapping("/titulo/{titulo}") // indica que é título, e depois o parâmetro
	public ResponseEntity<List<Postagem>> getByTitulo(@PathVariable String titulo){ 
		return ResponseEntity.ok(postagemRepository.findAllByTituloContainingIgnoreCase(titulo));	
	}
	
	@PostMapping
	public ResponseEntity<Postagem> postPostagem(@RequestBody Postagem postagem){ 
		//pega o conteúdo do corpo da requisição e transforma em objeto do tipo postagem
		return ResponseEntity.status(HttpStatus.CREATED).body(postagemRepository.save(postagem));
	}
	
	@PutMapping
	public ResponseEntity<Postagem> putPostagem(@RequestBody Postagem postagem){ 
		return postagemRepository.findById(postagem.getId())
				.map(resposta -> ResponseEntity.status(HttpStatus.OK).body(postagemRepository.save(postagem)))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deletaPostagem(@PathVariable long id) {
		return postagemRepository.findById(id)
				.map(resposta -> {
					postagemRepository.deleteById(id);
					return ResponseEntity.ok().build();
				})
				.orElse(ResponseEntity.notFound().build());

	}
		
}

