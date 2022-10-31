package br.edu.infnet.appreservaconteudo.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import br.edu.infnet.appreservaconteudo.model.domain.Periodico;

@Controller
public class PeriodicoController {

	private static Map<Integer, Periodico> mapa = new HashMap<Integer, Periodico>();

	private static Integer id = 1;

	public static void Incluir(Periodico periodico) {
		periodico.SetId(id++);
		mapa.put(periodico.GetId(), periodico);
	}

	public static void Excluir(Integer id) {
		mapa.remove(id);
	}

	public static Collection<Periodico> ObterLista() {
		return mapa.values();
	}

	@GetMapping(value = "/periodico/lista")
	public String Listar(Model model) {
		model.addAttribute("periodicos", mapa.values());
		return "periodico/lista";
	}

	@GetMapping(value = "/periodico/{id}/excluir")
	public String Exclusao(@PathVariable Integer id) {
		Excluir(id);
		return "redirect:/periodico/lista";
	}
}
