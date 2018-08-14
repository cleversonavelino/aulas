package br.edu.unifacear.vendadepecas.dao;

import java.util.List;

import br.edu.unifacear.vendadepecas.entity.Peca;

public class PecaDao implements Dao<Peca> {
	
	public void inserir(Peca peca) {
		peca.setId(1);
		
	}
	
	public void alterar(Peca peca) {
		
	}
	
	public void excluir(Peca peca) {
		
	}
	
	public List<Peca> listar() {
		return null;
	}
	
	public Peca buscarPorId(Integer id) {
		return null;
	}

}
