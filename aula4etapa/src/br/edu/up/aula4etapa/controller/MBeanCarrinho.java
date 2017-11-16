package br.edu.up.aula4etapa.controller;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.edu.up.aula4etapa.dao.JogoDao;
import br.edu.up.aula4etapa.entity.Item;
import br.edu.up.aula4etapa.entity.Jogo;

@ManagedBean(name = "mBeanCarrinho")
@SessionScoped
public class MBeanCarrinho {
	
	private ArrayList<Item> itens = new ArrayList<Item>();
	
	public String adicionar(Integer idJogo) {
		Jogo jogo = new JogoDao().buscar(idJogo);
		
		Item item = new Item();
		item.setJogo(jogo);
		item.setQuantidade(1);
		
		itens.add(item);
		
		//FacesContext.getCurrentInstance().getExternalContext().redirect("telaCarrinhoDeCompras.jsf");
		
		return "telaCarrinhoDeCompras.jsf";
		
	}

	public ArrayList<Item> getItens() {
		return itens;
	}

	public void setItens(ArrayList<Item> itens) {
		this.itens = itens;
	}	

}
