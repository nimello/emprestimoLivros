package br.org.serratec.sistemaBiblioteca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.serratec.sistemaBiblioteca.entities.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Integer> {

}
