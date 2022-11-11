package br.edu.infnet.appreservaconteudo.clients;

import java.util.Collection;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import br.edu.infnet.appreservaconteudo.model.domain.Aluno;

@FeignClient(url = "localhost:8081/api/aluno", name = "apiAlunoClient")
public interface IApiAlunoClient {
	
	@GetMapping(value = "/lista")
	public List<Aluno> Listar();
	
	@GetMapping(value = "/lista/{idUsuario}")
	public Collection<Aluno> Listar(@PathVariable Integer idUsuario);
	
	@PostMapping(value = "/cadastrar")
	public void Cadastrar(@RequestBody Aluno aluno);
	
	@DeleteMapping(value = "/{id}/excluir")
	public void Exclusao(@PathVariable Integer id);
}
