package br.edu.infnet.appreservaconteudo.model.test;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import br.edu.infnet.appreservaconteudo.model.domain.Aluno;
import br.edu.infnet.appreservaconteudo.model.domain.Conteudo;
import br.edu.infnet.appreservaconteudo.model.domain.Livro;
import br.edu.infnet.appreservaconteudo.model.domain.Reserva;
import br.edu.infnet.appreservaconteudo.model.domain.Usuario;
import br.edu.infnet.appreservaconteudo.service.ReservaService;

@Order(6)
@Component
public class ReservaTeste implements ApplicationRunner {
	
	@Autowired
	private ReservaService reservaService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		PopularLista();
		TestetoString();
	}
	
	private void TestetoString() {
		//arrange
		/*Livro livro1 = new Livro(LocalDate.of(1987, 7, 21), "R. J. Sales", "Spring");
		livro1.setTitulo("Aves do deserto");
		Livro livro2 = new Livro(LocalDate.of(1999, 3, 12), "Campos B. Brites", "Abril");
		livro2.setTitulo("Natureza selvagem");
		Livro livro3 = new Livro(LocalDate.of(2001, 9, 4), "A. B. Nogueira", "Nova");
		livro3.setTitulo("O Segredo de kant");
		Aluno aluno1 = new Aluno("maria", "2541542", 7, "maria@gmail.com");
						
		//act
		Reserva reserva1 = new Reserva(aluno1, "Reserva commum", LocalDate.of(2021, 5, 13));
		reserva1.AdicionarConteudo(livro3);
		reserva1.AdicionarConteudo(livro2);
		
		// act
		System.out.println(reserva1.toString());
		*/
	}
	
	private void PopularLista() {
		Livro livro = new Livro();
		livro.setId(1);
		List<Conteudo> conteudos = new ArrayList<Conteudo>();
		conteudos.add(livro);
		Aluno aluno = new Aluno();
		aluno.setId(1);
		Usuario usuario = new Usuario();
		usuario.setId(1);

		Reserva reserva1 = new Reserva();
		reserva1.setAluno(aluno);
		reserva1.setDescricao("Reserva commum");
		reserva1.setDataReserva("2022-11-10T10:11:22");
		reserva1.setConteudos(conteudos);
		reserva1.setUsuario(usuario);
		
		Reserva reserva2 = new Reserva();
		reserva2.setAluno(aluno);
		reserva2.setDescricao("Reserva 2");
		reserva2.setDataReserva("2022-11-10T13:15:00");
		reserva2.setConteudos(conteudos);
		reserva2.setUsuario(usuario);
		
		Reserva reserva3 = new Reserva();
		reserva3.setAluno(aluno);
		reserva3.setDescricao("Reserva 3");
		reserva3.setDataReserva("2022-11-09T12:11:23");
		reserva3.setConteudos(conteudos);
		reserva3.setUsuario(usuario);
		
		reservaService.Incluir(reserva1);
		reservaService.Incluir(reserva2);
		reservaService.Incluir(reserva3);
	}
}
