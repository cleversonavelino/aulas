package br.edu.up.sistemadevenda.business;

import br.edu.up.sistemadevenda.dao.ClienteDao;
import br.edu.up.sistemadevenda.dao.InterfaceDao;
import br.edu.up.sistemadevenda.entity.Cliente;

public class ClienteBusiness {
	
	public void salvar(Cliente c) throws BusinessException {
		
		if (c.getIdade() < 18) {
			throw new BusinessException("RN01 - Idade deve ser maior que 18");
		}
		
		InterfaceDao<Cliente> clienteDao = new ClienteDao();
		clienteDao.salvar(c);
	
	}

}
