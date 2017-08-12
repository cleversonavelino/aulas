package br.edu.facear.aulafacear.dao;

import java.util.List;

public interface InterfaceDao<T> {

	public void excluir(T t);	
	public void salvar(T t);	
	public void alterar(T t);	
	public List<T> listar();

	
}
