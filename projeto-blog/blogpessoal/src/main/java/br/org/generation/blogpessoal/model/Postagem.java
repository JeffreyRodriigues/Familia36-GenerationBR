package br.org.generation.blogpessoal.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity //Gerando a tabela
@Table(name = "tb_postagens") // Definindo o nome da Tabela
public class Postagem {
	
	@Id //Chave primária
	@GeneratedValue(strategy = GenerationType.IDENTITY)  //Gerando o auto incremento apartir do 1
	private long id;
	
	@NotNull(message = "O título é obrigatório") //É obrigatório digitar
	@Size(min = 5, max = 100, message = "O título deve conter no mínimo 5 e no máximo 100 caracteres")//Tamanho mínimo e máximo para o título
	private String titulo;
	
	@NotNull(message = "O texto é obrigatório") //É obrigatório digitar
	@Size(min = 10, max = 1000, message = "O texto deve conter no mínimo 10 e no máximo 1000 caracteres")//Tamanho mínimo e máximo para o título
	private String texto;
	
	@Temporal(TemporalType.TIMESTAMP) //Definindo o atributo data
	private Date data = new java.sql.Date(System.currentTimeMillis());
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	
	

}
