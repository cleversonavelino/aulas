package br.edu.unifacear.vendadepecas.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import br.edu.unifacear.vendadepecas.entity.Peca;

public class PecaDao implements Dao<Peca> {
	
	EntityManagerFactory emf =  Conexao.getInstance();
	
	public void inserir(Peca peca) {
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(peca);
		em.getTransaction().commit();		
	}
	
	public void alterar(Peca peca) {
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.merge(peca);
		em.getTransaction().commit();	
	}
	
	public void excluir(Peca peca) {
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.remove(em.merge(peca));
		em.getTransaction().commit();	
	}
	
	public List<Peca> listar() {
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("select p from Peca p");
		return q.getResultList();
	}
	
	public Peca buscarPorId(Integer id) {
		EntityManager em = emf.createEntityManager();
		return em.find(Peca.class, id);
	}

}
