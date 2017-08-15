package br.edu.facear.aulafacear.dao;

import java.util.List;

import br.edu.facear.aulafacear.entity.Cliente;

public class ClienteDao implements 
	InterfaceDao<Cliente>, InterfaceLoginDao {
	
	public void excluir(Cliente c) {		
	}
	
	public void salvar(Cliente c) {		
	}
	
	public void alterar(Cliente c) {		
	}
	
	public List<Cliente> listar() {
		return null;
	}

	@Override
	public void login(String login, String senha) {
		// TODO Auto-generated method stub
		
	}

	
	

}
