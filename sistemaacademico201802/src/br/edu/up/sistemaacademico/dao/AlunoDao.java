package br.edu.up.sistemaacademico.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.edu.up.sistemaacademico.entity.Aluno;

public class AlunoDao implements Dao<Aluno> {
	
	
	public void salvar(Aluno a) {
		EntityManager em = Conexao.getInstance().createEntityManager();
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
