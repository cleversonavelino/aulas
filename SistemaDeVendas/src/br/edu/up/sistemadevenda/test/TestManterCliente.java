package br.edu.up.sistemadevenda.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import br.edu.up.sistemadevenda.business.BusinessException;
import br.edu.up.sistemadevenda.business.ClienteBusiness;
import br.edu.up.sistemadevenda.dao.ClienteDao;
import br.edu.up.sistemadevenda.entity.Cliente;


public class TestManterCliente {
	
	@Test
	public void testarManterCliente() {
		
		//rotina de cadastro
		Cliente c = new Cliente();
		c.setId(null);
		c.setNome("Nome do Cliente");
		c.setIdade(35);
		c.setGenero("Masculino");
		
		try {
			new ClienteBusiness().salvar(c);
		} catch (BusinessException e) {			
			e.printStackTrace();
		}	
		
		Assert.assertEquals(true,c.getId() != null);		
		
		new ArrayList<Cliente>();
		
		List<Cliente> listaClientes = new ClienteDao().listar();
		
		Assert.assertEquals(true,listaClientes.size()>0);
		
	}

	

}
