package br.edu.up.as.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.edu.up.as.entidade.Cliente;

@Deprecated
public class ClienteDao implements Dao<Cliente> {	

	public void salvar(Cliente c) {
		EntityManager em = Conexao.getInstance();
		
		em.getTransaction().begin();
		em.persist(c);
		em.getTransaction().commit();
		
	}
	
	public void excluir(Cliente c) {
		
	}
	
	public void alterar(Cliente c) {
		
	}
	
	public List<Cliente> listar() {
		EntityManager em = Conexao.getInstance();
		Query q = em.createQuery("from Cliente");
		return q.getResultList();
	}
	
	public Cliente buscarPorId(Integer id) {
		return null;
	}

}
