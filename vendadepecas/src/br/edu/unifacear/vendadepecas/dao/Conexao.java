package br.edu.unifacear.vendadepecas.dao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Conexao {
	
	private static EntityManagerFactory emf = Persistence.
			createEntityManagerFactory("as");
	
	public static EntityManagerFactory getInstance() {
		return emf;
	}

}
