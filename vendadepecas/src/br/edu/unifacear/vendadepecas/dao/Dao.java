package br.edu.unifacear.vendadepecas.dao;

import java.util.List;

public interface Dao<T> {

	public void inserir(T t);

	public void alterar(T t);

	public void excluir(T t);

	public List<T> listar();

	public T buscarPorId(Integer id);

}
