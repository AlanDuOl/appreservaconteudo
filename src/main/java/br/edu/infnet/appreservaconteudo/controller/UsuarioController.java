package br.edu.infnet.appreservaconteudo.controller;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.support.SessionStatus;
import br.edu.infnet.appreservaconteudo.model.domain.Usuario;
import br.edu.infnet.appreservaconteudo.service.UsuarioService;

@Controller
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping(value = "/usuario/cadastro")
	public String Cadastro() {
		return "usuario/cadastro";
	}
	
	@GetMapping(value = "/usuario/login")
	public String Login() {
		return "usuario/login";
	}
	
	@PostMapping(value = "/usuario/incluir")
	public String Incluir(@RequestParam String nome, @RequestParam String email, @RequestParam String senha) {
		usuarioService.Incluir(new Usuario(nome, email, senha));
		return "redirect:/usuario/login";
	}
	
	@PostMapping(value = "/usuario/autenticar")
	public String Autenticar(HttpSession session, @RequestParam String email, @RequestParam String senha) {
		Usuario usuario = usuarioService.ObterPorEmail(email);
		if (usuario != null && senha.equals(usuario.GetSenha())) {
			session.setAttribute("usuario", usuario);
			return "redirect:/";
		}
		return "redirect:/usuario/login";
	}
	
	@GetMapping(value = "/usuario/lista")
	public String Listar(Model model) {
		model.addAttribute("usuarios", usuarioService.ObterLista());
		return "usuario/lista";
	}
	
	@GetMapping(value = "/usuario/{id}/excluir")
	public String Exclusao(@PathVariable Integer id) {
		usuarioService.Excluir(id);
		return "redirect:/usuario/lista";
	}
	
	@GetMapping(value = "/usuario/logout")
	public String Logout(HttpSession session, SessionStatus status) {
		status.setComplete();
		session.removeAttribute("usuario");
		return "redirect:/usuario/login";
	}
}
