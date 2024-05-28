package br.org.serratec.sistemaBiblioteca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.serratec.sistemaBiblioteca.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

}
