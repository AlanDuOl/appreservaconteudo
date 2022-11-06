package br.edu.infnet.appreservaconteudo.service;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.edu.infnet.appreservaconteudo.model.domain.Aluno;
import br.edu.infnet.appreservaconteudo.repository.AlunoRepository;

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
}
