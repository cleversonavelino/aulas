package br.edu.unifacear.projetointegrador3.dao;

import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public interface Dao<T> {
	
	static EntityManagerFactory emf = Persistence.
			createEntityManagerFactory("projetointegrador3");
	
	public void inserir(T t);
	
	public void alterar(T t);
	
	public List<T> listar();

	public void excluir(T t);

}
