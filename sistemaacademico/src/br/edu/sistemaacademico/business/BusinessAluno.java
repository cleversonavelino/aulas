package br.edu.sistemaacademico.business;

import br.edu.sistemaacademico.dao.FactoryDao;
import br.edu.sistemaacademico.dao.InterfaceDao;
import br.edu.sistemaacademico.entity.Aluno;

public class BusinessAluno {

	public void salvar(Aluno a) throws BusinessException {
		
		if (a.getMatricula() == null || 
				a.getMatricula().equals("")) {
			
			throw new 
			BusinessException("RN01 - Matrícula inválida.");
			
		}
		
		InterfaceDao<Aluno> alunoDao = 
				FactoryDao.createAlunoDao();
		alunoDao.salvar(a);
		
	}
	
}
