package up.edu.br.sistemaacademico.teste;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import up.edu.br.sistemaacademico.entidades.Aluno;
import up.edu.br.sistemaacademico.servico.AlunoServico;
import up.edu.br.sistemaacademico.servico.ServicoException;

public class TestarAluno {
	
	@Test
	public void deveriaCadastrarUmAluno() {
		Aluno a = new Aluno();
		a.setId(null);
		a.setNome("Cleverson");
		a.setMatricula("12345");
		
		try {
			new AlunoServico().adicionar(a);
		} catch (ServicoException e) {
			e.printStackTrace();
		}
		
		assertEquals(true, a.getId() != null);
	}

}
