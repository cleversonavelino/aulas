package br.edu.up.sistemaacademico.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import br.edu.up.sistemaacademico.entity.Aluno;
import br.edu.up.sistemaacademico.service.AlunoService;
import br.edu.up.sistemaacademico.service.ServiceException;

@FixMethodOrder(MethodSorters.JVM)
public class ManterAluno {
	
	static Long id;
	
	@Test
	public void deveriaCadastrarUmAluno() {
		
		Aluno a = new Aluno();
		a.setId(null);
		a.setNome("Cleverson");
		a.setMatricula("12345");
		
		try {
			new AlunoService().salvar(a);
		} catch (ServiceException e) {			
			e.printStackTrace();
		}
		
		assertEquals(true,a.getId() != null);
		id = a.getId();
	}
	
	@Test
	public void deveriaAlterarUmAluno() {
		
		Aluno a = new AlunoService().buscar(id);
		
		a.setNome("ABC");
		
		try {
			new AlunoService().salvar(a);
		} catch (ServiceException e) {			
			e.printStackTrace();
		}
		
		a = new AlunoService().buscar(id);
		
		assertEquals(true,a.getNome().equals("ABC"));
		
	}
	
	@Test
	public void deveriaListarOsAlunos() {
		List<Aluno> alunos = new AlunoService().listar();
		
		assertEquals(true,alunos != null && alunos.size() > 0);
	}
	
}
