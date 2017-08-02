package br.edu.sistemaacademico.dao;

import java.util.List;

public interface InterfaceDao<T> {
	
	public void salvar(T t);

	public List<T> listar();

}
