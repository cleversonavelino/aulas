package br.edu.facear.aulafacear.test;

import org.junit.Test;

import br.edu.facear.aulafacear.dao.ClienteDao;
import br.edu.facear.aulafacear.dao.FactoryDao;
import br.edu.facear.aulafacear.dao.InterfaceDao;
import br.edu.facear.aulafacear.entity.Cliente;

public class TestarCliente {
	
	@Test
	public void cadastrarCliente() {
		
		Cliente c = new Cliente();
		c.setId(null);
		c.setNome("Cleverson");
		c.setCpf("030");
				
		InterfaceDao<Cliente> dao = 
				FactoryDao.createClienteDao();
		dao.salvar(c);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		c = new Cliente();
		c.setId(null);
		c.setNome("Cleverson");
		c.setCpf("030");
		
		
		dao =
				FactoryDao.createClienteDao();
		dao.salvar(c);
		
		c = new Cliente();
		c.setId(null);
		c.setNome("Cleverson");
		c.setCpf("030");
		
		
		dao =
				FactoryDao.createClienteDao();
		dao.salvar(c);
		
				
		
	}
	

}
