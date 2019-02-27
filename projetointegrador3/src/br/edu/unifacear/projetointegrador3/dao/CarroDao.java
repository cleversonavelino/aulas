package br.edu.unifacear.projetointegrador3.dao;

import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;

import br.edu.unifacear.projetointegrador3.entidade.Carro;

public class CarroDao implements Dao<Carro> {
	
	@Override
	public void inserir(Carro carro) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(carro);
		em.getTransaction().commit();
		em.close();			
	}

	@Override
	public void alterar(Carro carro) {
		// TODO Auto-generated method stub
		
	}

	

	@Override
	public void excluir(Carro carro) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Carro> listarTodos(Class<Carro> c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Carro> listarWhere(Class<Carro> c, String where, Map<String, Object> argumentos) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
