package com.generation.donare.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_postagens")
public class Postagem {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Size(min = 5 , max = 100, message = "O título deve conter de 5 a 100 caracteres.")
	private String titulo;
	
	@NotBlank(message = "O campo texto é obrigatório.")
	@Size(min = 10, max = 1000, message = "O texto deve conter de 10 a 1000 caracteres.")
	private String texto;
	
	private int curtidas;
	
	private String imagem;
	
	private String marcacao;
	
	private String doacao;
	
	@ManyToOne
	@JsonIgnoreProperties("postagens")
	private Tema tema;
	
	@ManyToOne
	@JsonIgnoreProperties("postagens")
	private Usuario usuario;

	public Long getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getTexto() {
		return texto;
	}

	public int getCurtidas() {
		return curtidas;
	}

	public String getImagem() {
		return imagem;
	}

	public String getMarcacao() {
		return marcacao;
	}

	public String getDoacao() {
		return doacao;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public void setCurtidas(int curtidas) {
		this.curtidas = curtidas;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	public void setMarcacao(String marcacao) {
		this.marcacao = marcacao;
	}

	public void setDoacao(String doacao) {
		this.doacao = doacao;
	}

	public Tema getTema() {
		return tema;
	}

	public void setTema(Tema tema) {
		this.tema = tema;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
}
