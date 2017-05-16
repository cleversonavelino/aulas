package br.edu.up.sistemadevenda.dao;

import java.util.List;

public interface InterfaceDao<T> {
	
	public void salvar(T t);
	public void excluir(T t);	
	public List<T> listar();

}
