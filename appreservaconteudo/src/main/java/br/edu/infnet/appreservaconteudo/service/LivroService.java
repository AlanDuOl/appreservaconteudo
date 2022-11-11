package br.edu.infnet.appreservaconteudo.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.edu.infnet.appreservaconteudo.model.domain.Livro;
import br.edu.infnet.appreservaconteudo.repository.LivroRepository;

@Service
public class LivroService {
	
	@Autowired
	private LivroRepository livroRepository;
	
	public void Incluir(Livro livro) {
		livroRepository.save(livro);
	}
	
	public void Excluir(Integer id) {
		livroRepository.deleteById(id);
	}
	
	public Collection<Livro> ObterLista(){
		return (Collection<Livro>) livroRepository.findAll();
	}
}
