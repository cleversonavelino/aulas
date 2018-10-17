package br.edu.unifacear.vendadepecas.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.edu.unifacear.vendadepecas.business.BusinessException;
import br.edu.unifacear.vendadepecas.business.FacadeBusiness;
import br.edu.unifacear.vendadepecas.dao.Dao;
import br.edu.unifacear.vendadepecas.dao.FabricaDao;
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
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Dao<Peca> pecaDao = FabricaDao.criarPecaDao();
		pecaDao.inserir(new Peca());
		
		
		//1.4
		//Calendar calendario = new GregorianCalendar();
		
		//1.5
		//Calendar calendario = new AdvancedGregorianCalendar();
		
		//Calendar calendario = Calendar.getInstance();
		
		
		
		
		
		
		
		
		
		
	}	
	
}
