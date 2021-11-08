package br.org.generation.farmacia.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_categorias")
public class Categoria {

	@Id //primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto incremento
	private long id;
	
	/**
	 * @NotBlank é utilizada para validar se o campo não está vazio.
	 */
	@NotBlank(message="Categoria é obrigatório, não pode ser nulo, nem vazio.")
	private String categoria;
	
	private String descricao;
	
	@OneToMany(mappedBy ="categoria", cascade = CascadeType.ALL) //relacionamento um para muitos categoria do produto
	@JsonIgnoreProperties("categoria")
	private List<Produto>produto;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Produto> getProduto() {
		return produto;
	}

	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}

}
