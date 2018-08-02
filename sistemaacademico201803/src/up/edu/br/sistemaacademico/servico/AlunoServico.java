package up.edu.br.sistemaacademico.servico;

import up.edu.br.sistemaacademico.dao.Dao;
import up.edu.br.sistemaacademico.dao.FabricaDao;
import up.edu.br.sistemaacademico.entidades.Aluno;

public class AlunoServico {
	
	public void adicionar(Aluno aluno) throws ServicoException {
		if (aluno.getMatricula() == null) {
			throw new ServicoException("O campo matricula "
					+ "não pode ser vazio.");
		}
		
		Dao<Aluno> alunoDao = FabricaDao.createDaoAluno();
		alunoDao.adicionar(aluno);
	}

}
