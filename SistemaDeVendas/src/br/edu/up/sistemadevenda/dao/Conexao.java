package br.edu.up.sistemadevenda.dao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Conexao {
	
	static EntityManagerFactory emf = Persistence.
			createEntityManagerFactory("SistemaDeVendas");

	public static EntityManagerFactory getInstance() {
		return emf;
	}
	
}
