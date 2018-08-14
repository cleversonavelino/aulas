package br.edu.unifacear.vendadepecas.business;

import java.util.List;

import br.edu.unifacear.vendadepecas.entity.Peca;

public class FacadeBusiness {
	
	public void inserir(Peca peca) throws BusinessException {
		new PecaBusiness().inserir(peca);
	}
	
	public List<Peca> listar() {
		return null; 
	}

}
