package up.edu.br.sistemaacademico.dao;

import java.util.List;

import up.edu.br.sistemaacademico.entidades.Aluno;

public class AlunoDao implements Dao<Aluno> {
	
	public void adicionar(Aluno aluno) {
		aluno.setId(1l);
	}
	
	public void editar(Aluno aluno) {
		
	}
	
	public void excluir(Aluno aluno) {
		
	}
	
	public List<Aluno> listar() {
		return null;
	}

}
