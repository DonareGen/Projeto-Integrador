package com.generation.donare.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.donare.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	public List<Usuario> findAllByNomeContainingIgnoreCase(String nome);

	public List<Usuario> findAllByNicknameContainingIgnoreCase(String nickname);

	public Optional<Usuario> findByUsuario(String usuario);

}
