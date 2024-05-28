package br.org.serratec.sistemaBiblioteca.entities;


import java.util.Date;
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
@Table(name = "aluno")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "alunoMatricula", scope = Aluno.class)
public class Aluno {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "aluno_matricula")
	private Integer alunoMatricula;

	@Column(name = "nome")
	private String nome;

	@Column(name = "dat_anascimento")
	private Date dataNascimento;

	@Column(name = "cpf ", unique = true)
	private String cpf;
	@Column(name = "logradouro ")
	private String logradouro;
	@Column(name = "numero_logradouro ")
	private String numeroLogradouro;
	@Column(name = "bairro ")
	private String bairro;
	@Column(name = "cidade ")
	private String cidade;

	
	 @OneToMany(mappedBy = "aluno")
	 private List<Emprestimo> emprestimos;


	public Integer getAlunoMatricula() {
		return alunoMatricula;
	}


	public void setAlunoMatricula(Integer alunoMatricula) {
		this.alunoMatricula = alunoMatricula;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	


	public Date getDataNascimento() {
		return dataNascimento;
	}


	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getLogradouro() {
		return logradouro;
	}


	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}


	public String getNumeroLogradouro() {
		return numeroLogradouro;
	}


	public void setNumeroLogradouro(String numeroLogradouro) {
		this.numeroLogradouro = numeroLogradouro;
	}


	public String getBairro() {
		return bairro;
	}


	public void setBairro(String bairro) {
		this.bairro = bairro;
	}


	public String getCidade() {
		return cidade;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public List<Emprestimo> getEmprestimos() {
		return emprestimos;
	}


	public void setEmprestimos(List<Emprestimo> emprestimos) {
		this.emprestimos = emprestimos;
	}
	


	
	

}
