package br.edu.infnet.appreservaconteudo.model.test;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appreservaconteudo.model.domain.Aluno;

@Component
public class AlunoTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		TestetoString();
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
	
}
