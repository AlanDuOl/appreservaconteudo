package br.edu.infnet.apialuno.model.service;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.edu.infnet.apialuno.model.domain.Aluno;
import br.edu.infnet.apialuno.model.repository.AlunoRepository;

@Service
public class AlunoService {
	
	@Autowired
	private AlunoRepository alunoRepository;
	
	public void Incluir(Aluno aluno) {
		alunoRepository.save(aluno);
	}
	
	public void Excluir(Integer id) {
		alunoRepository.deleteById(id);
	}
	
	public Collection<Aluno> ObterLista(){
		return (Collection<Aluno>) alunoRepository.findAll();
	}
	
	public Collection<Aluno> ObterLista(Integer idUsuario){
		return (Collection<Aluno>) alunoRepository.obterLista(idUsuario);
	}
	
}
