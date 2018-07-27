package up.edu.br.sistemaacademico.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

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
		return null;
	}

}
