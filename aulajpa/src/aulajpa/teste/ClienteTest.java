package aulajpa.teste;

import org.junit.Test;

import aulajpa.dao.ClienteDao;
import aulajpa.entidade.Cliente;

public class ClienteTest {
	
	@Test
	public void salvarCliente() {
		
		Cliente cliente = new Cliente();
		cliente.setNome("Cleverson");
		
		ClienteDao clienteDao = new ClienteDao();
		clienteDao.salvar(cliente);
		
		System.out.println(cliente.getId());
		
	}

}
