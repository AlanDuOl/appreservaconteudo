package br.edu.infnet.appreservaconteudo.controller;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import br.edu.infnet.appreservaconteudo.model.domain.Aluno;
import br.edu.infnet.appreservaconteudo.model.domain.Conteudo;
import br.edu.infnet.appreservaconteudo.model.domain.Reserva;
import br.edu.infnet.appreservaconteudo.model.domain.Usuario;
import br.edu.infnet.appreservaconteudo.service.AlunoService;
import br.edu.infnet.appreservaconteudo.service.ConteudoService;
import br.edu.infnet.appreservaconteudo.service.ReservaService;

@Controller
public class ReservaController {
	
	@Autowired
	private ReservaService reservaService;
	@Autowired
	private ConteudoService conteudoService;
	@Autowired
	private AlunoService alunoService;
	
	@GetMapping(value = "/reserva/cadastro")
	public String Cadastro(Model model, @SessionAttribute("usuario") Usuario usuario) {
		Collection<Aluno> alunos = alunoService.ObterLista(usuario);
		Collection<Conteudo> conteudos = conteudoService.obterLista(usuario);
		model.addAttribute("alunos", alunos);
		model.addAttribute("conteudos", conteudos);
		return "reserva/cadastro";
	}
	
	@PostMapping(value = "/reserva/cadastrar")
	public String Cadastrar(Reserva reserva, @SessionAttribute("usuario") Usuario usuario) {
		reserva.setUsuario(usuario);
		reservaService.Incluir(reserva);
		return "redirect:/reserva/lista";
	}
	
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
