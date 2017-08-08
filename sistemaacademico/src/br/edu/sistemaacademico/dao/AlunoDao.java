package br.edu.sistemaacademico.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.edu.sistemaacademico.entity.Aluno;

public class AlunoDao implements InterfaceDao<Aluno> {
	
	EntityManagerFactory emf = Persistence.
			createEntityManagerFactory("sistemaacademico");
	
	public void salvar(Aluno a) {
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(a);
		em.getTransaction().commit();
		
		
		em.close();
	}

	@SuppressWarnings("unchecked")
	public List<Aluno> listar() {
		EntityManager em = emf.createEntityManager();
		
		Query q = em.createQuery("from Aluno");
				
		List<Aluno> alunos = q.getResultList();
		em.close();
		
		return alunos;
	}
}
