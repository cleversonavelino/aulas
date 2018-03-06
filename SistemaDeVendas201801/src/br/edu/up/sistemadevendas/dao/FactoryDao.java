package br.edu.up.sistemadevendas.dao;

import br.edu.up.sistemadevendas.entity.Cliente;

public class FactoryDao {
	
	public static Dao<Cliente> createClienteDao() {
		return new ClienteDao2();
	}

}
