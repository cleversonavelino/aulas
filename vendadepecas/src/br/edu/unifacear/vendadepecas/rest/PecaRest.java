package br.edu.unifacear.vendadepecas.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.edu.unifacear.vendadepecas.business.BusinessException;
import br.edu.unifacear.vendadepecas.business.FacadeBusiness;
import br.edu.unifacear.vendadepecas.dao.Dao;
import br.edu.unifacear.vendadepecas.dao.FabricaDao;
import br.edu.unifacear.vendadepecas.entity.Peca;

//http://localhost:8080/vendadepecas/rest/pecarest

@Path("/pecarest")
public class PecaRest {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Peca> listar() {
		Dao<Peca> pecaDao = FabricaDao.criarPecaDao();
		List<Peca> pecas = pecaDao.listar();
		return pecas;		
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void inserir(Peca peca) {
		try {
			new FacadeBusiness().inserir(peca);
		} catch (BusinessException e) {			
			e.printStackTrace();
		}
	}
	
}
