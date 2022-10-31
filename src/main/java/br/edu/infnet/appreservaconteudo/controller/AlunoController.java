package br.edu.infnet.appreservaconteudo.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import br.edu.infnet.appreservaconteudo.model.domain.Aluno;

@Controller
public class AlunoController {
	
	private static Map<Integer, Aluno> mapa = new HashMap<Integer, Aluno>();

	private static Integer id = 1;

	public static void Incluir(Aluno aluno) {
		aluno.SetId(id++);
		mapa.put(aluno.GetId(), aluno);
	}

	public static void Excluir(Integer id) {
		mapa.remove(id);
	}

	public static Collection<Aluno> ObterLista() {
		return mapa.values();
	}
	
	@GetMapping(value = "/aluno/lista")
	public String Listar(Model model) {
		model.addAttribute("alunos", mapa.values());
		return "aluno/lista";
	}
	
	@GetMapping(value = "/aluno/{id}/excluir")
	public String Exclusao(@PathVariable Integer id) {
		Excluir(id);
		return "redirect:/aluno/lista";
	}
}
