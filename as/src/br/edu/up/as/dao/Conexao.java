package br.edu.up.as.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Conexao {
	
	static EntityManagerFactory emf = Persistence.
			createEntityManagerFactory("as");
	
	public static EntityManager getInstance() {
		return emf.createEntityManager();
	}

}
