package br.edu.unifacear.projetointegrador3.dao;

import java.util.List;

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
	public List<Carro> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void excluir(Carro carro) {
		// TODO Auto-generated method stub
		
	}
	
	

}
