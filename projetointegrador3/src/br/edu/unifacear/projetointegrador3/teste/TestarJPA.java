package br.edu.unifacear.projetointegrador3.teste;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.edu.unifacear.projetointegrador3.dao.Dao;
import br.edu.unifacear.projetointegrador3.dao.GenericDao;
import br.edu.unifacear.projetointegrador3.entidade.Carro;
import br.edu.unifacear.projetointegrador3.entidade.Usuario;

public class TestarJPA {

	public static void main(String[] args) {

		//Usuario u = new Usuario();
		//u.setNome("Cleverson");

		//Carro c = new Carro();
		//c.setPlaca("AZI-3428");
		
		//Dao<Usuario> usuarioDao = new GenericDao<Usuario>();
		//usuarioDao.inserir(u);
		
		//Dao<Carro> carroDao = new GenericDao<Carro>();
		//carroDao.inserir(c);
		
		Dao<Carro> carroDao = new GenericDao<Carro>();
		
		Map<String,Object> argumentos = new HashMap<String,Object>();
		argumentos.put("placa", "AZI-3428");
		
		String where = "where t.placa = :placa ";
		
		List<Carro> carros = carroDao.listarWhere(Carro.class, 
				where, argumentos);
		for (Carro c : carros) {
			System.out.println(c.getPlaca());
		}
		
		
		
		
		
		
		
		
		Dao<Usuario> usuarioDao = new GenericDao<Usuario>();
		
		argumentos = new HashMap<String,Object>();
		argumentos.put("nome", "Cleverson");
		
		where = "where t.nome = :nome ";
		
		List<Usuario> usuarios = usuarioDao.listarWhere(Usuario.class, 
				where, argumentos);
		for (Usuario u : usuarios) {
			System.out.println(u.getNome());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
