package br.edu.unifacear.projetointegrador3.dao;

import java.util.List;
import java.util.Map;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public interface Dao<T> {
	
	static EntityManagerFactory emf = Persistence.
			createEntityManagerFactory("projetointegrador3");
	
	public void inserir(T t);
	
	public void alterar(T t);
	
	public List<T> listarTodos(Class<T> c);
	
	public List<T> listarWhere(Class<T> c, String where,
			Map<String,Object> argumentos);

	public void excluir(T t);

}
