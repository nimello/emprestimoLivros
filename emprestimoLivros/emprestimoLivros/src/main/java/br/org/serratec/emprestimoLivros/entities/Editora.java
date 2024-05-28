package br.org.serratec.sistemaBiblioteca.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "editora")
//@JsonIdentityInfo(
//		generator = ObjectIdGenerators.PropertyGenerator.class,
//		property = "editoraId",
//		scope = Editora.class
//)
public class Editora {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "editora_id")
	private Integer editoraId;

	@Column(name = "nome")
	private String nome;
	@Column(name = "imagem_nome")
	private String imagemNome;
	@Column(name = "imagem_filename")
	private String imagemFileName;
	@Column(name = "imagem_url")
	private String imagemUrl;

	@OneToMany(mappedBy = "editora")
	private List<Livro> livros;

	public Integer getEditoraId() {
		return editoraId;
	}

	public void setEditoraId(Integer editoraId) {
		this.editoraId = editoraId;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getImagemNome() {
		return imagemNome;
	}

	public void setImagemNome(String imagemNome) {
		this.imagemNome = imagemNome;
	}

	public String getImagemFileName() {
		return imagemFileName;
	}

	public void setImagemFileName(String imagemFileName) {
		this.imagemFileName = imagemFileName;
	}

	public String getImagemUrl() {
		return imagemUrl;
	}

	public void setImagemUrl(String imagemUrl) {
		this.imagemUrl = imagemUrl;
	}

}
