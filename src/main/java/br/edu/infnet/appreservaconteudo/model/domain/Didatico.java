package br.edu.infnet.appreservaconteudo.model.domain;

import java.time.LocalDate;

public class Didatico extends Conteudo {
	private LocalDate DataConclusao;
	private String Titulo;
	private String Autor;
	
	public Didatico(LocalDate dataConclusao, String titulo, String autor) {
		DataConclusao = dataConclusao;
		Titulo = titulo;
		Autor = autor;
	}

	@Override
	public String toString() {
		return "DADOS DIDATICO\nTítulo: " + Titulo + "\nAutor: " + Autor + "\nData de lançamento: "+ DataConclusao
				+ "\nNúmero de cópias: " + GetNumeroCopiasTotal() + "\nCópias disponíveis: " + GetNumeroCopiasDisponiveis()
				+ "\nIdentificador: " + GetIdentificador();
	}
}
