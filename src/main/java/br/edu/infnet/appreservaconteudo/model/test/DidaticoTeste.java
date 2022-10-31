package br.edu.infnet.appreservaconteudo.model.test;

import java.time.LocalDate;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import br.edu.infnet.appreservaconteudo.controller.DidaticoController;
import br.edu.infnet.appreservaconteudo.model.domain.Conteudo;
import br.edu.infnet.appreservaconteudo.model.domain.Didatico;

@Component
public class DidaticoTeste implements ApplicationRunner {
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		PopularLista();
		TestetoString();
	}
	
	private void TestetoString() {
		//arrange
		LocalDate dataConclusaoEsperado = LocalDate.of(2010, 10, 13);
		String tituloEsperado = "Titulo teste";
		String autorEsperado = "Fula de tal";
		String identificadorEsperado = "3413413";
		boolean reservadoEsperado = true;
		boolean retiradoEsperado = true;
		
		//act
		Conteudo didaticoTeste = new Didatico(dataConclusaoEsperado, autorEsperado);
		didaticoTeste.SetIdentificador(identificadorEsperado);
		didaticoTeste.SetTitulo(tituloEsperado);
		didaticoTeste.SetReservado(reservadoEsperado);
		didaticoTeste.SetRetirado(retiradoEsperado);
		
		// act
		System.out.println(didaticoTeste.toString());
	}
	
	private void PopularLista() {
		Didatico didatico1 = new Didatico(LocalDate.of(2010, 10, 13), "R. Lucia Alcantara");
		didatico1.SetTitulo("Estudo Especializado");
		Didatico didatico2 = new Didatico(LocalDate.of(2010, 10, 13), "R. Maria Alencar");
		didatico2.SetTitulo("Estudo teste");
		Didatico didatico3 = new Didatico(LocalDate.of(2010, 10, 13), "R. A. Gomes");
		didatico3.SetTitulo("Estudo teste");
		DidaticoController.Incluir(didatico1);
		DidaticoController.Incluir(didatico2);
		DidaticoController.Incluir(didatico3);
	}
}
