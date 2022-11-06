package br.edu.infnet.appreservaconteudo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import br.edu.infnet.appreservaconteudo.service.ReservaService;

@Controller
public class ReservaController {
	
	//@Autowired
	private ReservaService reservaService;
	
	@GetMapping(value = "/reserva/lista")
	public String Listar(Model model) {
		model.addAttribute("reservas", reservaService.ObterLista());
		return "reserva/lista";
	}
	
	@GetMapping(value = "/reserva/{id}/excluir")
	public String Exclusao(@PathVariable Integer id) {
		reservaService.Excluir(id);
		return "redirect:/reserva/lista";
	}
}
