package br.edu.up.sistemadevendas.service;

import br.edu.up.sistemadevendas.dao.ClienteDao;
import br.edu.up.sistemadevendas.dao.Dao;
import br.edu.up.sistemadevendas.entity.Cliente;

public class ClienteService {
	
	public void salvar(Cliente cliente) throws ServiceException {
		
		if (cliente.getIdade() == null ||
				cliente.getIdade() < 18) {
			throw new ServiceException("A idade deve ser maior que 18");
		}
		
		
		Dao<Cliente> clienteDao = new ClienteDao();
		clienteDao.salvar(cliente);		
	}

}
