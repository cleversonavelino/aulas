package br.edu.up.as.service;


import br.edu.up.as.dao.Dao;
import br.edu.up.as.dao.FactoryDao;
import br.edu.up.as.entidade.Cliente;

public class ClienteService {
	
	public void salvar(Cliente c) throws ServiceException {
		
		if (c.getNome() == null || c.getNome().equals("")) {
			
			throw new 
			ServiceException("ERR01 - O nome precisa ser preenchido.");
		}
		
		Dao<Cliente> clienteDao = FactoryDao.createClienteDao();
		clienteDao.salvar(c);
	}
	
	public void alterar(Cliente c) throws ServiceException {
		
		Dao<Cliente> clienteDao = FactoryDao.createClienteDao();
		clienteDao.alterar(c);
		
		
	}

}
