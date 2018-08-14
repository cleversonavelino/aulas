package br.edu.facear.sistemadepecasbg.dao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Conexao { 
	
	static EntityManagerFactory emf = Persistence.
			createEntityManagerFactory("sistemadepecas");	
	
	public static EntityManagerFactory getInstance() {
		return emf;
	}


}
