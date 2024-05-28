package br.org.serratec.sistemaBiblioteca.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.org.serratec.sistemaBiblioteca.entities.Livro;
import br.org.serratec.sistemaBiblioteca.repositories.LivroRepository;

@Service
public class LivroService {
	
	@Autowired
	LivroRepository livroRepository;

	public List<Livro> findAll() {
		return livroRepository.findAll();
	}

	public Livro findById(Integer id) {
		return livroRepository.findById(id).orElse(null);
	}

	public Livro save(Livro livro) {
		return livroRepository.save(livro);
	}

	public Livro update(Livro livro) {
		return livroRepository.save(livro);
	}
	
	public boolean deleteById(Integer id) {
		if (livroRepository.existsById(id)) {
			livroRepository.deleteById(id);
			Livro livroDeletado = livroRepository.findById(id).orElse(null);
			if (livroDeletado == null) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
	
	public long count() {
		return livroRepository.count();
	}
	
	
	
	
	
	
}
