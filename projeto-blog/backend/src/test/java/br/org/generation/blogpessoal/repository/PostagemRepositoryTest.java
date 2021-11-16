package br.org.generation.blogpessoal.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

import br.org.generation.blogpessoal.model.Postagem;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class PostagemRepositoryTest {
	
	@Autowired
	private PostagemRepository postagemRepository;
	
	@BeforeAll
	void start() { //id, titulo, texto
		
		postagemRepository.save(new Postagem(0L, "As Cronicas de Narnia I", "texto texto texto texto texto texto texto texto"));
		
		postagemRepository.save(new Postagem(0L, "As Cronicas de Narnia II", "texto texto texto texto texto texto texto texto"));
		
		postagemRepository.save(new Postagem(0L, "Nudge", "texto texto texto texto texto texto texto texto"));
		
		postagemRepository.save(new Postagem(0L, "A Grande Controvérsia", "texto texto texto texto texto texto texto texto"));
		
	}
	
	@Test
	@DisplayName("Retorna 1 postagem por título")
	public void deveRetornarUmaPostagem() {
		
		Optional<Postagem> postagem = postagemRepository.findByTitulo("Nudge");
		assertTrue(postagem.get().getTitulo().equals("Nudge"));	
	}
	
	@Test
	@DisplayName("Retorna 3 postagens por titulo")
	public void deveRetornarTresPostagens() {
		
		List<Postagem> listadePostagens = postagemRepository.findAllByTituloContainingIgnoreCase("Cronicas");
		assertEquals(2, listadePostagens.size());
		assertTrue(listadePostagens.get(0).getTitulo().equals("As Cronicas de Narnia I"));
		assertTrue(listadePostagens.get(1).getTitulo().equals("As Cronicas de Narnia II"));
	}

}
