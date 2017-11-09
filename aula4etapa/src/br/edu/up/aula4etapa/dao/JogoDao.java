package br.edu.up.aula4etapa.dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.edu.up.aula4etapa.entity.Jogo;

public class JogoDao {
	
	EntityManagerFactory emf = Persistence.
			createEntityManagerFactory("aula4etapa");
	
	public void inserir(Jogo jogo) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(jogo);
		em.getTransaction().commit();
	}
	
	public Jogo buscar(Integer id) {
		return null;
	}	
	
	public ArrayList<Jogo> listar() {
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("from Jogo");
		
		return new ArrayList<Jogo>(q.getResultList());
	}
	
	public void alterar(Jogo jogo) {	
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.merge(jogo);
		em.getTransaction().commit();
	}
	
	public void remover(Integer id) {	
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Jogo jogo = em.find(Jogo.class, id);		
		em.remove(jogo);
		em.getTransaction().commit();
	}

}
