package br.edu.facear.sistemadepecasbg.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.edu.facear.sistemadepecasbg.dao.PecaDao;
import br.edu.facear.sistemadepecasbg.entity.Peca;
import io.swagger.annotations.Api;

@Path("/peca")
@Api(value = "/peca", description = "Alunos do sistema")
public class PecaRest {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Peca> listar() {
		List<Peca> alunos = new PecaDao().listar();
		return alunos;
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void salvar(Peca peca) {

		new PecaDao().salvar(peca);

	}

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public void editar(Peca peca) {
		new PecaDao().salvar(peca);
	}

}
