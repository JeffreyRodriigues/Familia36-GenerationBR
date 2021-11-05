package br.org.generation.lojagames.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_produto") // Dizer o nome da tabela
public class Produto {

	// Atributos
	@Id // Chave Primaria
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Auto incremento
	private long id;
	
	@NotNull(message = "O atributo Nome Produto é obrigatório!")
	@Size(min = 10, max = 255, message = "O Nome da Produto deve conter no mínimo 10 caracteres e no máximo 255!")
	private String nome;
	
	@NotNull(message = "O atributo descricao é obrigatório!")
	@Size(min = 10, max = 1000, message = "A descrição deve conter no mínimo 10 caracteres e no máximo 1000!")
	private String descricao;
	
	@NotNull(message = "O atributo console é obrigatório!")
	@Size(min = 10, max = 255, message = "O console deve conter no mínimo 10 caracteres e no máximo 255!")
	private String console;
	
	@NotNull(message = "O atributo quantidade é obrigatório!")
	private long quantidade;
	
	@NotNull(message = "O atributo preço é obrigatório!")
	@Digits(integer=4, fraction=2, message = "O decimal deve conter 6 inteiros e 2 fracionados")
	private BigDecimal preco;
	
	@Size(min = 10, max = 255, message = "O link da foto deve conter no mínimo 10 caracteres e no máximo 255!")
	private String foto;
	
	@ManyToOne //Muitos pra um
	@JsonIgnoreProperties("produto") // Não cria efeito cascata
	private Categoria categoria;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getConsole() {
		return console;
	}

	public void setConsole(String console) {
		this.console = console;
	}

	public long getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(long quantidade) {
		this.quantidade = quantidade;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
}
