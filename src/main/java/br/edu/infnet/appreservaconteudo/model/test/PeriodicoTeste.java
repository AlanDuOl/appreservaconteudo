package br.edu.infnet.appreservaconteudo.model.test;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import br.edu.infnet.appreservaconteudo.controller.PeriodicoController;
import br.edu.infnet.appreservaconteudo.model.domain.Conteudo;
import br.edu.infnet.appreservaconteudo.model.domain.Periodico;

@Component
public class PeriodicoTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		PopularLista();
		TestetoString();
	}
	
	private void TestetoString() {
		//arrange
		String tituloEsperado = "Titulo teste";
		String edicaoEsperado = "125";
		String nomeEsperado = "Revista A";
		String identificadorEsperado = "3413413";
		
		//act
		Conteudo periodicoTeste = new Periodico(edicaoEsperado, nomeEsperado);
		periodicoTeste.SetIdentificador(identificadorEsperado);
		periodicoTeste.SetTitulo(tituloEsperado);
		
		// act
		System.out.println(periodicoTeste.toString());
	}
	
	private void PopularLista() {
		Periodico periodico1 = new Periodico("123", "Revista A");
		periodico1.SetTitulo("Estudo A");
		Periodico periodico2 = new Periodico("11", "Revista B");
		periodico2.SetTitulo("Estudo teste");
		Periodico periodico3 = new Periodico("321", "Revista C");
		periodico3.SetTitulo("Estudo teste");
		PeriodicoController.Incluir(periodico1);
		PeriodicoController.Incluir(periodico2);
		PeriodicoController.Incluir(periodico3);
	}
	
}
