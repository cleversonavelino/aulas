package br.edu.sistemaacademico.dao;

import br.edu.sistemaacademico.entity.Aluno;

public class FactoryDao {
	
	public static InterfaceDao<Aluno> createAlunoDao() {
		return new AlunoDao();
	}
	
	
}
