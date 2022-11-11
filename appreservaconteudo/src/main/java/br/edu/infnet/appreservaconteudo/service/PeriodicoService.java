package br.edu.infnet.appreservaconteudo.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.edu.infnet.appreservaconteudo.model.domain.Periodico;
import br.edu.infnet.appreservaconteudo.repository.PeriodicoRepository;

@Service
public class PeriodicoService {
	
	@Autowired
	private PeriodicoRepository periodicoRepository;
	
	public void Incluir(Periodico periodico) {
		periodicoRepository.save(periodico);
	}
	
	public void Excluir(Integer id) {
		periodicoRepository.deleteById(id);
	}
	
	public Collection<Periodico> ObterLista(){
		return (Collection<Periodico>) periodicoRepository.findAll();
	}
}
