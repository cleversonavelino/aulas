package up.edu.br.sistemaacademico.dao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Conexao {

	private static EntityManagerFactory emf = Persistence.
			createEntityManagerFactory("sistemaacademico");
	
	
	public static EntityManagerFactory getInstance() {
		return emf;
	}
	
}
