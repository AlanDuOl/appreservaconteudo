package br.edu.infnet.appreservaconteudo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import br.edu.infnet.appreservaconteudo.model.domain.Didatico;
import br.edu.infnet.appreservaconteudo.model.domain.Usuario;
import br.edu.infnet.appreservaconteudo.service.DidaticoService;

@Controller
public class DidaticoController {
	
	@Autowired
	private DidaticoService didaticoService;
	
	@GetMapping(value = "/didatico/cadastro")
	public String Cadastro() {
		return "didatico/cadastro";
	}
	
	@PostMapping(value = "/didatico/cadastrar")
	public String Cadastrar(Didatico didatico, @SessionAttribute("usuario") Usuario usuario) {
		didatico.setUsuario(usuario);
		didaticoService.Incluir(didatico);
		return "redirect:/didatico/lista";
	}
	
	@GetMapping(value = "/didatico/lista")
	public String Listar(Model model) {
		model.addAttribute("didaticos", didaticoService.ObterLista());
		return "didatico/lista";
	}

	@GetMapping(value = "/didatico/{id}/excluir")
	public String Exclusao(@PathVariable Integer id) {
		didaticoService.Excluir(id);
		return "redirect:/didatico/lista";
	}
}
