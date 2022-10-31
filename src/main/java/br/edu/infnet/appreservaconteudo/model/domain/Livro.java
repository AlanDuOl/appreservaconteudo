package br.edu.infnet.appreservaconteudo.model.domain;

import java.time.LocalDate;

public class Livro extends Conteudo {
	private LocalDate DataPublicacao;
	private String Autor;
	private String Editora;
	
	public Livro(LocalDate dataPublicacao, String autor, String editora) {
		DataPublicacao = dataPublicacao;
		Autor = autor;
		Editora = editora;
	}
	
	public LocalDate GetDataPublicacao() {
		return DataPublicacao;
	}
	
	public void SetDataPublicacao(LocalDate dataPublicacao) {
		DataPublicacao = dataPublicacao;
	}
	
	public String GetAutor() {
		return Autor;
	}
	
	public void SetAutor(String autor) {
		Autor = autor;
	}
	
	public String GetEditora() {
		return Editora;
	}
	
	public void SetReservado(String editora) {
		Editora = editora;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nDADOS LIVRO\nTítulo: " + GetTitulo() + "\nAutor: " + Autor + "\nData de publicação: " + DataPublicacao
				+ "\nEditora: " + Editora + "\nReservado: " + GetReservado()
				+ "\nRetirado: " + GetRetirado() + "\nIdentificador: " + GetIdentificador();
	}
}
