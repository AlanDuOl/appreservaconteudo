package br.edu.infnet.appreservaconteudo.model.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Table(name = "tconteudo")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Conteudo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
