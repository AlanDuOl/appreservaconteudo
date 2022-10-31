package br.edu.infnet.appreservaconteudo.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appreservaconteudo.model.domain.Livro;

@Controller
public class LivroController {
	
	private static Map<Integer, Livro> mapa = new HashMap<Integer, Livro>();
	
	private static Integer id = 1;
	
	public static void Incluir(Livro livro) {
		livro.SetId(id++);
		mapa.put(livro.GetId(), livro);
	}
	
	public static void Excluir(Integer id) {
		mapa.remove(id);
	}
	
	public static Collection<Livro> ObterLista(){
		return mapa.values();
	}
	
	@GetMapping(value = "/livro/lista")
	public String Listar(Model model) {
		model.addAttribute("livros", mapa.values());
		return "livro/lista";
	}
	
	@GetMapping(value = "/livro/{id}/excluir")
	public String Exclusao(@PathVariable Integer id) {
		Excluir(id);
		return "redirect:/livro/lista";
	}
}
