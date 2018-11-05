package br.edu.facear.sistemadepecasbg.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import br.edu.facear.sistemadepecasbg.dao.ModeloDao;
import br.edu.facear.sistemadepecasbg.entity.Modelo;
import io.swagger.annotations.Api;

@Path("/modelo")
@Api(value = "/modelo")
public class ModeloRest {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Modelo> listar() {
		List<Modelo> modelos = new ModeloDao().listar();
		return modelos;
	}
	
	@GET
	@Path("/id/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Modelo buscar(@QueryParam("id") Integer id) {
		return new ModeloDao().buscar(id);
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void salvar(Modelo modelo) {
		new ModeloDao().salvar(modelo);
	}
	
	

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public void editar(Modelo modelo) {
		new ModeloDao().salvar(modelo);
	}

}
