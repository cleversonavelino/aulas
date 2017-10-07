package br.edu.facear.aulafacear.rest;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.edu.facear.aulafacear.dao.FactoryDao;
import br.edu.facear.aulafacear.dao.InterfaceDao;
import br.edu.facear.aulafacear.entity.Cliente;

@Path("/clienterest")
public class ClienteRest {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Cliente> listarClientes() {		
		InterfaceDao<Cliente> dao = 
				FactoryDao.createClienteDao();
		return new ArrayList<Cliente>(dao.listar());
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void cadastrarCliente(Cliente cliente) {
		InterfaceDao<Cliente> dao = 
				FactoryDao.createClienteDao();
		dao.salvar(cliente);
	}

}
