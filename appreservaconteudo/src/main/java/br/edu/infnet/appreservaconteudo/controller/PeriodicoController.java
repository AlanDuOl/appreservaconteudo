package br.edu.infnet.appreservaconteudo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import br.edu.infnet.appreservaconteudo.model.domain.Periodico;
import br.edu.infnet.appreservaconteudo.model.domain.Usuario;
import br.edu.infnet.appreservaconteudo.service.PeriodicoService;

@Controller
public class PeriodicoController {

	@Autowired
	private PeriodicoService periodicoService;
	
	@GetMapping(value = "/periodico/cadastro")
	public String Cadastro() {
		return "periodico/cadastro";
	}
	
	@PostMapping(value = "/periodico/cadastrar")
	public String Cadastrar(Periodico periodico, @SessionAttribute("usuario") Usuario usuario) {
		periodico.setUsuario(usuario);
		periodicoService.Incluir(periodico);
		return "redirect:/periodico/lista";
	}

	@GetMapping(value = "/periodico/lista")
	public String Listar(Model model) {
		model.addAttribute("periodicos", periodicoService.ObterLista());
		return "periodico/lista";
	}

	@GetMapping(value = "/periodico/{id}/excluir")
	public String Exclusao(@PathVariable Integer id) {
		periodicoService.Excluir(id);
		return "redirect:/periodico/lista";
	}
}
