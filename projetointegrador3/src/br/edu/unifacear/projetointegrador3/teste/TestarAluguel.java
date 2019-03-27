package br.edu.unifacear.projetointegrador3.teste;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

import br.edu.unifacear.projetointegrador3.business.AluguelBusiness;
import br.edu.unifacear.projetointegrador3.business.BusinessException;
import br.edu.unifacear.projetointegrador3.dao.Dao;
import br.edu.unifacear.projetointegrador3.dao.GenericDao;
import br.edu.unifacear.projetointegrador3.entidade.Aluguel;
import br.edu.unifacear.projetointegrador3.entidade.Cliente;
import br.edu.unifacear.projetointegrador3.entidade.Fita;

public class TestarAluguel {
	
	@Test
	public void deveriaRealizarUmAluguel() {
		
		Cliente cliente = new Cliente();
		cliente.setNome("Cleverson");
		Dao<Cliente> daoCliente = new GenericDao<Cliente>();
		daoCliente.inserir(cliente);
		
		Fita a = new Fita();
		a.setCodigo("ABC1234");
		a.setTitulo("Kickboxer");
		a.setCategoria("Luta");
		a.setDuracao("1h40m");
		
		Fita b = new Fita();
		b.setCodigo("ABC1235");
		b.setTitulo("O Hobbit");
		b.setCategoria("Viagem Astral");
		b.setDuracao("3h00m");
		
		Dao<Fita> daoFita = new GenericDao<Fita>();
		daoFita.inserir(a);
		daoFita.inserir(b);
		
		Aluguel aluguel = new Aluguel();
		aluguel.setCliente(cliente);
		
		aluguel.setFitas(new ArrayList<Fita>());
		aluguel.getFitas().add(a);
		aluguel.getFitas().add(b);
		
		aluguel.setDataAluguel(new Date());
		
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_MONTH, 2);
		calendar.set(Calendar.HOUR, 23);
		calendar.set(Calendar.MINUTE, 59);
		calendar.set(Calendar.SECOND, 59);
		
		aluguel.setDataDevolucao(calendar.getTime());
		
		try {
			new AluguelBusiness().inserir(aluguel);
		} catch (BusinessException e) {
			e.printStackTrace();
		}
		//Dao<Aluguel> daoAluguel = new GenericDao<Aluguel>();
		//daoAluguel.inserir(aluguel);
		
	}

}
