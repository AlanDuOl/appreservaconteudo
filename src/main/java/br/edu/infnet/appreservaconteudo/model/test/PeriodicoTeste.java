package br.edu.infnet.appreservaconteudo.model.test;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import br.edu.infnet.appreservaconteudo.model.domain.Conteudo;
import br.edu.infnet.appreservaconteudo.model.domain.Periodico;

@Component
public class PeriodicoTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		TestetoString();
	}
	
	private void TestetoString() {
		//arrange
		String tituloEsperado = "Titulo teste";
		String edicaoEsperado = "125";
		String nomeEsperado = "Revista A";
		String identificadorEsperado = "3413413";
		int numeroCopiasEsperado = 12;
		int numeroCopiasDisponiveisEsperado = 12;
		
		//act
		Conteudo periodicoTeste = new Periodico(tituloEsperado, edicaoEsperado, nomeEsperado);
		periodicoTeste.SetIdentificador(identificadorEsperado);
		periodicoTeste.SetNumeroCopiasTotal(numeroCopiasEsperado);
		periodicoTeste.SetNumeroCopiasDisponiveis(numeroCopiasDisponiveisEsperado);
		
		// act
		System.out.println(periodicoTeste.toString());
	}
	
}
