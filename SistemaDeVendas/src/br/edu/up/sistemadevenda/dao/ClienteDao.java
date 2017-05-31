package br.edu.up.sistemadevenda.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.edu.up.sistemadevenda.entity.Cliente;


public class ClienteDao implements InterfaceDao<Cliente> {
	
	static List<Cliente> clientes = new ArrayList<Cliente>();
	
	public void salvar(Cliente c) {
		EntityManager em = Conexao.
				getInstance().createEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(c);
		
		em.getTransaction().commit();
	}

	public void excluir(Cliente c) {
		
	}
	
	public List<Cliente> listar() {
		EntityManager em = Conexao.
				getInstance().createEntityManager();
		Query q = em.createQuery("from Cliente");
		return q.getResultList();
	}
}
