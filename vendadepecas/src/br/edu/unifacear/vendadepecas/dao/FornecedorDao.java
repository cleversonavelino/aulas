package br.edu.unifacear.vendadepecas.dao;

import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.edu.unifacear.vendadepecas.entity.Fornecedor;

public class FornecedorDao implements Dao<Fornecedor> {

	static EntityManagerFactory emf = Persistence.
			createEntityManagerFactory("as");
	
	@Override
	public void inserir(Fornecedor t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alterar(Fornecedor t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluir(Fornecedor t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Fornecedor> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Fornecedor buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
