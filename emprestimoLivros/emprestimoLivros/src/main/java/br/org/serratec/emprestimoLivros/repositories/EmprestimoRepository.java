package br.org.serratec.sistemaBiblioteca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.serratec.sistemaBiblioteca.entities.Emprestimo;

public interface EmprestimoRepository extends JpaRepository<Emprestimo, Integer> {

}
