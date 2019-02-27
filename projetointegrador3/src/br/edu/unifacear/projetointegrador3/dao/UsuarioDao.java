package br.edu.unifacear.projetointegrador3.dao;

import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.edu.unifacear.projetointegrador3.entidade.Usuario;

public class UsuarioDao implements Dao<Usuario> {
	
	public void inserir(Usuario usuario) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(usuario);
		em.getTransaction().commit();
		em.close();		
	}
	
	public void alterar(Usuario usuario) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.merge(usuario);
		em.getTransaction().commit();
		em.close();	
	}
	
	@SuppressWarnings("unchecked")
	public List<Usuario> listar() {
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("select u from Usuario u");		
		List<Usuario> usuarios = q.getResultList();
		em.close();
		return usuarios;
	}

	public void excluir(Usuario usuario) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.remove(usuario);
		em.getTransaction().commit();
		em.close();	
	}

	@Override
	public List<Usuario> listarTodos(Class<Usuario> c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Usuario> listarWhere(Class<Usuario> c, String where, Map<String, Object> argumentos) {
		// TODO Auto-generated method stub
		return null;
	}
}