package br.edu.unifacear.vendadepecas.dao;

import br.edu.unifacear.vendadepecas.entity.Peca;

public class FabricaDao {
	
	public static Dao<Peca> criarPecaDao() {
		return new PecaDao();
	}

}
