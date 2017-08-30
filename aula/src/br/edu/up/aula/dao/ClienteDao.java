package br.edu.up.aula.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.edu.up.aula.entidade.Cliente;

public class ClienteDao {
	
	public void inserir(Cliente cliente) {
		EntityManager em = Conexao.getInstance();
		em.getTransaction().begin();
		em.persist(cliente);
		em.getTransaction().commit();
		em.close();
	}
	
	public void atualizar(Cliente cliente) {
		EntityManager em = Conexao.getInstance();
		em.getTransaction().begin();
		em.merge(cliente);
		em.getTransaction().commit();
		em.close();
	}
	
	public void remover(Cliente cliente) {
		EntityManager em = Conexao.getInstance();
		em.getTransaction().begin();
		em.remove(cliente);
		em.getTransaction().commit();
		em.close();
	}

	
	public Cliente buscar(Long id) {
		EntityManager em = Conexao.getInstance();
		Cliente cliente = em.find(Cliente.class, id);
		
		em.close();
		return cliente;		
	}
	
	public List<Cliente> listar() {
		EntityManager em = Conexao.getInstance();
		Query q = em.createQuery("from Cliente");
		List<Cliente> clientes = q.getResultList();
		em.close();
		return clientes;
	}
	
}
