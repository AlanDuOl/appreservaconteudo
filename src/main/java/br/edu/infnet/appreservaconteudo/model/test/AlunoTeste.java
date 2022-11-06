package br.edu.infnet.appreservaconteudo.model.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import br.edu.infnet.appreservaconteudo.model.domain.Aluno;
import br.edu.infnet.appreservaconteudo.service.AlunoService;

@Component
public class AlunoTeste implements ApplicationRunner {

	@Autowired
	private AlunoService alunoService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		TestetoString();
		PopularLista();
	}
	
	private void TestetoString() {
		//arrange
		String nomeEsperado = "alan";
		String matriculaEsperada = "12548745";
		String emailEsperado = "alan@gmail.com";
		Integer quantidadeMaximaConteudosEmprestadosEsperada = 5;
		
		//act
		Aluno alunoTeste = new Aluno(nomeEsperado, matriculaEsperada, quantidadeMaximaConteudosEmprestadosEsperada, emailEsperado);
		
		// act
		System.out.println(alunoTeste.toString());
	}
	
	private void PopularLista() {
		Aluno aluno1 = new Aluno("maria", "2541542", 7, "maria@gmail.com");
		Aluno aluno2 = new Aluno("Alan", "5498766", 5, "alan@gmail.com");
		Aluno aluno3 = new Aluno("Lucia Cavalcanti", "2845039", 8, "lucia@gmail.com");
		alunoService.Incluir(aluno1);
		alunoService.Incluir(aluno2);
		alunoService.Incluir(aluno3);
	}
}
