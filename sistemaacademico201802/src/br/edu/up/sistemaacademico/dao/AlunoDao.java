package br.edu.up.sistemaacademico.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.edu.up.sistemaacademico.entity.Aluno;

public class AlunoDao implements Dao<Aluno> {
	
	
	public void salvar(Aluno a) {
		EntityManager em = Conexao.getInstance().createEntityManager();
		em.getTransaction().begin();
		em.persist(a);		
		em.getTransaction().commit();
	}
	
	public void editar(Aluno a) {
		EntityManager em = Conexao.getInstance().createEntityManager();
		em.getTransaction().begin();
		em.merge(a);		
		em.getTransaction().commit();
	}
	
	public void excluir(Aluno a) {
		
	}
	
	public List<Aluno> listar() {
		EntityManager em = Conexao.getInstance().createEntityManager();
		Query q = em.createQuery("select a from Aluno a");
		return q.getResultList();		
	}

	@Override
	public Aluno buscar(Long id) {
		EntityManager em = Conexao.getInstance().createEntityManager();
		return em.find(Aluno.class, id);
	}
	
	

}
