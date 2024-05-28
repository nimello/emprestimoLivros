package br.org.serratec.sistemaBiblioteca.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.org.serratec.sistemaBiblioteca.entities.Editora;
import br.org.serratec.sistemaBiblioteca.services.EditoraService;

@RestController
@RequestMapping("/editoras")
public class EditoraController {

	@Autowired
	EditoraService editoraService;

	@GetMapping
	public ResponseEntity<List<Editora>> findAll() {
		return new ResponseEntity<>(editoraService.findAll(), HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Editora> findById(@PathVariable Integer id) {
		Editora Editora = editoraService.findById(id);

		if (Editora == null) {
			return new ResponseEntity<>(Editora, HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<>(Editora, HttpStatus.OK);
		}
	}

	@PostMapping
	public ResponseEntity<Editora> save(@RequestBody Editora editora) {
		return new ResponseEntity<>(editoraService.save(editora), HttpStatus.CREATED);
	}

	@PutMapping
	public ResponseEntity<Editora> update(@RequestBody Editora editora) {
		return new ResponseEntity<>(editoraService.update(editora), HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteById(@PathVariable Integer id) {
		boolean EditoraDeletado = editoraService.deleteById(id);
		if (EditoraDeletado) {
			return new ResponseEntity<>(HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

}
