package br.edu.unifacear.projetointegrador3.teste;

import br.edu.unifacear.projetointegrador3.dao.Dao;
import br.edu.unifacear.projetointegrador3.dao.GenericDao;
import br.edu.unifacear.projetointegrador3.entidade.Carro;
import br.edu.unifacear.projetointegrador3.entidade.Usuario;

public class TestarJPA {

	public static void main(String[] args) {

		Usuario u = new Usuario();
		u.setNome("Cleverson");

		Carro c = new Carro();
		c.setPlaca("AZI-3428");
		
		Dao<Usuario> usuarioDao = new GenericDao<Usuario>();
		usuarioDao.inserir(u);
		
		Dao<Carro> carroDao = new GenericDao<Carro>();
		carroDao.inserir(c);

	}

}
