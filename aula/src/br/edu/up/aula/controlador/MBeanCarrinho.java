package br.edu.up.aula.controlador;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.edu.up.aula.entidade.ItemCarrinho;

@ManagedBean(name = "mBeanCarrinho")
@SessionScoped
public class MBeanCarrinho {

	private List<ItemCarrinho> itens = new ArrayList<ItemCarrinho>();

	public String adicionar(Long id) {
		ItemCarrinho item = new ItemCarrinho();
		item.setIdCliente(id);
		item.setQuantidade(1);
		itens.add(item);

		return "carrinho.jsf";
	}

	public List<ItemCarrinho> getItens() {
		return itens;
	}

	public void setItens(List<ItemCarrinho> itens) {
		this.itens = itens;
	}

}
