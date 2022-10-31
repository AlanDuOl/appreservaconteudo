package br.edu.infnet.appreservaconteudo.model.test;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import br.edu.infnet.appreservaconteudo.controller.AlunoController;
import br.edu.infnet.appreservaconteudo.model.domain.Aluno;

@Component
public class AlunoTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		TestetoString();
		PopularLista();
	}
	
	private void TestetoString() {
		//arrange
		String nomeEsperado = "alan";
		String matriculaEsperada = "12548745";
		Integer quantidadeMaximaConteudosEmprestadosEsperada = 5;
		
		//act
		Aluno alunoTeste = new Aluno(nomeEsperado, matriculaEsperada, quantidadeMaximaConteudosEmprestadosEsperada);
		
		// act
		System.out.println(alunoTeste.toString());
	}
	
	private void PopularLista() {
		Aluno aluno1 = new Aluno("maria", "2541542", 7);
		Aluno aluno2 = new Aluno("Alan", "5498766", 5);
		Aluno aluno3 = new Aluno("Lucia Cavalcanti", "2845039", 8);
		AlunoController.Incluir(aluno1);
		AlunoController.Incluir(aluno2);
		AlunoController.Incluir(aluno3);
	}
}
