package br.edu.unifacear.vendadepecas.business;

import br.edu.unifacear.vendadepecas.dao.Dao;
import br.edu.unifacear.vendadepecas.dao.FabricaDao;
import br.edu.unifacear.vendadepecas.entity.Peca;

public class PecaBusiness {
	
	public void inserir(Peca peca) throws BusinessException {
		
		if (peca.getNome() == null) { 
			throw new BusinessException("Erro: Nome n�o pode ser vazio");
		}
		
		//c�digo da valida��o adicional
		//
		
		Dao<Peca> pecaDao = FabricaDao.criarPecaDao();
		pecaDao.inserir(peca);
		
	}

}
