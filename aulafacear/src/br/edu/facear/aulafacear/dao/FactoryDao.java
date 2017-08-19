package br.edu.facear.aulafacear.dao;

import br.edu.facear.aulafacear.entity.Cliente;

public class FactoryDao {

	public static InterfaceDao<Cliente> 
			createClienteDao() {
		return new ClienteDao();
	}
	
}
