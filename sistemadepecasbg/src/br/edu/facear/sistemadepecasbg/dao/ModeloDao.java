package br.edu.facear.sistemadepecasbg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.edu.facear.sistemadepecasbg.entity.Modelo;

public class ModeloDao implements Dao<Modelo> {

	public void salvar(Modelo p) {
		EntityManager em = Conexao.getInstance().createEntityManager();
		em.getTransaction().begin();
		em.persist(p);		
		em.getTransaction().commit();
	}
	
	public void editar(Modelo p) {
		EntityManager em = Conexao.getInstance().createEntityManager();
		em.getTransaction().begin();
		em.merge(p);		
		em.getTransaction().commit();
	}
	
	public void excluir(Modelo p) {
		
	}
	
	public List<Modelo> listar() {
		EntityManager em = Conexao.getInstance().createEntityManager();
		Query q = em.createQuery("select p from Modelo p");
		return q.getResultList();		
	}

	@Override
	public Modelo buscar(Integer id) {
		EntityManager em = Conexao.getInstance().createEntityManager();
		return em.find(Modelo.class, id);
	}

}
