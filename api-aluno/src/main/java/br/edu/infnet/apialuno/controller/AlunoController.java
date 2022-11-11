package br.edu.infnet.apialuno.controller;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.edu.infnet.apialuno.model.service.AlunoService;
import br.edu.infnet.apialuno.model.domain.Aluno;

@RestController
@RequestMapping("/api/aluno")
public class AlunoController {
	
	@Autowired
	private AlunoService alunoService;
	
	@GetMapping(value = "/lista")
	public List<Aluno> Listar() {
		return (List<Aluno>) alunoService.ObterLista();
	}
	
	@GetMapping(value = "/lista/{idUsuario}")
	public Collection<Aluno> Listar(@PathVariable Integer idUsuario) {
		 return alunoService.ObterLista(idUsuario);
	}
	
	@PostMapping(value = "/cadastrar")
	public String Cadastrar(@RequestBody Aluno aluno) {
		try {
			alunoService.Incluir(aluno);
			return "Aluno incluído com sucesso";
		}
		catch(Exception e) {
			return e.getMessage();
		}
	}
	
	@DeleteMapping(value = "/{id}/excluir")
	public String Exclusao(@PathVariable Integer id) {
		alunoService.Excluir(id);
		return "Aluno excluído com sucesso";
	}
}
