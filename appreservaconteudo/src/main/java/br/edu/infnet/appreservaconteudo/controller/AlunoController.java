package br.edu.infnet.appreservaconteudo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appreservaconteudo.model.domain.Aluno;
import br.edu.infnet.appreservaconteudo.model.domain.Usuario;
import br.edu.infnet.appreservaconteudo.service.AlunoService;

@Controller
public class AlunoController {
	
	@Autowired
	private AlunoService alunoService;
	
	@GetMapping(value = "/aluno/lista")
	public String Listar(Model model, @SessionAttribute("usuario") Usuario usuario) {
		model.addAttribute("alunos", alunoService.ObterLista(usuario));
		return "aluno/lista";
	}
	
	@GetMapping(value = "/aluno/cadastro")
	public String Cadastro() {
		return "aluno/cadastro";
	}
	
	@PostMapping(value = "/aluno/cadastrar")
	public String Cadastrar(Aluno aluno, @SessionAttribute("usuario") Usuario usuario) {
		aluno.setUsuario(usuario);
		alunoService.Incluir(aluno);
		return "redirect:/aluno/lista";
	}
	
	@GetMapping(value = "/aluno/{id}/excluir")
	public String Exclusao(@PathVariable Integer id) {
		alunoService.Excluir(id);
		return "redirect:/aluno/lista";
	}
}
