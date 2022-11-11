package br.edu.infnet.appreservaconteudo.service;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.edu.infnet.appreservaconteudo.clients.IApiAlunoClient;
import br.edu.infnet.appreservaconteudo.model.domain.Aluno;
import br.edu.infnet.appreservaconteudo.model.domain.Usuario;

@Service
public class AlunoService {
	
	@Autowired
	private IApiAlunoClient apiAlunoClient;
	
	public void Incluir(Aluno aluno) {
		apiAlunoClient.Cadastrar(aluno);
	}
	
	public void Excluir(Integer id) {
		apiAlunoClient.Exclusao(id);
	}
	
	public Collection<Aluno> ObterLista(){
		return (Collection<Aluno>) apiAlunoClient.Listar();
	}
	
	public Collection<Aluno> ObterLista(Usuario usuario){
		return (Collection<Aluno>) apiAlunoClient.Listar(usuario.getId());
	}
	
}
