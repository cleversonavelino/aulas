package br.edu.unifacear.vendadepecas.test;

import static org.junit.Assert.*;

import org.junit.Test;

import br.edu.unifacear.vendadepecas.business.BusinessException;
import br.edu.unifacear.vendadepecas.business.PecaBusiness;
import br.edu.unifacear.vendadepecas.entity.Peca;

public class PecaTest {
	
	@Test
	public void deveriaCadastrarUmaPeca() {
		
		Peca p = new Peca();
		p.setId(null);
		p.setNome("abc");
		
		try {
			new PecaBusiness().inserir(p);
		} catch (BusinessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertEquals(true,p.getId() != null);
		
	}

}
