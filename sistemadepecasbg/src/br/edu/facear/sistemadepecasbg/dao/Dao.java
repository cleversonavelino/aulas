package br.edu.facear.sistemadepecasbg.dao;

import java.util.List;

public interface Dao<T> {
	
	public void salvar(T t);	
	public void editar(T t);	
	public void excluir(T t);	
	public List<T> listar();
	public T buscar(Long id);

}
