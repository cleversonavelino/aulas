package br.edu.up.sistemadevenda.service;

import br.edu.up.sistemadevenda.dao.ClienteDao;
import br.edu.up.sistemadevenda.dao.InterfaceDao;
import br.edu.up.sistemadevenda.entity.Cliente;

public class ClienteService {
	
	public void salvar(Cliente cliente) throws ServiceException {
		
		if (cliente.getIdade() < 18) {
			throw new ServiceException("RN01 - A idade deve ser maior que 18");					
		}
		
		InterfaceDao<Cliente> daoCliente = new ClienteDao();
		daoCliente.salvar(cliente);
	
	}

}
