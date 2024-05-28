package br.org.serratec.sistemaBiblioteca.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.org.serratec.sistemaBiblioteca.entities.Editora;
import br.org.serratec.sistemaBiblioteca.repositories.EditoraRepository;

@Service
public class EditoraService {

	@Autowired
	EditoraRepository EditoraRepository;

	public List<Editora> findAll() {
		return EditoraRepository.findAll();
	}

	public Editora findById(Integer id) {
		return EditoraRepository.findById(id).orElse(null);
	}

	public Editora save(Editora Editora) {
		return EditoraRepository.save(Editora);
	}

	public Editora update(Editora Editora) {
		return EditoraRepository.save(Editora);
	}

	public boolean deleteById(Integer id) {
		if (EditoraRepository.existsById(id)) {
			EditoraRepository.deleteById(id);
			Editora EditoraDeletado = EditoraRepository.findById(id).orElse(null);
			if (EditoraDeletado == null) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	public long count() {
		return EditoraRepository.count();
	}
}
