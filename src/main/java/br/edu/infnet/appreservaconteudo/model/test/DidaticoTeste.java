package br.edu.infnet.appreservaconteudo.model.test;

import java.time.LocalDate;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import br.edu.infnet.appreservaconteudo.model.domain.Conteudo;
import br.edu.infnet.appreservaconteudo.model.domain.Didatico;

@Component
public class DidaticoTeste implements ApplicationRunner {
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		TestetoString();
	}
	
	private void TestetoString() {
		//arrange
		LocalDate dataConclusaoEsperado = LocalDate.of(2010, 10, 13);
		String tituloEsperado = "Titulo teste";
		String autorEsperado = "Fula de tal";
		String identificadorEsperado = "3413413";
		int numeroCopiasEsperado = 12;
		int numeroCopiasDisponiveisEsperado = 12;
		
		//act
		Conteudo didaticoTeste = new Didatico(dataConclusaoEsperado, tituloEsperado, autorEsperado);
		didaticoTeste.SetIdentificador(identificadorEsperado);
		didaticoTeste.SetNumeroCopiasTotal(numeroCopiasEsperado);
		didaticoTeste.SetNumeroCopiasDisponiveis(numeroCopiasDisponiveisEsperado);
		
		// act
		System.out.println(didaticoTeste.toString());
	}
}
