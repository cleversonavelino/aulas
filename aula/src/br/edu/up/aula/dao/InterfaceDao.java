package br.edu.up.aula.dao;

import java.util.List;

public interface InterfaceDao<T> {
	
	public void inserir(T t);
	
	public void atualizar(T t);
	
	public void remover(T t);
	
	public T buscar(Long id);
	
	public List<T> listar();

}
