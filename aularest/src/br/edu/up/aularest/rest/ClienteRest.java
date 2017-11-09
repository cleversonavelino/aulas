package br.edu.up.aularest.rest;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.edu.up.aularest.dao.ClienteDao;
import br.edu.up.aularest.entidade.Cliente;

@Path("/clienterest")
public class ClienteRest {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Cliente> listar() {
		return new ArrayList<Cliente>(new ClienteDao().listar());
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void salvar(Cliente cliente) {
		new ClienteDao().salvar(cliente);
	}

}
