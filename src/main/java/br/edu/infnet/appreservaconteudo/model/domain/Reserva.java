package br.edu.infnet.appreservaconteudo.model.domain;

import java.util.List;

public class Reserva {
	private List<Conteudo> Conteudo;
	private Aluno Aluno;
	
	public void AdicionarConteudo(Conteudo conteudo) {
		if (conteudo.DisponivelParaLocacao() && Aluno.PodeFazerReserva()) {
			Conteudo.add(conteudo);
			Aluno.AdicionarConteudo(conteudo);
		}
		else {
			throw new Error(conteudo.DisponivelParaLocacao() ? "Aluno já atingiu o limite de couteúdos para reserva!" : "Conteúdo não disponível para reserva!");
		}
	}
	
	public void RemoverConteudo(Conteudo conteudo) {
		int index = Conteudo.indexOf(conteudo);
		Conteudo.remove(index);
		Aluno.RemoverConteudo(conteudo);
	}
	
	public void Finalizar() {
		//TODO: salvar dados no banco
	}
}
