package br.edu.infnet.appreservaconteudo.model.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appreservaconteudo.model.domain.Endereco;
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
		Endereco endereco = new Endereco();
		endereco.setCep("60020180");
		endereco.setBairro("Benfica");
		endereco.setComplemento("ap 10");
		endereco.setLocalidade("fortaleza");
		endereco.setLogradouro("av da universidade, 124");
		endereco.setUf("CE");
		Usuario usuario = new Usuario("admin", "admin@mail.com", "123");
		usuario.setEndereco(endereco);
		usuarioService.Incluir(usuario);
	}
	
}
