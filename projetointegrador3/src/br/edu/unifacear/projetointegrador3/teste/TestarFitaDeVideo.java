package br.edu.unifacear.projetointegrador3.teste;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import br.edu.unifacear.projetointegrador3.dao.Dao;
import br.edu.unifacear.projetointegrador3.dao.GenericDao;
import br.edu.unifacear.projetointegrador3.entidade.Fita;

public class TestarFitaDeVideo {
	
	//cadastrar uma fita
	//alterar uma fita
	//listar uma fita
	//excluir uma fita
	
	@Test
	public void deveriaCadastarUmaFitaDeVideo() {
		
		Fita fita = new Fita();
		fita.setCodigo("ABC1234");
		fita.setTitulo("Kickboxer");
		fita.setCategoria("Luta");
		fita.setDuracao("1h40m");
		
		Dao<Fita> daoFita = new GenericDao<Fita>();
		daoFita.inserir(fita);
		
		assertEquals(true, fita.getId() != null);
		
	}
	
	@Test
	public void deveriaListarUmFita() {
		Dao<Fita> daoFita = new GenericDao<Fita>();
		List<Fita> fitas = daoFita.listarTodos(Fita.class);
		
		assertEquals(true, fitas.size() > 0);
		
	}

}
