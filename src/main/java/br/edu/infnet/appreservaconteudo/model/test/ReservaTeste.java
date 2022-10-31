package br.edu.infnet.appreservaconteudo.model.test;

import java.time.LocalDate;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import br.edu.infnet.appreservaconteudo.controller.ReservaController;
import br.edu.infnet.appreservaconteudo.model.domain.Aluno;
import br.edu.infnet.appreservaconteudo.model.domain.Livro;
import br.edu.infnet.appreservaconteudo.model.domain.Reserva;

@Component
public class ReservaTeste implements ApplicationRunner {
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		PopularLista();
		TestetoString();
	}
	
	private void TestetoString() {
		//arrange
		Livro livro1 = new Livro(LocalDate.of(1987, 7, 21), "R. J. Sales", "Spring");
		livro1.SetTitulo("Aves do deserto");
		Livro livro2 = new Livro(LocalDate.of(1999, 3, 12), "Campos B. Brites", "Abril");
		livro2.SetTitulo("Natureza selvagem");
		Livro livro3 = new Livro(LocalDate.of(2001, 9, 4), "A. B. Nogueira", "Nova");
		livro3.SetTitulo("O Segredo de kant");
		Aluno aluno1 = new Aluno("maria", "2541542", 7);
						
		//act
		Reserva reserva1 = new Reserva(aluno1, "Reserva commum", LocalDate.of(2021, 5, 13));
		reserva1.AdicionarConteudo(livro3);
		reserva1.AdicionarConteudo(livro2);
		
		// act
		System.out.println(reserva1.toString());
	}
	
	private void PopularLista() {
		Livro livro1 = new Livro(LocalDate.of(1987, 7, 21), "R. J. Sales", "Spring");
		livro1.SetTitulo("Aves do deserto");
		Livro livro2 = new Livro(LocalDate.of(1999, 3, 12), "Campos B. Brites", "Abril");
		livro2.SetTitulo("Natureza selvagem");
		Livro livro3 = new Livro(LocalDate.of(2001, 9, 4), "A. B. Nogueira", "Nova");
		livro3.SetTitulo("O Segredo de kant");
		Aluno aluno1 = new Aluno("maria", "2541542", 7);
		Reserva reserva1 = new Reserva(aluno1, "Reserva commum", LocalDate.of(2021, 5, 13));
		reserva1.AdicionarConteudo(livro3);
		reserva1.AdicionarConteudo(livro2);
		Aluno aluno2 = new Aluno("Alan", "5498766", 5);
		Reserva reserva2 = new Reserva(aluno2, "Reserva commum", LocalDate.of(2021, 9, 25));
		reserva2.AdicionarConteudo(livro1);
		Aluno aluno3 = new Aluno("Lucia Cavalcanti", "2845039", 8);
		Reserva reserva3 = new Reserva(aluno3, "Reserva commum", LocalDate.of(2020, 3, 5));
		reserva3.AdicionarConteudo(livro1);
		reserva3.AdicionarConteudo(livro2);
		reserva3.AdicionarConteudo(livro3);
		ReservaController.Incluir(reserva1);
		ReservaController.Incluir(reserva2);
		ReservaController.Incluir(reserva3);
	}
}
