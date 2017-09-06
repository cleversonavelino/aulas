package br.edu.up.aula.controlador;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.edu.up.aula.dao.ClienteDao;
import br.edu.up.aula.dao.NewsLetterDao;
import br.edu.up.aula.entidade.Cliente;
import br.edu.up.aula.entidade.NewsLetter;

@ManagedBean(name = "mBeanCarrinho")
@SessionScoped
public class MBeanCarrinho {

	private List<Cliente> itens = new ArrayList<Cliente>();

	public String adicionar(Long id) {
		Cliente cliente = new ClienteDao().buscar(id);
		
		itens.add(cliente);

		return "carrinho.jsf";
	}
	
	public String salvar() {
		NewsLetter n = new NewsLetter();
		for (Cliente c : itens) {
			c.setNewsLetter(n);
		}
		n.setClientes(itens);
		
		new NewsLetterDao().atualizar(n);
		
		return "";
	}

	public List<Cliente> getItens() {
		return itens;
	}

	public void setItens(List<Cliente> itens) {
		this.itens = itens;
	}

	

}
