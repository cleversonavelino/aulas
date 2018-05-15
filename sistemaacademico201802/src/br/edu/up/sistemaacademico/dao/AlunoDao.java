package br.edu.up.sistemaacademico.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.edu.up.sistemaacademico.entity.Aluno;

public class AlunoDao implements Dao<Aluno> {
	
	EntityManagerFactory emf = Persistence.
			createEntityManagerFactory("sistemaacademico");	

	public void salvar(Aluno a) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(a);		
		em.getTransaction().commit();
	}
	
	public void editar(Aluno a) {
		
	}
	
	public void excluir(Aluno a) {
		
	}
	
	public List<Aluno> listar() {
		return null;
	}
	
	

}
