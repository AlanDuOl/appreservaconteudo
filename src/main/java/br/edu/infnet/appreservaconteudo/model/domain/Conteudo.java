package br.edu.infnet.appreservaconteudo.model.domain;

public abstract class Conteudo {
	private int Id;
	private String Identificador;
	private boolean Reservado;
	private boolean Retirado;
	private String Titulo;
	
	public String GetIdentificador() {
		return Identificador;
	}
	
	public void SetId(int id) {
		Id = id;
	}
	
	public int GetId() {
		return Id;
	}
	
	public void SetIdentificador(String identificador) {
		Identificador = identificador;
	}
	
	public boolean GetReservado() {
		return Reservado;
	}
	
	public void SetReservado(boolean reservado) {
		Reservado = reservado;
	}
	
	public boolean GetRetirado() {
		return Retirado;
	}
	
	public void SetRetirado(boolean retirado) {
		Retirado = retirado;
	}
	
	public String GetTitulo() {
		return Titulo;
	}
	
	public void SetTitulo(String titulo) {
		Titulo = titulo;
	}
	
	@Override
	public String toString() {
		return "Id: " + Id + "\nTitulo: " + Titulo;
	}
}
