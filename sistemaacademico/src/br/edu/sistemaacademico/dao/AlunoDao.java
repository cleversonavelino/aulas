package br.edu.sistemaacademico.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.edu.sistemaacademico.entity.Aluno;

public class AlunoDao implements InterfaceDao<Aluno> {
	
	
	
	public void salvar(Aluno a) {
		EntityManager em = Conexao.getInstance().
				createEntityManager();
		
		em.getTransaction().begin();
		if (a.getId() == null) {
			em.persist(a);
		} else {
			em.merge(a);
		}
		em.getTransaction().commit();
		
		
		em.close();
	}

	@SuppressWarnings("unchecked")
	public List<Aluno> listar() {
		EntityManager em = Conexao.getInstance().
				createEntityManager();
		
		Query q = em.createQuery("from Aluno");
				
		List<Aluno> alunos = q.getResultList();
		em.close();
		
		return alunos;
	}
}
