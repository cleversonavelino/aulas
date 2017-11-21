package br.edu.up.aula4etapa.dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.edu.up.aula4etapa.entity.Pedido;

public class PedidoDao {
	
	public void inserir(Pedido pedido) {
		EntityManager em = Conexao.getInstance().createEntityManager();
		em.getTransaction().begin();
		em.persist(pedido);
		em.getTransaction().commit();
	}
	
	public Pedido buscar(Integer id) {
		EntityManager em = Conexao.getInstance().createEntityManager();
		Pedido pedido = em.find(Pedido.class, id);
		return pedido;
	}	
	
	@SuppressWarnings("unchecked")
	public ArrayList<Pedido> listar() {
		EntityManager em = Conexao.getInstance().createEntityManager();
		Query q = em.createQuery("from Pedido");
		
		return new ArrayList<Pedido>(q.getResultList());
	}
	
	public void alterar(Pedido pedido) {	
		EntityManager em = Conexao.getInstance().createEntityManager();
		em.getTransaction().begin();
		em.merge(pedido);
		em.getTransaction().commit();
	}
	
	public void remover(Integer id) {	
		EntityManager em = Conexao.getInstance().createEntityManager();
		em.getTransaction().begin();
		Pedido pedido = em.find(Pedido.class, id);		
		em.remove(pedido);
		em.getTransaction().commit();
	}

}
