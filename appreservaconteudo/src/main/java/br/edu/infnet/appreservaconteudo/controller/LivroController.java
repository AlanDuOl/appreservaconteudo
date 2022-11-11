package br.edu.infnet.appreservaconteudo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import br.edu.infnet.appreservaconteudo.model.domain.Livro;
import br.edu.infnet.appreservaconteudo.model.domain.Usuario;
import br.edu.infnet.appreservaconteudo.service.LivroService;

@Controller
public class LivroController {
	
	@Autowired
	private LivroService livroService;
	
	@GetMapping(value = "/livro/cadastro")
	public String Cadastro() {
		return "livro/cadastro";
	}
	
	@PostMapping(value = "/livro/cadastrar")
	public String Cadastrar(Livro livro, @SessionAttribute("usuario") Usuario usuario) {
		livro.setUsuario(usuario);
		livroService.Incluir(livro);
		return "redirect:/livro/lista";
	}
	
	@GetMapping(value = "/livro/lista")
	public String Listar(Model model) {
		model.addAttribute("livros", livroService.ObterLista());
		return "livro/lista";
	}
	
	@GetMapping(value = "/livro/{id}/excluir")
	public String Exclusao(@PathVariable Integer id) {
		livroService.Excluir(id);
		return "redirect:/livro/lista";
	}
}
