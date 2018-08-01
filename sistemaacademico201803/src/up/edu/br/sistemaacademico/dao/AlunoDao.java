package up.edu.br.sistemaacademico.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import up.edu.br.sistemaacademico.entidades.Aluno;

public class AlunoDao implements Dao<Aluno> {
	
	EntityManagerFactory emf = Persistence.
			createEntityManagerFactory("sistemaacademico");
	
	
	public void adicionar(Aluno aluno) {
		EntityManager em = emf.createEntityManager();		
		em.getTransaction().begin();
		em.persist(aluno);
		em.getTransaction().commit();
	}
	
	public void editar(Aluno aluno) {
		
	}
	
	public void excluir(Aluno aluno) {
		
	}
	
	public List<Aluno> listar() {
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("select a from Aluno a");
		return q.getResultList();
	}

}
