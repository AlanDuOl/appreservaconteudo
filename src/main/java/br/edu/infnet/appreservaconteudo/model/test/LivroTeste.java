package br.edu.infnet.appreservaconteudo.model.test;

import java.time.LocalDate;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import br.edu.infnet.appreservaconteudo.controller.LivroController;
import br.edu.infnet.appreservaconteudo.model.domain.Livro;

@Component
public class LivroTeste implements ApplicationRunner {
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		PopularListaLivros();
		TestetoString();
	}
	
	private void TestetoString() {
		//arrange
		LocalDate dataPublicacaoEsperado = LocalDate.of(2010, 10, 13);
		String tituloEsperado = "Titulo teste";
		String autorEsperado = "Fula de tal";
		String editoraEsperada = "Editora A";
		String identificadorEsperado = "3413413";
		
		//act
		Livro livroTeste = new Livro(dataPublicacaoEsperado, autorEsperado, editoraEsperada);
		livroTeste.SetTitulo(tituloEsperado);
		livroTeste.SetIdentificador(identificadorEsperado);
		
		// act
		System.out.println(livroTeste.toString());
	}
	
	private void PopularListaLivros() {
		Livro livro1 = new Livro(LocalDate.of(1987, 7, 21), "R. J. Sales", "Spring");
		livro1.SetTitulo("Aves do deserto");
		Livro livro2 = new Livro(LocalDate.of(1999, 3, 12), "Campos B. Brites", "Abril");
		livro2.SetTitulo("Natureza selvagem");
		Livro livro3 = new Livro(LocalDate.of(2001, 9, 4), "A. B. Nogueira", "Nova");
		livro3.SetTitulo("O Segredo de kant");
		LivroController.Incluir(livro1);
		LivroController.Incluir(livro2);
		LivroController.Incluir(livro3);
	}
	
}
