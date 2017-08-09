package br.edu.sistemaacademico.dao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Conexao {
	
	static EntityManagerFactory emf = Persistence.
			createEntityManagerFactory("sistemaacademico");
	
	public static EntityManagerFactory getInstance() {
		return emf;
	}

}
