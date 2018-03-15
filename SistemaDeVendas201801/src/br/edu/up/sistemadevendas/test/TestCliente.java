package br.edu.up.sistemadevendas.test;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.FixMethodOrder;
import org.junit.Test;

import br.edu.up.sistemadevendas.entity.Cliente;
import br.edu.up.sistemadevendas.service.ClienteService;
import br.edu.up.sistemadevendas.service.ServiceException;

@FixMethodOrder()
public class TestCliente {

	static Integer id;
	
	public void deveriaGerenciarUmCliente() {
		deveriaAlterarUmCliente();;
		deveriaAlterarUmCliente();
	}
	
	
	@Test
	public void deveriaCadastrarUmCliente() {
		
		Cliente c = new Cliente();
		c.setId(null);
		c.setNome("Cleverson");
		c.setIdade(18);
		
		try {
			new ClienteService().salvar(c);
		} catch (ServiceException e) {
			e.printStackTrace();
		}		
		
		id = c.getId();
		assertEquals(true, c.getId() != null);	
			
	}
	
	@Test
	public void deveriaAlterarUmCliente() {
		
		ClienteService s = new ClienteService();
		
		Cliente c = s.buscar(id);
		c.setNome("abc");		
		
		try {
			new ClienteService().alterar(c);
		} catch (ServiceException e) {
			e.printStackTrace();
		}	
		
		c = s.buscar(id);
		
		assertEquals(true, c.getNome().equals("abc"));	
			
	}
	
	@Test
	public void deveriaListarClientes() {
		
		ClienteService s = new ClienteService();
		List<Cliente> clientes = s.listar();
		
		assertEquals(true, clientes.size() > 0);	
			
	}
	
}
