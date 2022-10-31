package br.edu.infnet.appreservaconteudo.model.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Reserva {
	private int Id;
	private LocalDate DataReserva;
	private String Descricao;
	private List<Conteudo> Conteudos;
	private Aluno Aluno;
	
	public Reserva() {}
	
	public Reserva(Aluno aluno, String descricao, LocalDate dataReserva) {
		Aluno = aluno;
		Conteudos = new ArrayList<Conteudo>();
		Descricao = descricao;
		DataReserva = dataReserva;
	}
	
	public List<Conteudo> GetConteudos(){
		return Conteudos;
	}
	
	public Aluno GetAluno() {
		return Aluno;
	}
	
	public String GetDescricao() {
		return Descricao;
	}
	
	public LocalDate GetDataReserva() {
		return DataReserva;
	}
	
	public int GetId() {
		return Id;
	}
	
	public void SetId(int id) {
		Id = id;
	}
	
	public List<Conteudo> ObterConteudos(){
		return Conteudos;
	}
	
	public void AdicionarConteudo(Conteudo conteudo) {
		//TODO: checar se produto ainda pode ser adicionado
		Conteudos.add(conteudo);
		Aluno.AdicionarConteudo(conteudo);
	}
	
	public void RemoverConteudo(Conteudo conteudo) {
		int index = Conteudos.indexOf(conteudo);
		Conteudos.remove(index);
		Aluno.RemoverConteudo(conteudo);
	}
	
	public void Finalizar() {
		DataReserva = LocalDate.now();
		//TODO: verificar se conteudos estao disponiveis para locacao
		//TODO: salvar dados no banco
	}
	
	@Override
	public String toString() {
		return "DADOS RESERVA" + "\nId: " + Id + "\nData Reserva: " + DataReserva + "\nDescição: " + Descricao + "\nConteudos: " + Conteudos.size() + "\nAluno: " + Aluno.GetMatricula();
	}
}
