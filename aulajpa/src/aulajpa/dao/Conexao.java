package aulajpa.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Conexao {
	
	static EntityManagerFactory emf = Persistence.
				createEntityManagerFactory("aulajpa");
	
	public static EntityManager createEntityManager() {
		return emf.createEntityManager();
	}

}
