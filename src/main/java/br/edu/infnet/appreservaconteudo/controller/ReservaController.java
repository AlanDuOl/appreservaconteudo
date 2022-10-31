package br.edu.infnet.appreservaconteudo.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import br.edu.infnet.appreservaconteudo.model.domain.Reserva;

@Controller
public class ReservaController {
	
	private static Map<Integer, Reserva> mapa = new HashMap<Integer, Reserva>();

	private static Integer id = 1;

	public static void Incluir(Reserva reserva) {
		reserva.SetId(id++);
		mapa.put(reserva.GetId(), reserva);
	}

	public static void Excluir(Integer id) {
		mapa.remove(id);
	}

	public static Collection<Reserva> ObterLista() {
		return mapa.values();
	}
	
	@GetMapping(value = "/reserva/lista")
	public String Listar(Model model) {
		model.addAttribute("reservas", mapa.values());
		return "reserva/lista";
	}
	
	@GetMapping(value = "/reserva/{id}/excluir")
	public String Exclusao(@PathVariable Integer id) {
		Excluir(id);
		return "redirect:/reserva/lista";
	}
}
