package up.edu.br.sistemaacademico.servico;

import up.edu.br.sistemaacademico.dao.AlunoDao;
import up.edu.br.sistemaacademico.entidades.Aluno;

public class AlunoServico {
	
	public void adicionar(Aluno aluno) {
		if (aluno.getMatricula() == null) {
			//erro
		}
		new AlunoDao().adicionar(aluno);
	}

}
