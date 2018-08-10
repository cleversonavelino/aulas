package br.edu.unifacear.vendadepecas.test;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

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
	
	public static void main(String[] args) {
		Date hoje = new Date();
		System.out.println(hoje);
		
		//1.4
		//Calendar calendar = Calendar.getInstance();//return new OldGregorianCalendar();
		
		//1.5
		Calendar calendar = Calendar.getInstance();// return new GregorianCalendar();
		calendar.setTime(hoje);
		
		System.out.println(calendar.getTime());
		
		calendar.add(Calendar.DAY_OF_MONTH, 2);
		
		System.out.println(calendar.getTime());
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
