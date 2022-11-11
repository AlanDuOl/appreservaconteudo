package br.edu.infnet.appreservaconteudo.model.test;

import java.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import br.edu.infnet.appreservaconteudo.model.domain.Conteudo;
import br.edu.infnet.appreservaconteudo.model.domain.Didatico;
import br.edu.infnet.appreservaconteudo.model.domain.Usuario;
import br.edu.infnet.appreservaconteudo.service.DidaticoService;

@Order(3)
@Component
public class DidaticoTeste implements ApplicationRunner {
	
	@Autowired
	private DidaticoService didaticoService;
	
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
		
		//act
		Conteudo didaticoTeste = new Didatico(dataConclusaoEsperado, autorEsperado);
		didaticoTeste.setTitulo(tituloEsperado);
		
		// act
		System.out.println(didaticoTeste.toString());
	}
	
	private void PopularLista() {
		Usuario usuario = new Usuario("alan", "alan@gmail.com", "12345");
		usuario.setId(1);
		Didatico didatico1 = new Didatico(LocalDate.of(2010, 10, 13), "R. Lucia Alcantara");
		didatico1.setTitulo("Estudo Especializado");
		didatico1.setUsuario(usuario);
		Didatico didatico2 = new Didatico(LocalDate.of(2010, 10, 13), "R. Maria Alencar");
		didatico2.setTitulo("Estudo teste");
		didatico2.setUsuario(usuario);
		Didatico didatico3 = new Didatico(LocalDate.of(2010, 10, 13), "R. A. Gomes");
		didatico3.setTitulo("Estudo teste");
		didatico3.setUsuario(usuario);
		didaticoService.Incluir(didatico1);
		didaticoService.Incluir(didatico2);
		didaticoService.Incluir(didatico3);
	}
}
