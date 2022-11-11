package br.edu.infnet.appreservaconteudo.model.domain;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tlivro")
public class Livro extends Conteudo {
	private LocalDate dataPublicacao;
	private String autor;
	private String editora;
	
	public Livro() {}
	
	public Livro(LocalDate dataPublicacao, String autor, String editora) {
		this.dataPublicacao = dataPublicacao;
		this.autor = autor;
		this.editora = editora;
	}
	
	public LocalDate getDataPublicacao() {
		return dataPublicacao;
	}

	public void setDataPublicacao(String dataPublicacao) {
		this.dataPublicacao = LocalDate.parse(dataPublicacao);
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	@Override
	public String toString() {
		return "Livro [DataPublicacao=" + dataPublicacao + ", Autor=" + autor + ", Editora=" + editora + ", getId()="
				+ getId() + ", getReservas()=" + getReservas() + ", getUsuario()=" + getUsuario() + ", getTitulo()="
				+ getTitulo() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	
}
