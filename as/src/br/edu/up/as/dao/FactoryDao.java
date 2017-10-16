package br.edu.up.as.dao;

import br.edu.up.as.entidade.Cliente;

public class FactoryDao {
	
	public static Dao<Cliente> createClienteDao() {
		return new ClienteDao();
	}

}
