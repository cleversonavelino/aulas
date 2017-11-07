package br.edu.up.aula4etapa.dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.edu.up.aula4etapa.entity.Jogo;

public class JogoDao {
	
	EntityManagerFactory emf = Persistence.
			createEntityManagerFactory("aula4etapa");
	
	public void inserir(Jogo jogo) {
		EntityManager em = emf.createEntityManager();
		em.persist(jogo);
	}
	
	public Jogo buscar(Integer id) {
		return null;
	}	
	
	public ArrayList<Jogo> listar() {
		return null;
	}
	
	public void alterar(Jogo jogo) {		
	}
	
	public void remover() {		
	}

}
