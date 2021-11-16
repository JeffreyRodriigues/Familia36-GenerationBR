package br.org.generation.blogpessoal.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.org.generation.blogpessoal.model.Postagem;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long>{
	
	public Optional<Postagem> findByTitulo(String postagem);
	
	public List <Postagem> findAllByTituloContainingIgnoreCase(String titulo);
	// SELECT * FROM tb_postagens WHERE titulo LIKE "%titulo%";
}
