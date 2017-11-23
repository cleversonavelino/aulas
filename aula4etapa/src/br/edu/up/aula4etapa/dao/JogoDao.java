package br.edu.up.aula4etapa.dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.edu.up.aula4etapa.entity.Jogo;

public class JogoDao {
	
	public void inserir(Jogo jogo) {
		EntityManager em = Conexao.getInstance().createEntityManager();
		em.getTransaction().begin();
		em.persist(jogo);
		em.getTransaction().commit();
	}
	
	public Jogo buscar(Integer id) {
		EntityManager em = Conexao.getInstance().createEntityManager();
		Jogo jogo = em.find(Jogo.class, id);
		return jogo;
	}	
	
	public ArrayList<Jogo> listar() {
		EntityManager em = Conexao.getInstance().createEntityManager();
		Query q = em.createQuery("select j from Jogo j");
		
		return new ArrayList<Jogo>(q.getResultList());
	}
	
	public void alterar(Jogo jogo) {	
		EntityManager em = Conexao.getInstance().createEntityManager();
		em.getTransaction().begin();
		em.merge(jogo);
		em.getTransaction().commit();
	}
	
	public void remover(Integer id) {	
		EntityManager em = Conexao.getInstance().createEntityManager();
		em.getTransaction().begin();
		Jogo jogo = em.find(Jogo.class, id);		
		em.remove(jogo);
		em.getTransaction().commit();
	}

}
