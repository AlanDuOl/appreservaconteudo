package br.edu.infnet.appreservaconteudo.model.domain;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tdidatico")
public class Didatico extends Conteudo {
	private LocalDate dataConclusao;
	private String autor;
	
	public Didatico() {}
	
	public Didatico(LocalDate dataConclusao, String autor) {
		this.dataConclusao = dataConclusao;
		this.autor = autor;
	}
	
	public LocalDate getDataConclusao() {
		return dataConclusao;
	}

	public void setDataConclusao(String dataConclusao) {
		this.dataConclusao = LocalDate.parse(dataConclusao);
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Didatico [DataConclusao=" + dataConclusao + ", Autor=" + autor + ", getId()=" + getId()
				+ ", getReservas()=" + getReservas() + ", getUsuario()=" + getUsuario() + ", getTitulo()=" + getTitulo()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
}
