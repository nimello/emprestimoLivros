package br.org.serratec.sistemaBiblioteca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.serratec.sistemaBiblioteca.entities.Livro;

public interface LivroRepository extends JpaRepository<Livro, Integer> {

}
