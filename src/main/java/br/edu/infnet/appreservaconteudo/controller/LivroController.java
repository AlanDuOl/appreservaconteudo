package br.edu.infnet.appreservaconteudo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import br.edu.infnet.appreservaconteudo.service.LivroService;

@Controller
public class LivroController {
	
	@Autowired
	private LivroService livroService;
	
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
