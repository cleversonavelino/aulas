package br.edu.facear.aulafacear.dao;

import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import br.edu.facear.aulafacear.entity.Cliente;

public class ClienteDao implements InterfaceDao<Cliente> {

	EntityManagerFactory emf = Conexao.getInstance();
	
	public void excluir(Cliente c) {
	}

	public void salvar(Cliente c) {
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(c);
		em.getTransaction().commit();
		
		em.close();		
	}

	public void alterar(Cliente c) {
	}

	public List<Cliente> listar() {
		EntityManager em = Conexao.getInstance().
				createEntityManager();
		Query q = em.createQuery("from Cliente");
		
		return q.getResultList();
	}
	
	public List<Cliente> listar(String query, 
			Map<String,String> campos) {
		EntityManager em = Conexao.getInstance().
				createEntityManager();
		Query q = em.createQuery("from Cliente where " + query );
		for (String campo : campos.keySet()) {
			q.setParameter(campo, campos.get(campo));
		}
		
		return q.getResultList();
	}

}
