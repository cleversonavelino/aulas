package br.edu.facear.aulafacear.dao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Conexao {
	
	static EntityManagerFactory emf =
			Persistence.createEntityManagerFactory("aulafacear");
	

	public static EntityManagerFactory getInstance() {
		return emf;
	}
}
