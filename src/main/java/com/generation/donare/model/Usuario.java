package com.generation.donare.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name ="tb_usuarios")
public class Usuario {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O campo nome é obrigatório.")
	@Size(min = 5, max = 255, message = "O nome deve conter de 5 a 255 caracteres.")
	private String nome;
	
	@NotBlank(message = "O campo usuário é obrigatório.")
	@Size(min = 3, max = 255, message = "O usuário deve conter de 3 a 255 caracteres.")
	private String usuario;
	
	@NotBlank(message = "O campo senha é obrigatório.")
	@Size(min = 8, max = 255, message = "A senha deve conter de 5 a 255 caracteres.")
	private String senha;
	
	private String foto;
	
	@NotBlank(message = "O campo nickname é obrigatório.")
	@Size(min = 10, max = 255, message = "O Nickname deve conter de 10 a 255 caracteres.")
	private String nickname;
	
	
	@NotBlank(message = "O campo tipo é obrigatório.")
	@Size(min = 11, max = 45, message = "O tipo deve conter de 11 a 45 caracteres.")
	private int tipo;
	
	@OneToMany(mappedBy="usuario",cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties("usuario")
	private List<Postagem> postagens;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsuario() {
		return usuario;
	}


	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}


	public String getFoto() {
		return foto;
	}


	public void setFoto(String foto) {
		this.foto = foto;
	}


	public String getNickname() {
		return nickname;
	}


	public void setNickname(String nickname) {
		this.nickname = nickname;
	}


	public int getTipo() {
		return tipo;
	}


	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public List<Postagem> getPostagens() {
		return postagens;
	}

	public void setPostagens(List<Postagem> postagens) {
		this.postagens = postagens;
	}
	
	
}
