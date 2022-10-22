package br.edu.infnet.appreservaconteudo.model.domain;

public abstract class Conteudo {
	private String Identificador;
	private int NumeroCopiasTotal;
	private int NumeroCopiasDisponiveis;
	
	public Boolean DisponivelParaLocacao() {
		return NumeroCopiasDisponiveis > 0;
	}
	
	public String GetIdentificador() {
		return Identificador;
	}
	
	public void SetIdentificador(String identificador) {
		Identificador = identificador;
	}
	
	public int GetNumeroCopiasTotal() {
		return NumeroCopiasTotal;
	}
	
	public void SetNumeroCopiasTotal(int numeroCopias) {
		NumeroCopiasTotal = numeroCopias;
	}
	
	public int GetNumeroCopiasDisponiveis() {
		return NumeroCopiasDisponiveis;
	}
	
	public void SetNumeroCopiasDisponiveis(int numeroCopiasDisponiveis) {
		NumeroCopiasDisponiveis = numeroCopiasDisponiveis;
	}
}
