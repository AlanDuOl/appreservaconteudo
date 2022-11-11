package br.edu.infnet.appreservaconteudo.model.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import br.edu.infnet.appreservaconteudo.model.domain.Aluno;
import br.edu.infnet.appreservaconteudo.model.domain.Usuario;
import br.edu.infnet.appreservaconteudo.service.AlunoService;

@Order(2)
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
		Usuario usuario = new Usuario("alan", "alan@gmail.com", "12345");
		usuario.setId(1);
		Aluno aluno1 = new Aluno("maria", "2541542", 7, "maria@gmail.com");
		aluno1.setUsuario(usuario);
		Aluno aluno2 = new Aluno("maria alice", "2541542", 7, "malice@gmail.com");
		aluno2.setUsuario(usuario);
		Aluno aluno3 = new Aluno("maria alves", "2541542", 7, "malves@gmail.com");
		aluno3.setUsuario(usuario);
		Aluno aluno4 = new Aluno("alan", "2541542", 7, "alan@gmail.com");
		aluno4.setUsuario(usuario);
		alunoService.Incluir(aluno1);
		alunoService.Incluir(aluno2);
		alunoService.Incluir(aluno3);
		alunoService.Incluir(aluno4);
	}
}
