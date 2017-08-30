package br.edu.up.aula.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Conexao {

	static EntityManagerFactory emf = Persistence.
			createEntityManagerFactory("aula");
	
	public static EntityManager getInstance() {
		return emf.createEntityManager();
	}
	
}
