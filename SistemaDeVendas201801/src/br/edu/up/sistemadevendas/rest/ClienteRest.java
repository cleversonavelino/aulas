package br.edu.up.sistemadevendas.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.edu.up.sistemadevendas.entity.Cliente;
import br.edu.up.sistemadevendas.service.ClienteService;
import br.edu.up.sistemadevendas.service.ServiceException;

@Path("/clienteController")
public class ClienteRest {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Cliente> listar() {
		return new ClienteService().listar();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void salvar(Cliente cliente) {
		try {
			new ClienteService().salvar(cliente);
		} catch (ServiceException e) {
			e.printStackTrace();
		}
	}
	
}
