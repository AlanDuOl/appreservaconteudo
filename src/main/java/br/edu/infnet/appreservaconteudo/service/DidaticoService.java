package br.edu.infnet.appreservaconteudo.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.edu.infnet.appreservaconteudo.model.domain.Didatico;
import br.edu.infnet.appreservaconteudo.repository.DidaticoRepository;

@Service
public class DidaticoService {
	
	@Autowired
	private DidaticoRepository didaticoRepository;
	
	public void Incluir(Didatico didatico) {
		didaticoRepository.save(didatico);
	}
	
	public void Excluir(Integer id) {
		didaticoRepository.deleteById(id);
	}
	
	public Collection<Didatico> ObterLista(){
		return (Collection<Didatico>) didaticoRepository.findAll();
	}
}
