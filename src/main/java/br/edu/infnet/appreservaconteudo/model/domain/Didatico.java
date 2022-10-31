package br.edu.infnet.appreservaconteudo.model.domain;

import java.time.LocalDate;

public class Didatico extends Conteudo {
	private LocalDate DataConclusao;
	private String Autor;
	
	public Didatico(LocalDate dataConclusao, String autor) {
		DataConclusao = dataConclusao;
		Autor = autor;
	}
	
	public LocalDate GetDataConclusao() {
		return DataConclusao;
	}

	public String GetAutor() {
		return Autor;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nDADOS DIDATICO" + "\nAutor: " + Autor + "\nData de lançamento: "+ DataConclusao
				+ "\nReservado: " + GetReservado() + "\nRetirado: " + GetRetirado()
				+ "\nIdentificador: " + GetIdentificador();
	}
}
