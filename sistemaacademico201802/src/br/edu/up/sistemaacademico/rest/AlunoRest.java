package br.edu.up.sistemaacademico.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.edu.up.sistemaacademico.entity.Aluno;
import br.edu.up.sistemaacademico.service.AlunoService;
import br.edu.up.sistemaacademico.service.ServiceException;
import io.swagger.annotations.Api;

@Path("/aluno")
@Api(value = "/aluno", description = "Alunos do sistema")
public class AlunoRest {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Aluno> listar() {
		List<Aluno> alunos = new AlunoService().listar();
		return alunos;
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void salvar(Aluno aluno) {
		try {
			new AlunoService().salvar(aluno);
		} catch (ServiceException e) {			
			e.printStackTrace();
		}
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public void editar(Aluno aluno) {
		try {
			new AlunoService().salvar(aluno);
		} catch (ServiceException e) {			
			e.printStackTrace();
		}
	}
	

}
