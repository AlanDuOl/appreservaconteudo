package br.edu.infnet.appreservaconteudo.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import br.edu.infnet.appreservaconteudo.model.domain.Didatico;

@Controller
public class DidaticoController {
	
	private static Map<Integer, Didatico> mapa = new HashMap<Integer, Didatico>();

	private static Integer id = 1;

	public static void Incluir(Didatico didatico) {
		didatico.SetId(id++);
		mapa.put(didatico.GetId(), didatico);
	}

	public static void Excluir(Integer id) {
		mapa.remove(id);
	}

	public static Collection<Didatico> ObterLista() {
		return mapa.values();
	}
	
	@GetMapping(value = "/didatico/lista")
	public String Listar(Model model) {
		model.addAttribute("didaticos", mapa.values());
		return "didatico/lista";
	}

	@GetMapping(value = "/didatico/{id}/excluir")
	public String Exclusao(@PathVariable Integer id) {
		Excluir(id);
		return "redirect:/didatico/lista";
	}
}
