package br.edu.up.aula.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.edu.up.aula.entidade.Estado;

public class EstadoDao implements InterfaceDao<Estado> {
	
	public void inserir(Estado estado) {
		EntityManager em = Conexao.getInstance();
		em.getTransaction().begin();
		em.persist(estado);
		em.getTransaction().commit();
		em.close();
	}
	
	public void atualizar(Estado estado) {
		EntityManager em = Conexao.getInstance();
		em.getTransaction().begin();
		em.merge(estado);
		em.getTransaction().commit();
		em.close();
	}
	
	public void remover(Estado estado) {
		EntityManager em = Conexao.getInstance();
		em.getTransaction().begin();
		estado = em.merge(estado);
		em.remove(estado);
		em.getTransaction().commit();
		em.close();
	}
	
	public Estado buscar(Long id) {
		EntityManager em = Conexao.getInstance();
		Estado estado = em.find(Estado.class, id);
		
		em.close();
		return estado;		
	}
	
	public List<Estado> listar() {
		EntityManager em = Conexao.getInstance();
		Query q = em.createQuery("from Estado");
		List<Estado> estados = q.getResultList();
		em.close();
		return estados;
	}
	
}
