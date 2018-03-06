package br.edu.up.sistemadevendas.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Conexao {
	
	public EntityManagerFactory emf =
			Persistence.
			createEntityManagerFactory("vendas");
	
	public EntityManager getInstance() {
		return emf.createEntityManager();
	}

}
