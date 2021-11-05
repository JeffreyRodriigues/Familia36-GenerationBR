package br.org.generation.lojagames.controller;

import java.math.BigDecimal;
import java.util.List;

import javax.validation.Valid;

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

import br.org.generation.lojagames.model.Produto;
import br.org.generation.lojagames.repository.ProdutoRepository;

@RestController
@RequestMapping("/produto")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@GetMapping 
	public ResponseEntity<List<Produto>> getAll(){
		return ResponseEntity.ok(produtoRepository.findAll());
	}
	
	@GetMapping("/{id}") // indica que é título, e depois o parâmetro
	public ResponseEntity<Produto> getById(@PathVariable long id){ 
		return produtoRepository.findById(id)	
			.map(resp -> ResponseEntity.ok(resp))
			.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/descricao/{descricao}")
	public ResponseEntity<List<Produto>> getByDescricao(@PathVariable String nome) {
		return ResponseEntity.ok(produtoRepository.findAllByNomeContainingIgnoreCase(nome));
	}
	
	@GetMapping("/preco_maior/{preco}")
	public ResponseEntity<List<Produto>> getPrecoMaiorQue(@PathVariable BigDecimal preco){
		return ResponseEntity.ok(produtoRepository.findByPrecoGreaterThanOrderByPreco(preco));
		// Consulta pelo preço maior que o digitado em ordem crescente
	}
	
	@GetMapping("/preco_menor/{preco}")
	public ResponseEntity<List<Produto>> getPrecoMenorQue(@PathVariable BigDecimal preco){
		return ResponseEntity.ok(produtoRepository.findByPrecoLessThanOrderByPrecoDesc(preco));
		// Consulta pelo preço menor que o digitado em ordem decrescente
	}
	
	
	@Valid
	@PostMapping // Inserir dados
	public ResponseEntity<Produto> post/*Tema*/(@RequestBody Produto produto){ 
		//pega o conteúdo do corpo da requisição e transforma em objeto do tipo postagem
		return ResponseEntity.status(HttpStatus.CREATED).body(produtoRepository.save(produto));
	}
	
	@Valid
	@PutMapping // Atualizar dados
	public ResponseEntity<Produto> putTema(@RequestBody Produto produto){ 
		//return ResponseEntity.status(HttpStatus.OK).body(postagemRepository.save(tema));
		
		return produtoRepository.findById(produto.getId())
				.map(resposta -> {
					Produto updateProduto = produtoRepository.save(produto);
					return ResponseEntity.ok().body(updateProduto);
				})
				.orElse(ResponseEntity.notFound().build());
	}
	
	@DeleteMapping("/{id}") // DELETE * FROM tb_postagem WHERE id ...;
	public ResponseEntity<?> deletePostagem(@PathVariable long id) {
			
	return produtoRepository.findById(id)
			.map(resposta -> {
				produtoRepository.deleteById(id);
				return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
			})
			.orElse(ResponseEntity.notFound().build());
	}

}

