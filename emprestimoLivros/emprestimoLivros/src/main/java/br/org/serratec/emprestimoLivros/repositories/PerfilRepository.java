package br.org.serratec.sistemaBiblioteca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.serratec.sistemaBiblioteca.entities.Perfil;

public interface PerfilRepository extends JpaRepository<Perfil, Integer> {

}
