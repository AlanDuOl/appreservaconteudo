package br.edu.infnet.appreservaconteudo.model.domain;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	private String Nome;
	private String Matricula;
	private Integer QuantidadeMaximaConteudosEmprestados;
	private List<Conteudo> ConteudosEmprestados;
	
	public Aluno(String nome, String matricula, int quantidadeMaximaConteudosEmprestados) {
		Nome = nome;
		Matricula = matricula;
		QuantidadeMaximaConteudosEmprestados = quantidadeMaximaConteudosEmprestados;
		ConteudosEmprestados = new ArrayList<Conteudo>();
	}
	
	public String GetNome() {
		return Nome;
	}
	
	public String GetMatricula() {
		return Matricula;
	}
	
	public Boolean PodeFazerEmprestimoNaBiblioteca() {
		return ConteudosEmprestados.size() < QuantidadeMaximaConteudosEmprestados;
	}
}
