package up.edu.br.sistemaacademico.dao;

import up.edu.br.sistemaacademico.entidades.Aluno;

public class FabricaDao {
	
	public static Dao<Aluno> createDaoAluno() {
		return new AlunoDao();
	}

}
