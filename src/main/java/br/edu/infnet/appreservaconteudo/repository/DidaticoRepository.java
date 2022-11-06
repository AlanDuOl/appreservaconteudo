package br.edu.infnet.appreservaconteudo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import br.edu.infnet.appreservaconteudo.model.domain.Didatico;

@Repository
public interface DidaticoRepository extends CrudRepository<Didatico, Integer>{

}
