package br.edu.infnet.appreservaconteudo.model.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tperiodico")
public class Periodico extends Conteudo {
	private String Edicao;
	private String Nome;
	
	public Periodico() {}
	
	public Periodico(String edicao, String nome) {
		Edicao = edicao;
		Nome = nome;
	}
	
	public String GetEdicao() {
		return Edicao;
	}

	public String GetNome() {
		return Nome;
	}

	@Override
	public String toString() {
		return super.toString() + "\nDADOS PERIODICO\nNome: " + Nome + "\nNome: " + Nome + "\nEdicao: " + Edicao
				+ "\nReservado: " + GetReservado() + "\nRetirado: "
				+ GetRetirado() + "\nIdentificador: " + GetIdentificador();
	}
}
