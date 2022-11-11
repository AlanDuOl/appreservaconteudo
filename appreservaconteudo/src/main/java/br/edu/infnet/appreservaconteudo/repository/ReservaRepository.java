package br.edu.infnet.appreservaconteudo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import br.edu.infnet.appreservaconteudo.model.domain.Reserva;

@Repository
public interface ReservaRepository extends CrudRepository<Reserva, Integer>  {

}
