package br.edu.infnet.appreservaconteudo.model.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "taluno")
public class Aluno {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nome;
	private String matricula;
	private String email;
	private int quantidadeMaximaConteudosEmprestados;
	@ManyToOne
	@JoinColumn(name = "idUsuario")
	private Usuario usuario;

	public Aluno() {
	}

	public Aluno(String nome, String matricula, int quantidadeMaximaConteudosEmprestados, String email) {
		this.nome = nome;
		this.matricula = matricula;
		this.quantidadeMaximaConteudosEmprestados = quantidadeMaximaConteudosEmprestados;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getQuantidadeMaximaConteudosEmprestados() {
		return quantidadeMaximaConteudosEmprestados;
	}

	public void setQuantidadeMaximaConteudosEmprestados(int quantidadeMaximaConteudosEmprestados) {
		this.quantidadeMaximaConteudosEmprestados = quantidadeMaximaConteudosEmprestados;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "DADOS ALUNO\nNome: " + nome + "\nMatricula: " + matricula + "\nEmail: " + email
				+ "\nMáximo de conteúdos emprestados: " + quantidadeMaximaConteudosEmprestados;
	}
}
