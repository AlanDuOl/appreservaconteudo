package br.edu.infnet.appreservaconteudo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import br.edu.infnet.appreservaconteudo.service.PeriodicoService;

@Controller
public class PeriodicoController {

	@Autowired
	private PeriodicoService periodicoService;

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
