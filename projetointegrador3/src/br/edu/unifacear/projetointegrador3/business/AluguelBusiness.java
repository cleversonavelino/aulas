package br.edu.unifacear.projetointegrador3.business;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import br.edu.unifacear.projetointegrador3.dao.Dao;
import br.edu.unifacear.projetointegrador3.dao.GenericDao;
import br.edu.unifacear.projetointegrador3.entidade.Aluguel;
import br.edu.unifacear.projetointegrador3.entidade.Fita;

public class AluguelBusiness {
	
	
	
	public String inserir(Aluguel aluguel) throws BusinessException {
		
		if (aluguel.getFitas() == null || 
				aluguel.getFitas().size() == 0) {
			throw new BusinessException("Pelo menos uma fita deve ser inserida");
		}
		
		Dao<Aluguel> daoAluguel = new GenericDao<Aluguel>();
		//validar se a fita não está locada
		String query = "select a from Aluguel where a.fitas.id "
				+ " in (:ids) and a.dataDevolucao <= :agora ";
		String ids = "";
		for (Fita f : aluguel.getFitas()) {
			ids = ids + f.getId() + ",";			
		}
		
		HashMap<String,Object> argumentos = new HashMap<String,Object>();
		argumentos.put("ids", ids);
		argumentos.put("agora",new Date());
		
		List<Aluguel> alugueis = 
				daoAluguel.listarWhere(Aluguel.class, query, argumentos);
		if (alugueis.size() > 0) {
			throw new BusinessException("aluguel não pode ser inserido");
		}
		
		daoAluguel.inserir(aluguel);
		return null;
	}

}
