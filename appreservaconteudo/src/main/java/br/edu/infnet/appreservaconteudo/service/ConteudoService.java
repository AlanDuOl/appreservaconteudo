package br.edu.infnet.appreservaconteudo.service;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.edu.infnet.appreservaconteudo.model.domain.Conteudo;
import br.edu.infnet.appreservaconteudo.model.domain.Usuario;
import br.edu.infnet.appreservaconteudo.repository.ConteudoRepository;

@Service
public class ConteudoService {
	
	@Autowired
	private ConteudoRepository conteudoRepository;
	
	public Collection<Conteudo> obterLista(Usuario usuario){
		return (Collection<Conteudo>) conteudoRepository.obterLista(usuario.getId());
	}
}
