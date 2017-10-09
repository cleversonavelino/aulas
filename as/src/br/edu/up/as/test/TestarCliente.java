package br.edu.up.as.test;

import static org.junit.Assert.*;

import org.junit.Test;

import br.edu.up.as.dao.ClienteDao;
import br.edu.up.as.entidade.Cliente;

public class TestarCliente {
	
	@Test
	public void cadastrarCliente() {
		
		Cliente c = new Cliente();
		c.setId(null);
		c.setNome("Cleverson");
		
		new ClienteDao().salvar(c);
		
		assertEquals(true,c.getId() != null);
		
	}

}
