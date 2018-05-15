package br.edu.up.sistemaacademico.service;

import br.edu.up.sistemaacademico.dao.Dao;
import br.edu.up.sistemaacademico.dao.FactoryDao;
import br.edu.up.sistemaacademico.entity.Aluno;

public class AlunoService {
	
	public void salvar(Aluno aluno) throws ServiceException {
		
		if (aluno == null) {
			throw new ServiceException("O aluno não pode ser vazio!");
		}
		
		if (aluno.getNome() == null || aluno.getNome().equals("")) {
			throw new ServiceException("O nome do aluno não pode ser vazio!");
		}
		
		Dao<Aluno> alunoDao = FactoryDao.createAlunoDao();
		alunoDao.salvar(aluno);
	}

}
