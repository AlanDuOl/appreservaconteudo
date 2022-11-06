package br.edu.infnet.appreservaconteudo.model.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

//@Entity
//@Table(name = "treserva")
public class Reserva {
	//@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	private LocalDate DataReserva;
	private String Descricao;
	@Transient
	private List<Conteudo> Conteudos;
	@Transient
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
	}
	
	public void RemoverConteudo(Conteudo conteudo) {
		int index = Conteudos.indexOf(conteudo);
		Conteudos.remove(index);
	}
	
	public void Finalizar() {
		DataReserva = LocalDate.now();
		//TODO: verificar se conteudos estao disponiveis para locacao
		//TODO: salvar dados no banco
	}
	
	@Override
	public String toString() {
		return "DADOS RESERVA" + "\nId: " + Id + "\nData Reserva: " + DataReserva + "\nDescição: " + Descricao + "\nConteudos: " + Conteudos.size() + "\nAluno: " + Aluno.getMatricula();
	}
}
