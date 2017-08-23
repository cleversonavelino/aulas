package br.edu.sistemaacademico.ws;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.edu.sistemaacademico.business.BusinessAluno;
import br.edu.sistemaacademico.business.BusinessException;
import br.edu.sistemaacademico.dao.AlunoDao;
import br.edu.sistemaacademico.entity.Aluno;

@Path("/alunorest")
public class AlunoRest {
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void salvar(Aluno aluno) {
		try {
			BusinessAluno businessAluno = new BusinessAluno();
			businessAluno.salvar(aluno);
		} catch (BusinessException e) {			
			e.printStackTrace();
		}
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Aluno> listar() {
		return (ArrayList<Aluno>) new AlunoDao().listar();
	}
	

}
