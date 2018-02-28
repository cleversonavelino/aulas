package br.edu.up.sistemadevendas.dao;

import java.util.List;

import br.edu.up.sistemadevendas.entity.Cliente;

public class ClienteDao implements Dao<Cliente> {

	@Override
	public void salvar(Cliente cliente) {
		cliente.setId(1);		
	}

	@Override
	public void alterar(Cliente t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluir(Cliente t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Cliente> listar() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
