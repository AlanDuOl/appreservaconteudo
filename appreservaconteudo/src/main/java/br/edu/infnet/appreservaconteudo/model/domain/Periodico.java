package br.edu.infnet.appreservaconteudo.model.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tperiodico")
public class Periodico extends Conteudo {
	private String edicao;
	private String nome;
	
	public Periodico() {}
	
	public Periodico(String edicao, String nome) {
		this.edicao = edicao;
		this.nome = nome;
	}

	
	public String getEdicao() {
		return edicao;
	}

	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Periodico [Edicao=" + edicao + ", Nome=" + nome + ", getId()=" + getId() + ", getReservas()="
				+ getReservas() + ", getUsuario()=" + getUsuario() + ", getTitulo()=" + getTitulo() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
}
