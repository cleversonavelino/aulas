package aulajpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import aulajpa.entidade.Cliente;

public class ClienteDao {
	
	public void salvar(Cliente cliente) {
		EntityManager em = new Conexao().createEntityManager();
		em.getTransaction().begin();
		em.persist(cliente);
		em.getTransaction().commit();
	}
	
	@SuppressWarnings("unchecked")
	public List<Cliente> listar() {
		EntityManager em = new Conexao().createEntityManager();
		Query q = em.createQuery("select c from Cliente c");
		return q.getResultList();
	}
	
	public Cliente buscar(Integer id) {
		EntityManager em = new Conexao().createEntityManager();
		Cliente c = em.find(Cliente.class, id);
		return c;
	}

}
