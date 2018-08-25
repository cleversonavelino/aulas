package br.edu.unifacear.vendadepecas.test;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

import br.edu.unifacear.vendadepecas.business.BusinessException;
import br.edu.unifacear.vendadepecas.business.FacadeBusiness;
import br.edu.unifacear.vendadepecas.entity.Peca;

public class PecaTest {
	
	@Test
	public void deveriaCadastrarUmaPeca() {
		
		Peca p = new Peca();
		p.setId(null);
		p.setNome("abc");
		
		try {
			new FacadeBusiness().inserir(p);
		} catch (BusinessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		p = new Peca();
		p.setId(null);
		p.setNome("abcde");
		
		try {
			new FacadeBusiness().inserir(p);
		} catch (BusinessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		assertEquals(true,p.getId() != null);
		
	}	
	
}
