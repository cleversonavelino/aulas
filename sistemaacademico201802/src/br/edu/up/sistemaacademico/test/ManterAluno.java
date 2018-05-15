package br.edu.up.sistemaacademico.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

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
	
	public static void main(String[] args) {
		Date hoje = new Date();
		System.out.println(hoje);
		
		//java 1.4
		//Calendar calendar = new GregorianCalendarAdvance();
		
		//java 1.8
		//Calendar calendar = new GregorianCalendar();
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(hoje);
		
		calendar.add(Calendar.DAY_OF_MONTH, 2);
		
		Date entrega = calendar.getTime();
		System.out.println(entrega);
		
	}

}
