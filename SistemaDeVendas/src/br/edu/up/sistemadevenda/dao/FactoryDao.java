package br.edu.up.sistemadevenda.dao;

import br.edu.up.sistemadevenda.entity.Cliente;

public class FactoryDao {
	
	public static InterfaceDao<Cliente> createClienteDao() {
		return new ClienteDao();
	}

}
