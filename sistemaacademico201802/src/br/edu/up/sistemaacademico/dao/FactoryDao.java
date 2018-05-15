package br.edu.up.sistemaacademico.dao;

import br.edu.up.sistemaacademico.entity.Aluno;

public class FactoryDao {
	
	public static Dao<Aluno> createAlunoDao() {
		return new AlunoDao();
	}

}
