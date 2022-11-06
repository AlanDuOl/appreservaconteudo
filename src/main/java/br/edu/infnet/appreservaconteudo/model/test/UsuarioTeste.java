package br.edu.infnet.appreservaconteudo.model.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import br.edu.infnet.appreservaconteudo.model.domain.Usuario;
import br.edu.infnet.appreservaconteudo.service.UsuarioService;

@Order(1)
@Component
public class UsuarioTeste implements ApplicationRunner {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		PopularListaLivros();
		TestetoString();
	}
	
	private void TestetoString() {
		//act
		Usuario usuarioTeste = new Usuario("alan", "alan@gmail.com", "12345");
		
		// act
		System.out.println(usuarioTeste.toString());
	}
	
	private void PopularListaLivros() {
		Usuario usuario1 = new Usuario("alan", "alan@gmail.com", "12345");
		Usuario usuario2 = new Usuario("maria", "maria@gmail.com", "12345");
		Usuario usuario3 = new Usuario("claudia", "claudia@gmail.com", "12345");
		usuarioService.Incluir(usuario1);
		usuarioService.Incluir(usuario2);
		usuarioService.Incluir(usuario3);
	}
	
}
