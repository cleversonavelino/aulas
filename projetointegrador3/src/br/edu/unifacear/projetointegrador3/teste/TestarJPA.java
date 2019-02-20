package br.edu.unifacear.projetointegrador3.teste;

import java.util.List;

import br.edu.unifacear.projetointegrador3.dao.UsuarioDao;
import br.edu.unifacear.projetointegrador3.entidade.Usuario;

public class TestarJPA {
	
	public static void main(String[] args) {
		
		Usuario u = new Usuario();
		u.setNome("Cleverson");
		
		//Carro c = new Carro();
		//c.setPlaca("AZI-3428");
		
		new UsuarioDao().inserir(u);		
		
		List<Usuario> usuarios = new UsuarioDao().listar();
		for (Usuario usuario : usuarios) {
			System.out.println(usuario.getNome());
		}
		
		
		
		
		
	}

}
