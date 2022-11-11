package br.edu.infnet.appreservaconteudo.model.test;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import br.edu.infnet.appreservaconteudo.model.domain.Livro;
import br.edu.infnet.appreservaconteudo.model.domain.Usuario;
import br.edu.infnet.appreservaconteudo.service.LivroService;

@Order(4)
@Component
public class LivroTeste implements ApplicationRunner {
	
	@Autowired
	private LivroService LivroService;
	
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
		
		//act
		Livro livroTeste = new Livro(dataPublicacaoEsperado, autorEsperado, editoraEsperada);
		livroTeste.setTitulo(tituloEsperado);
		
		// act
		System.out.println(livroTeste.toString());
	}
	
	private void PopularListaLivros() {
		Usuario usuario = new Usuario("alan", "alan@gmail.com", "12345");
		usuario.setId(1);
		Livro livro1 = new Livro(LocalDate.of(1987, 7, 21), "R. J. Sales", "Spring");
		livro1.setTitulo("Aves do deserto");
		livro1.setUsuario(usuario);
		Livro livro2 = new Livro(LocalDate.of(1999, 3, 12), "Campos B. Brites", "Abril");
		livro2.setTitulo("Natureza selvagem");
		livro2.setUsuario(usuario);
		Livro livro3 = new Livro(LocalDate.of(2001, 9, 4), "A. B. Nogueira", "Nova");
		livro3.setTitulo("O Segredo de kant");
		livro3.setUsuario(usuario);
		LivroService.Incluir(livro1);
		LivroService.Incluir(livro2);
		LivroService.Incluir(livro3);
	}
	
}
