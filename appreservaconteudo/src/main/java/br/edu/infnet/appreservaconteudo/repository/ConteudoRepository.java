package br.edu.infnet.appreservaconteudo.repository;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import br.edu.infnet.appreservaconteudo.model.domain.Conteudo;

@Repository
public interface ConteudoRepository extends CrudRepository<Conteudo, Integer>{

	@Query("from Conteudo c where c.usuario.id = :idUsuario")
	List<Conteudo> obterLista(Integer idUsuario);
	
}
