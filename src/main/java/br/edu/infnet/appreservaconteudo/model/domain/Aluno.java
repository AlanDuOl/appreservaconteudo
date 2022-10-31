package br.edu.infnet.appreservaconteudo.model.domain;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	private int Id;
	private String Nome;
	private String Matricula;
	private int QuantidadeMaximaConteudosEmprestados;
	private List<Conteudo> ConteudosEmprestados;
	private List<Reserva> Reservas;
	
	public Aluno(String nome, String matricula, int quantidadeMaximaConteudosEmprestados) {
		Nome = nome;
		Matricula = matricula;
		QuantidadeMaximaConteudosEmprestados = quantidadeMaximaConteudosEmprestados;
		ConteudosEmprestados = new ArrayList<Conteudo>();
		Reservas = new ArrayList<Reserva>();
	}
	
	public int GetId() {
		return Id;
	}
	
	public void SetId(int id) {
		Id = id;
	}
	
	public String GetNome() {
		return Nome;
	}
	
	public String GetMatricula() {
		return Matricula;
	}
	
	public List<Conteudo> GetConteudosEmprestados(){
		return ConteudosEmprestados;
	}
	
	public List<Reserva> GetReservas(){
		return Reservas;
	}
	
	public Boolean PodeFazerReserva() {
		return ConteudosEmprestados.size() < QuantidadeMaximaConteudosEmprestados;
	}
	
	public void AdicionarConteudo(Conteudo conteudo) {
		if (ConteudosEmprestados.size() < QuantidadeMaximaConteudosEmprestados) {
			ConteudosEmprestados.add(conteudo);
		}
	}
	
	public void RemoverConteudo(Conteudo conteudo) {
		int index = ConteudosEmprestados.indexOf(conteudo);
		ConteudosEmprestados.remove(index);
	}
	
	@Override
	public String toString() {
		return "DADOS ALUNO\nNome: " + Nome + "\nMatricula: " + Matricula
				+ "\nMáximo de conteúdos emprestados: " + QuantidadeMaximaConteudosEmprestados
				+ "\nConteudos emprestados: " + ConteudosEmprestados;
	}
}
