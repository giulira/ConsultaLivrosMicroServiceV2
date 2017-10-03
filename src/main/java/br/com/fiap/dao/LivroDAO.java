package br.com.fiap.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

import br.com.fiap.bean.Livro;

@Component
public class LivroDAO {
	
	/*@PersistenceContext	
	private EntityManager entityManager;*/

	@SuppressWarnings("unchecked")
	public List<Livro> getAllLivros() {
	/*	String hql = "FROM livros as liv ORDER BY liv.titulo";
		return (List<Livro>) entityManager.createQuery(hql).getResultList();*/
		List<Livro> l = new ArrayList<Livro>();
		Livro livro = new Livro();
		livro.setAno(2012);
		livro.setAutor("autor teste");
		livro.setId(1);
		livro.setIsbn("isbn");
		livro.setTitulo("Titulo");
		
		l.add(livro);
		return l;
	}

	public Livro getLivroById(int livroId) {
		/*System.out.println(entityManager.find(Livro.class, livroId));
		return entityManager.find(Livro.class, livroId);*/
		Livro livro = new Livro();
		livro.setAno(2012);
		livro.setAutor("autor teste");
		livro.setId(1);
		livro.setIsbn("isbn");
		livro.setTitulo("Titulo");
		return livro;
	}
	
	@SuppressWarnings("unchecked")
	public List<Livro> getLivroByAutor(String autor) {
		/*String hql = "FROM livros as liv where liv.autor ='" + autor +"'";
		return (List<Livro>) entityManager.createQuery(hql).getResultList();*/
		List<Livro> l = new ArrayList<Livro>();
		Livro livro = new Livro();
		livro.setAno(2012);
		livro.setAutor("autor teste");
		livro.setId(1);
		livro.setIsbn("isbn");
		livro.setTitulo("Titulo");
		
		l.add(livro);
		return l;
	}	
}
