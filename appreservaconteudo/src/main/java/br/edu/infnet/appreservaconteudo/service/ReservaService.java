package br.edu.infnet.appreservaconteudo.service;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.edu.infnet.appreservaconteudo.model.domain.Reserva;
import br.edu.infnet.appreservaconteudo.repository.ReservaRepository;

@Service
public class ReservaService {
	
	@Autowired
	private ReservaRepository reservaRepository;
	
	public void Incluir(Reserva reserva) {
		reservaRepository.save(reserva);
	}
	
	public void Excluir(Integer id) {
		reservaRepository.deleteById(id);
	}
	
	public Collection<Reserva> ObterLista(){
		return (Collection<Reserva>) reservaRepository.findAll();
	}
}
