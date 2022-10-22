package br.edu.infnet.appreservaconteudo.model.test;

import java.time.LocalDate;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import br.edu.infnet.appreservaconteudo.model.domain.Conteudo;
import br.edu.infnet.appreservaconteudo.model.domain.Livro;

@Component
public class LivroTeste implements ApplicationRunner {
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		TestetoString();
	}
	
	private void TestetoString() {
		//arrange
		LocalDate dataPublicacaoEsperado = LocalDate.of(2010, 10, 13);
		String tituloEsperado = "Titulo teste";
		String autorEsperado = "Fula de tal";
		String editoraEsperada = "Editora A";
		String identificadorEsperado = "3413413";
		int numeroCopiasEsperado = 12;
		int numeroCopiasDisponiveisEsperado = 12;
		
		//act
		Conteudo livroTeste = new Livro(dataPublicacaoEsperado, tituloEsperado, autorEsperado, editoraEsperada);
		livroTeste.SetIdentificador(identificadorEsperado);
		livroTeste.SetNumeroCopiasTotal(numeroCopiasEsperado);
		livroTeste.SetNumeroCopiasDisponiveis(numeroCopiasDisponiveisEsperado);
		
		// act
		System.out.println(livroTeste.toString());
	}
	
}
