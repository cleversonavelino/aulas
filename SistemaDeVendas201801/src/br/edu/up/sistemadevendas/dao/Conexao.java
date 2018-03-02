package br.edu.up.sistemadevendas.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Conexao {
	
	static EntityManagerFactory emf =
			Persistence.
			createEntityManagerFactory("vendas");
	
	public static EntityManager getInstance() {
		return emf.createEntityManager();
	}

}
