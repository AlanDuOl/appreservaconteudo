package br.edu.infnet.appreservaconteudo.model.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import br.edu.infnet.appreservaconteudo.model.domain.Conteudo;
import br.edu.infnet.appreservaconteudo.model.domain.Periodico;
import br.edu.infnet.appreservaconteudo.model.domain.Usuario;
import br.edu.infnet.appreservaconteudo.service.PeriodicoService;

@Order(5)
@Component
public class PeriodicoTeste implements ApplicationRunner {

	@Autowired
	private PeriodicoService periodicoService;
	
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
		
		//act
		Conteudo periodicoTeste = new Periodico(edicaoEsperado, nomeEsperado);
		periodicoTeste.setTitulo(tituloEsperado);
		
		// act
		System.out.println(periodicoTeste.toString());
	}
	
	private void PopularLista() {
		Usuario usuario = new Usuario("alan", "alan@gmail.com", "12345");
		usuario.setId(1);
		Periodico periodico1 = new Periodico("123", "Revista A");
		periodico1.setTitulo("Estudo A");
		periodico1.setUsuario(usuario);
		Periodico periodico2 = new Periodico("11", "Revista B");
		periodico2.setTitulo("Estudo teste");
		periodico2.setUsuario(usuario);
		Periodico periodico3 = new Periodico("321", "Revista C");
		periodico3.setTitulo("Estudo teste");
		periodico3.setUsuario(usuario);
		periodicoService.Incluir(periodico1);
		periodicoService.Incluir(periodico2);
		periodicoService.Incluir(periodico3);
	}
	
}
