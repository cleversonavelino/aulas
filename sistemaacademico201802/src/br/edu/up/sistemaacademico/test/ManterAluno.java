package br.edu.up.sistemaacademico.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import br.edu.up.sistemaacademico.entity.Aluno;
import br.edu.up.sistemaacademico.service.AlunoService;
import br.edu.up.sistemaacademico.service.ServiceException;

public class ManterAluno {
	
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
		
	}

}
