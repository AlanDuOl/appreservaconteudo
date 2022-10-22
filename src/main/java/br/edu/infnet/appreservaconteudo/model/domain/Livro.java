package br.edu.infnet.appreservaconteudo.model.domain;

import java.time.LocalDate;

public class Livro extends Conteudo {
	private LocalDate DataPublicacao;
	private String Titulo;
	private String Autor;
	private String Editora;
	
	public Livro(LocalDate dataPublicacao, String titulo, String autor, String editora) {
		DataPublicacao = dataPublicacao;
		Titulo = titulo;
		Autor = autor;
		Editora = editora;
	}
	
	@Override
	public String toString() {
		return "DADOS LIVRO\nTítulo: " + Titulo + "\nAutor: " + Autor + "\nData de publicação: " + DataPublicacao
				+ "\nEditora: " + Editora + "\nNúmero de cópias: " + GetNumeroCopiasTotal()
				+ "\nCópias disponíveis: " + GetNumeroCopiasDisponiveis() + "\nIdentificador: " + GetIdentificador();
	}
}
