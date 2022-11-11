package br.edu.infnet.apialuno.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import br.edu.infnet.apialuno.model.domain.Aluno;

@Repository
public interface AlunoRepository extends CrudRepository<Aluno, Integer>{
	
	@Query("from Aluno a where a.usuario.id = :idUsuario")
	List<Aluno> obterLista(Integer idUsuario);
	
}
