package br.org.generation.lojagames.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.org.generation.lojagames.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	
	public List <Produto> findAllByNomeContainingIgnoreCase (String nome);

	
	 
	public List <Produto> findByPrecoGreaterThanOrderByPreco(BigDecimal preco);
	
	/* 
	 
	 Preço em ordem crescente maior que o digitado	   
	 
	 MySQL: select * from tb_produtos where preco > preco order by preco;
	 
	 */
	
	 
	public List <Produto> findByPrecoLessThanOrderByPrecoDesc(BigDecimal preco);
	
	/* 
	 
	 Preço em ordem crescente menor que o digitado	   
	 
	 MySQL: select * from tb_produtos where preco < preco order by preco desc;
	 
	 */
}
