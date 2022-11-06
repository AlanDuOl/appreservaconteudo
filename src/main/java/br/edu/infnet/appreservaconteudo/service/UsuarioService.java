package br.edu.infnet.appreservaconteudo.service;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.edu.infnet.appreservaconteudo.model.domain.Usuario;
import br.edu.infnet.appreservaconteudo.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public void Incluir(Usuario usuario) {
		usuarioRepository.save(usuario);
	}
	
	public void Excluir(Integer id) {
		usuarioRepository.deleteById(id);
	}
	
	public Collection<Usuario> ObterLista(){
		return (Collection<Usuario>) usuarioRepository.findAll();
	}
	
	public Usuario ObterPorEmail(String email){
		Usuario usuario = usuarioRepository.findByEmail(email);
		return usuario;
	}
}
