package br.edu.unifacear.vendadepecas.business;

import br.edu.unifacear.vendadepecas.dao.PecaDao;
import br.edu.unifacear.vendadepecas.entity.Peca;

public class PecaBusiness {
	
	public void inserir(Peca peca) throws BusinessException {
		
		if (peca.getNome() == null) {
			throw new BusinessException("Erro: Nome não pode ser vazio");
		}
		
		new PecaDao().inserir(peca);
		
	}

}
