package up.edu.br.sistemaacademico.dao;

import java.util.List;

public interface Dao<T> {

	public void adicionar(T t);

	public void editar(T t);

	public void excluir(T t);

	public List<T> listar();

}
