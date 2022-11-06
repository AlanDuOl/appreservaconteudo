package br.edu.infnet.appreservaconteudo.model.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tusuario")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nome;
	private String email;
	private String senha;
	@OneToMany
	@JoinColumn(name = "idUsuario")
	private List<Aluno> alunos;
	
	public Usuario() {}
	
	public Usuario(String nome, String email, String senha) {
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		alunos = new ArrayList<Aluno>();
	}
	
	public int GetId() {
		return id;
	}
	
	public String GetNome() {
		return nome;
	}
	
	public String GetEmail() {
		return email;
	}
	
	public String GetSenha() {
		return senha;
	}
	
	@Override
	public String toString() {
		return "DADOS USUARIO\nNome: " + nome + "\nEmail: " + email
				+ "\nSenha: " + senha;
	}
}
