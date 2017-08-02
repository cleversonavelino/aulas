package br.edu.sistemaacademico.dao;

import java.util.ArrayList;
import java.util.List;

import br.edu.sistemaacademico.entity.Aluno;

public class AlunoDao implements InterfaceDao<Aluno> {
	
	static List<Aluno> alunos = new ArrayList<Aluno>();
	static Long counter = new Long(0);
	
	public void salvar(Aluno a) {
		a.setId(counter);
		alunos.add(a);
		counter++;
		
	}

	public List<Aluno> listar() {
		return alunos;
	}

}
