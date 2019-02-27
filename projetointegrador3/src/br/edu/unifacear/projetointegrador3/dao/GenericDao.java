package br.edu.unifacear.projetointegrador3.dao;

import java.util.List;

import javax.persistence.EntityManager;

public class GenericDao<T> implements Dao<T>{

	@Override
	public void inserir(T t) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(t);
		em.getTransaction().commit();
		em.close();			
	}

	@Override
	public void alterar(T t) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.merge(t);
		em.getTransaction().commit();
		em.close();		
	}

	@Override
	public List<T> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void excluir(T t) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.remove(t);
		em.getTransaction().commit();
		em.close();		
	}

}
