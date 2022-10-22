package br.edu.infnet.appreservaconteudo.model.domain;

public class Periodico extends Conteudo {
	private String Edicao;
	private String Titulo;
	private String Nome;
	
	public Periodico(String titulo, String edicao, String nome) {
		Titulo = titulo;
		Edicao = edicao;
		Nome = nome;
	}

	@Override
	public String toString() {
		return "DADOS PERIODICO\nNome: " + Nome + "Título: " + Titulo + "\nNome: " + Nome + "\nEdicao: " + Edicao
				+ "\nNúmero de cópias: " + GetNumeroCopiasTotal() + "\nCópias disponíveis: "
				+ GetNumeroCopiasDisponiveis() + "\nIdentificador: " + GetIdentificador();
	}
}
