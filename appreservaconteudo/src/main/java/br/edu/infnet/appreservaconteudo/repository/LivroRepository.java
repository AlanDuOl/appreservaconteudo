package br.edu.infnet.appreservaconteudo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import br.edu.infnet.appreservaconteudo.model.domain.Livro;

@Repository
public interface LivroRepository extends CrudRepository<Livro, Integer>{

}
