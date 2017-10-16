package br.edu.up.as.service;


import br.edu.up.as.dao.ClienteDao;
import br.edu.up.as.entidade.Cliente;

public class ClienteService {
	
	public void salvar(Cliente c) throws ServiceException {
		
		if (c.getNome() == null || c.getNome().equals("")) {
			
			throw new 
			ServiceException("ERR01 - O nome precisa ser preenchido.");
		}
		
		new ClienteDao().salvar(c);		
	}

}
