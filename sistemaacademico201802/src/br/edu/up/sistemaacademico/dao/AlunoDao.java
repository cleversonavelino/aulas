package br.edu.up.sistemaacademico.dao;

import java.util.List;

import br.edu.up.sistemaacademico.entity.Aluno;

public class AlunoDao implements Dao<Aluno> {

	public void salvar(Aluno a) {
		a.setId(1l);		
	}
	
	public void editar(Aluno a) {
		
	}
	
	public void excluir(Aluno a) {
		
	}
	
	public List<Aluno> listar() {
		return null;
	}
	
	

}
