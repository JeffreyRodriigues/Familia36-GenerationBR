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

import br.org.generation.blogpessoal.model.Tema;
import br.org.generation.blogpessoal.repository.TemaRepository;

@RestController
@RequestMapping("/tema")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class TemaController {
	
	@Autowired
	private TemaRepository temaRepository;
	
	@GetMapping 
	public ResponseEntity<List<Tema>> getAll(){
		return ResponseEntity.ok(temaRepository.findAll());
	}
	
	@GetMapping("/{id}") // indica que é título, e depois o parâmetro
	public ResponseEntity<Tema> getById(@PathVariable long id){ 
		return temaRepository.findById(id)	
			.map(resp -> ResponseEntity.ok(resp))
			.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/descricao/{descricao}")
	public ResponseEntity<List<Tema>> getByDescricao(@PathVariable String descricao) {
		return ResponseEntity.ok(temaRepository.findAllByDescricaoContainingIgnoreCase(descricao));
	}
	
	@PostMapping // Inserir dados
	public ResponseEntity<Tema> post/*Tema*/(@RequestBody Tema tema){ 
		//pega o conteúdo do corpo da requisição e transforma em objeto do tipo postagem
		return ResponseEntity.status(HttpStatus.CREATED).body(temaRepository.save(tema));
	}
	
	@PutMapping // Atualizar dados
	public ResponseEntity<Tema> putTema(@RequestBody Tema tema){ 
		//return ResponseEntity.status(HttpStatus.OK).body(postagemRepository.save(tema));
		
		return temaRepository.findById(tema.getId())
				.map(resposta -> {
					Tema updateTema = temaRepository.save(tema);
					return ResponseEntity.ok().body(updateTema);
				})
				.orElse(ResponseEntity.notFound().build());
	}
	
	@DeleteMapping("/{id}") // DELETE * FROM tb_postagem WHERE id ...;
	public ResponseEntity<?> deletePostagem(@PathVariable long id) {
			
	return temaRepository.findById(id)
			.map(resposta -> {
				temaRepository.deleteById(id);
				return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
			})
			.orElse(ResponseEntity.notFound().build());
	}

}
