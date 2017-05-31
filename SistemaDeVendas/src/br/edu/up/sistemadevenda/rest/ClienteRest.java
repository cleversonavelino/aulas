package br.edu.up.sistemadevenda.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.edu.up.sistemadevenda.business.BusinessException;
import br.edu.up.sistemadevenda.business.ClienteBusiness;
import br.edu.up.sistemadevenda.dao.ClienteDao;
import br.edu.up.sistemadevenda.entity.Cliente;

@Path("/clienterest")
public class ClienteRest {

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void salvar(Cliente cliente) {
		try {
			new ClienteBusiness().salvar(cliente);
		} catch (BusinessException e) {			
			e.printStackTrace();
		}	
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Cliente> listar() {
		List<Cliente> listaClientes = new ClienteDao().listar();
		return listaClientes;
	}
	
}
