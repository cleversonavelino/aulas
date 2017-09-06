package br.edu.up.aula.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.edu.up.aula.entidade.NewsLetter;

public class NewsLetterDao {
	
	public void inserir(NewsLetter NewsLetter) {
		EntityManager em = Conexao.getInstance();
		em.getTransaction().begin();
		em.persist(NewsLetter);
		em.getTransaction().commit();
		em.close();
	}
	
	public void atualizar(NewsLetter NewsLetter) {
		EntityManager em = Conexao.getInstance();
		em.getTransaction().begin();
		em.merge(NewsLetter);
		em.getTransaction().commit();
		em.close();
	}
	
	public void remover(NewsLetter NewsLetter) {
		EntityManager em = Conexao.getInstance();
		em.getTransaction().begin();
		NewsLetter = em.merge(NewsLetter);
		em.remove(NewsLetter);
		em.getTransaction().commit();
		em.close();
	}

	
	public NewsLetter buscar(Long id) {
		EntityManager em = Conexao.getInstance();
		NewsLetter NewsLetter = em.find(NewsLetter.class, id);
		
		em.close();
		return NewsLetter;		
	}
	
	public List<NewsLetter> listar() {
		EntityManager em = Conexao.getInstance();
		Query q = em.createQuery("from NewsLetter");
		List<NewsLetter> NewsLetters = q.getResultList();
		em.close();
		return NewsLetters;
	}
	
}
