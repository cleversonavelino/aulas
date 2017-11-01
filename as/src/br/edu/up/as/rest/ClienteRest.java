package br.edu.up.as.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import br.edu.up.as.dao.ClienteDao;
import br.edu.up.as.entidade.Cliente;
import br.edu.up.as.service.ClienteService;
import br.edu.up.as.service.ServiceException;

@Path("/detalhecliente")
public class ClienteRest {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Cliente> listarClientes(
			@QueryParam("id") Integer id) {
		List<Cliente> clientes = new ClienteDao().listar();
		return new ArrayList<>(clientes);
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void cadastrarCliente(Cliente cliente) {
		try {
			new ClienteService().salvar(cliente);
		} catch (ServiceException e) {
			e.printStackTrace();
		}
	}

	@DELETE
	@Consumes(MediaType.APPLICATION_JSON)
	public void deletarCliente(Cliente cliente) {
		System.out.println("DEVERIA EXCLUIR");
	}

}
