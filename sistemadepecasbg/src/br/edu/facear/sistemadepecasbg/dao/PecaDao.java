package br.edu.facear.sistemadepecasbg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.edu.facear.sistemadepecasbg.entity.Peca;

public class PecaDao implements Dao<Peca> {

	public void salvar(Peca p) {
		EntityManager em = Conexao.getInstance().createEntityManager();
		em.getTransaction().begin();
		em.persist(p);		
		em.getTransaction().commit();
	}
	
	public void editar(Peca p) {
		EntityManager em = Conexao.getInstance().createEntityManager();
		em.getTransaction().begin();
		em.merge(p);		
		em.getTransaction().commit();
	}
	
	public void excluir(Peca p) {
		
	}
	
	public List<Peca> listar() {
		EntityManager em = Conexao.getInstance().createEntityManager();
		Query q = em.createQuery("select p from Peca p");
		return q.getResultList();		
	}

	@Override
	public Peca buscar(Long id) {
		EntityManager em = Conexao.getInstance().createEntityManager();
		return em.find(Peca.class, id);
	}

}
