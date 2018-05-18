package br.edu.up.sistemaacademico.service;

import java.util.List;

import br.edu.up.sistemaacademico.dao.Dao;
import br.edu.up.sistemaacademico.dao.FactoryDao;
import br.edu.up.sistemaacademico.entity.Aluno;

public class AlunoService {
	
	Dao<Aluno> alunoDao = FactoryDao.createAlunoDao();
	
	public void salvar(Aluno aluno) throws ServiceException {
		
		if (aluno == null) {
			throw new ServiceException("O aluno não pode ser vazio!");
		}
		
		if (aluno.getNome() == null || aluno.getNome().equals("")) {
			throw new ServiceException("O nome do aluno não pode ser vazio!");
		}
		
		if (aluno.getId() == null) {
			alunoDao.salvar(aluno);
		} else {
			alunoDao.editar(aluno);
		}
	}

	public Aluno buscar(long id) {
		return alunoDao.buscar(id);
	}

	public List<Aluno> listar() {
		return alunoDao.listar();
	}

	

}
