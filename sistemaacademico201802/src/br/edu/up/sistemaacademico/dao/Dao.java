package br.edu.up.sistemaacademico.dao;

import java.util.List;

public interface Dao<T> {
	
	public void salvar(T t);	
	public void editar(T t);	
	public void excluir(T t);	
	public List<T> listar();
	public T buscar(Long id);

}
