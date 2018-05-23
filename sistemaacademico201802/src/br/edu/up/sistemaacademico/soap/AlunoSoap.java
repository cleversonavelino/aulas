package br.edu.up.sistemaacademico.soap;

import java.util.List;

import br.edu.up.sistemaacademico.entity.Aluno;
import br.edu.up.sistemaacademico.service.AlunoService;
import br.edu.up.sistemaacademico.service.ServiceException;

public class AlunoSoap {
	
	public Aluno[] listar() {
	/*	List<Aluno> alunos = new AlunoService().listar();
		Aluno[] alunosArray = new Aluno[alunos.size()];
		return alunos.toArray(alunosArray);*/
		System.out.println("listar");
		return null;
	}
	
	public void salvar(Aluno aluno) {
		/*try {
			new AlunoService().salvar(aluno);
		} catch (ServiceException e) {			
			e.printStackTrace();
		}*/
		System.out.println("cadastrar");
	}

}
